plugins {
    id("onebusaway-sdk.kotlin")
    id("onebusaway-sdk.publish")
}

dependencies {
    api(project(":onebusaway-sdk-kotlin-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.12")
}