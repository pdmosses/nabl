plugins {
  id("org.metaborg.gradle.config.java-library")
  id("org.metaborg.gradle.config.junit-testing")
}

val spoofax2Version: String by ext
val spoofax2DevenvVersion: String by ext
dependencies {
  api(platform("org.metaborg:parent:$spoofax2Version"))
  testImplementation(platform("org.metaborg:parent:$spoofax2Version"))
  annotationProcessor(platform("org.metaborg:parent:$spoofax2Version"))
  testAnnotationProcessor(platform("org.metaborg:parent:$spoofax2Version"))

  // !! Update dependencies in pom.xml as well

  api("org.metaborg:org.metaborg.util:$spoofax2Version") // API to expose logger framework.
  api("org.metaborg:org.spoofax.terms:$spoofax2Version")
  api("org.metaborg:org.spoofax.interpreter.core:$spoofax2Version")
  api(project(":nabl2.terms"))
  api(project(":scopegraph"))
  api(project(":p_raffrayi"))
  api("io.usethesource:capsule")
  compileOnly("com.google.code.findbugs:jsr305")

  // Annotation processing
  annotationProcessor("org.immutables:value")
  annotationProcessor("org.immutables:serial")
  compileOnly("org.immutables:value")
  compileOnly("org.immutables:serial")
  compileOnly("javax.annotation:javax.annotation-api")
  compileOnly("javax.inject:javax.inject:1")

  // Tests
  testImplementation("junit:junit")
  testRuntimeOnly("org.junit.vintage:junit-vintage-engine")
  testImplementation("ch.qos.logback:logback-classic")
  testCompileOnly("com.google.code.findbugs:jsr305")

  // Test Annotation processing
  testAnnotationProcessor("org.immutables:value")
  testAnnotationProcessor("org.immutables:serial")
  testCompileOnly("org.immutables:value")
  testCompileOnly("org.immutables:serial")
  testCompileOnly("javax.annotation:javax.annotation-api")

  // !! Update dependencies in pom.xml as well
}

// Ugh, need to encode sourcesJar due to multiple gradle.config plugins
metaborg {
  javaCreateSourcesJar = false
}

tasks {
  sourcesJar {
    dependsOn("classes")
    from(sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME).allJava)
    archiveClassifier.set("sources")
  }
  assemble {
    dependsOn("sourcesJar")
  }
}

artifacts {
  add(Dependency.DEFAULT_CONFIGURATION, tasks.getByName("sourcesJar"))
}

// Copy test resources into classes directory, to make them accessible as classloader resources at runtime.
val copyTestResourcesTask = tasks.create<Copy>("copyTestResources") {
  from("$projectDir/src/test/resources")
  into("$buildDir/classes/java/test")
}
tasks.getByName("processTestResources").dependsOn(copyTestResourcesTask)
