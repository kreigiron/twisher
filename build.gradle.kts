/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    val quarkusVersion = "0.15.0"
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm").version("1.3.21")

    // Apply the application plugin to add support for building a CLI application.
    java
    maven
    id("io.quarkus") version quarkusVersion
}


repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    mavenCentral()
    jcenter()
}

dependencies {
    val quarkusVersion = "0.15.0"
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    testImplementation("io.quarkus:quarkus-junit5:$quarkusVersion")
    testCompile("org.mockito:mockito-core:+")

    implementation(enforcedPlatform("io.quarkus:quarkus-bom:$quarkusVersion"))
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-resteasy")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

}

quarkus {
    setSourceDir("src/main/kotlin")
    resourcesDir().add(File("src/main/resources"))
    setOutputDirectory("build/classes/kotlin/main")
}
