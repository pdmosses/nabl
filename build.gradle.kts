plugins {
  id("org.metaborg.gradle.config.root-project") version "0.4.7"
  id("org.metaborg.gitonium") version "0.1.5"
  id("org.metaborg.devenv.spoofax.gradle.langspec") version "0.1.32" apply false
}

val spoofax2Version: String = System.getProperty("spoofax2Version")
val spoofax2BaselineVersion: String = System.getProperty("spoofax2BaselineVersion")
val spoofax2DevenvVersion: String = System.getProperty("spoofax2DevenvVersion")
allprojects {
  group = "org.metaborg.devenv"
  ext["spoofax2Version"] = spoofax2Version
  ext["spoofax2BaselineVersion"] = spoofax2BaselineVersion
  ext["spoofax2DevenvVersion"] = spoofax2DevenvVersion

  java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
    withSourcesJar()
    withJavadocJar()
  }

}

subprojects {
  metaborg {
    configureSubProject()
  }
}