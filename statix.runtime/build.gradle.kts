plugins {
  id("org.metaborg.gradle.config.java-library")
  id("org.metaborg.devenv.spoofax.gradle.langspec")
  `maven-publish`
}

val spoofax2Version: String by ext
fun compositeBuild(name: String) = "$group:$name:$version"

spoofaxLanguageSpecification {
  addSourceDependenciesFromMetaborgYaml.set(false)
}
dependencies {
  sourceLanguage(compositeBuild("meta.lib.spoofax"))
}

metaborg { // Do not create Java publication; this project is already published as a Spoofax 2 language.
  javaCreatePublication = false
  javaCreateSourcesJar = false
  javaCreateJavadocJar = false
}
