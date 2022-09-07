package com.wagarcdev.compose_mvvm_empty_project.navigation

enum class Screens {

    MainScreen,
    DetailScreen;

    companion object {
        fun fromRoute(route: String?): Screens
        = when (route?.substringBefore("/")) {
            MainScreen.name -> MainScreen
            DetailScreen.name -> DetailScreen
            null -> MainScreen
            else -> throw IllegalArgumentException("Route $route was not recognized")
        }
    }
}