import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
}

group = "io.github.tuguzt.pcbuilder.domain"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
    explicitApi()
}

dependencies {
    // Kotlin
    implementation(kotlin("stdlib-jdk8"))
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")

    // Third-Party
    api("io.nacular.measured:measured:0.3.1")
    implementation("com.aventrix.jnanoid:jnanoid:2.0.0")

    // Testing
    testImplementation(kotlin("test"))
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-opt-in=kotlin.RequiresOptIn")
        }
    }

    withType<Test> {
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
