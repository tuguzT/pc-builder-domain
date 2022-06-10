plugins {
    `maven-publish`
    kotlin("jvm") version "1.7.0"
    kotlin("plugin.serialization") version "1.7.0"
}

group = "io.github.tuguzt.pcbuilder.domain"

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()
}

dependencies {
    // Kotlin
    implementation(kotlin("stdlib-jdk8"))
    api("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")

    // Third-Party
    api("io.nacular.measured:measured:0.3.1")
    implementation("com.aventrix.jnanoid:jnanoid:2.0.0")

    // Testing
    testImplementation(kotlin("test"))
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-opt-in=kotlin.RequiresOptIn")
        }
    }
    test {
        useJUnitPlatform()
    }
}

publishing {
    publications {
        create<MavenPublication>("jitpack") {
            groupId = "com.github.tuguzT"
            artifactId = "pc-builder-domain"

            from(components["kotlin"])
        }
    }
}
