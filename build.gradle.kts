plugins {
  `java-library`
  id("org.metaborg.gradle.config.root-project") version "0.4.7"
  id("org.metaborg.gitonium") version "0.1.5"
  id("org.metaborg.devenv.spoofax.gradle.langspec") version "0.1.34" apply false
}

val spoofax2Version: String = System.getProperty("spoofax2Version")
val spoofax2BaselineVersion: String = System.getProperty("spoofax2BaselineVersion")
val spoofax2DevenvVersion: String = System.getProperty("spoofax2DevenvVersion")
allprojects {
  apply(plugin = "java-library")

  group = "org.metaborg.devenv"
  ext["spoofax2Version"] = spoofax2Version
  ext["spoofax2BaselineVersion"] = spoofax2BaselineVersion
  ext["spoofax2DevenvVersion"] = spoofax2DevenvVersion

  java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11)) // Java 8 gives GC overhead limit exceeded
    withSourcesJar()
    withJavadocJar()
  }

  tasks.withType<JavaCompile>{
    options.encoding = "UTF-8"
    options.compilerArgs = options.compilerArgs + listOf("-Xdoclint:none")
  }

  tasks.withType<Javadoc>{
    options{
      this as CoreJavadocOptions
      addStringOption("Xdoclint:none","-quiet")
      encoding = "UTF-8"
      quiet()
      charset("UTF-8")
    }
  }

  // Use the org.metaborg:*:2.6.0-SNAPSHOT dependencies instead of the Spoofax 3 dependencies
  configurations.all {
    resolutionStrategy.eachDependency {
      if (requested.group == "org.metaborg.devenv") {
        useTarget("org.metaborg:${requested.name}:${spoofax2Version}")
      }
    }
  }
}

subprojects {
  metaborg {
    configureSubProject()
  }
}
