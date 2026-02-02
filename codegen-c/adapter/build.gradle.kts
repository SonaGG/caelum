plugins {
    id("buildsrc.convention.kotlin-jvm")
}

repositories {
    maven("https://maven.endoqa.io/")
}

dependencies {
    api(project(":codegen-c:c-ast"))
}