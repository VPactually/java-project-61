plugins {
    id("java")
    id("application")
    checkstyle

}

tasks.withType<JavaCompile> {
    options.release = 20
}

application {
    mainClass.set("hexlet.code.App")

}
group = "hexlet.code"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()

}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.commons:commons-lang3:3.13.0")

}

tasks.test {
    useJUnitPlatform()

}
