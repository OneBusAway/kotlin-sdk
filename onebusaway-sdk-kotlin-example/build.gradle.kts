plugins {
    id("onebusaway-sdk.kotlin")
    application
}

dependencies {
    implementation(project(":onebusaway-sdk-kotlin-core"))
    implementation(project(":onebusaway-sdk-kotlin-client-okhttp"))
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
