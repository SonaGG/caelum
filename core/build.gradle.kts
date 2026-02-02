plugins {
    id("buildsrc.convention.published-module")
    id("gg.sona.ktgen")
}

dependencies {
    ktgen(project("codegen"))
}

kotlin {
    explicitApi()
}

dependencies {
    extraJarEntries(rootProject.files("README.md"))
}