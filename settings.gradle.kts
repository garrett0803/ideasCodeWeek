pluginManagement {
    repositories {
        gradlePluginPortal()
        maven{
            url = uri("https://mvnrepository.com/artifact/com.atlassian.jira/jira-api")
        }
    }
}

rootProject.name = "atlassian"