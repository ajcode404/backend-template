plugins {
    application
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(libs.guava)
}

tasks.test {
    useJUnitPlatform()
}
application {
    mainClass = "io.github.ajcode404.MainKt"
}