plugins {
    kotlin("jvm")
}

group = "org.onebusaway.example"
version = "0.0.1-alpha.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":onebusaway-sdk-kotlin"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    // Use `./gradlew :onebusaway-sdk-kotlin-example:run` to run `Main`
    // Use `./gradlew :onebusaway-sdk-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "org.onebusaway.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}

tasks.test {
    useJUnitPlatform()
}
