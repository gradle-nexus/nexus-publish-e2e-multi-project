pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

rootProject.name = "nexus-publish-e2e-multi-project"

include("subproject1", "subproject2")
