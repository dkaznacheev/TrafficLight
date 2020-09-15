import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    id("org.openjfx.javafxplugin") version("0.0.5")
}

group = "me.dkaznacheev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

javafx {
    version = "11.0.2"
    modules = listOf("javafx.controls", "javafx.graphics")
}

dependencies {
    implementation("no.tornado:tornadofx:1.7.20")
    testImplementation(kotlin("test-junit"))
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}