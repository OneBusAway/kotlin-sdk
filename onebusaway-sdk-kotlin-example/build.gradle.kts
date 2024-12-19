plugins {
    id("onebusaway-sdk.kotlin")
    application
}

dependencies {
    implementation(project(":onebusaway-sdk-kotlin"))
}

application {
    mainClass = "org.onebusaway.example.MainKt"
}
