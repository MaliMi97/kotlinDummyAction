plugins {
    kotlin("jvm") version "1.5.21"
    application
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

apply(plugin = "application")
apply(plugin = "kotlin")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class).all {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        languageVersion = org.jetbrains.kotlin.config.LanguageVersion.LATEST_STABLE.versionString
    }
}

application.mainClassName = "com.dummy.MainKt"

//val jar by tasks.getting(Jar::class) {
//    manifest {
//        attributes["Main-Class"] = "MainKt"
//    }
//}