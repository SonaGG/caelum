plugins {
    id("buildsrc.convention.kotlin-jvm")
}

repositories {
    maven("https://maven.endoqa.io/")
}

dependencies {
    api(project(":codegen-c:tree-sitter-lang-c"))
}