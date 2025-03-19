plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "org.onebusaway"
    version = "0.1.0-alpha.66" // x-release-please-version
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaHtmlCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaHtmlCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "onebusaway-sdk-kotlin" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}
