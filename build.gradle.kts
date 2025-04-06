plugins {
    kotlin("jvm") version "1.9.10"
}

group = "com.thiago"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
