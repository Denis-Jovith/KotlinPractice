plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.9")
    implementation("io.ktor:ktor-server-cio:2.3.9")
    implementation("io.ktor:ktor-server-html-builder:2.3.9")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:2.0.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:2.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.9.1")
    implementation("io.ktor:ktor-server-host-common-jvm:2.3.9")
    implementation("io.ktor:ktor-http-cio-jvm:2.3.9")
    implementation("io.ktor:ktor-websockets-jvm:2.3.9")
    implementation("io.ktor:ktor-network-jvm:2.3.9")
    implementation("io.ktor:ktor-serialization-jvm:2.3.9")
    implementation("io.ktor:ktor-events-jvm:2.3.9")
    implementation("io.ktor:ktor-http-jvm:2.3.9")
    implementation("io.ktor:ktor-utils-jvm:2.3.9")
    implementation("io.ktor:ktor-io-jvm:2.3.9")
    implementation("org.fusesource.jansi:jansi:2.4.1")
    implementation("ch.qos.logback:logback-classic:1.2.11")  // SLF4J logback binding
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
