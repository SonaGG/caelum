plugins {
    id("buildsrc.convention.codegen")
}

repositories {
    maven("https://maven.endoqa.io/")
}

dependencies {
    implementation(project(":codegen-c:adapter"))
}