import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.brendan"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}