plugins {
    id("java")
    application
}

tasks.withType<JavaCompile> {
    options.release = 20
}

application {
    mainClass.set("src/main/java/hexlet/code/App.java")

}
group = "hexlet.code"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()

}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()

}

