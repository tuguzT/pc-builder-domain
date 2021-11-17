@file:Suppress("GradlePackageUpdate")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm") version "1.6.0"
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

    // Third-Party
    api("io.nacular.measured:measured:0.3.0")
    api("com.aventrix.jnanoid:jnanoid:2.0.0")

    // Testing
    testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("jitpack") {
            groupId = "com.github.tuguzT"
            artifactId = "pc_builder_domain"

            from(components["kotlin"])
        }
    }
}
