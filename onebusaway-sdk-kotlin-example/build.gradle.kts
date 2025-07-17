plugins {
    id("onebusaway-sdk.kotlin")
    application
}

dependencies {
    implementation(project(":onebusaway-sdk-kotlin"))
}

application {
    // Use `./gradlew :onebusaway-sdk-kotlin-example:run` to run `Main`
    // Use `./gradlew :onebusaway-sdk-kotlin-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "org.onebusaway.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
