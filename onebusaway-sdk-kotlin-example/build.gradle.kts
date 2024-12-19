plugins {
    id("onebusaway-sdk.kotlin")
    application
}


application {
    mainClass = "org.onebusaway.example.MainKt"
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

tasks.test {
    useJUnitPlatform()
}
