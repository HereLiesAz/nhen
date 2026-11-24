pluginManagement {
  repositories {
    google {
      content {
        includeGroupByRegex("com\\.android.*")
        includeGroupByRegex("com\\.google.*")
        includeGroupByRegex("androidx.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    maven("https://raw.githubusercontent.com/HereLiesAz/AzNavRail/update-maven/") {
      content { includeModule("com.github.HereLiesAz.AzNavRail", "aznavrail-updates-compat") }
    }
    google()
    mavenCentral()
  }
}

rootProject.name = "nhen"
include(":app")