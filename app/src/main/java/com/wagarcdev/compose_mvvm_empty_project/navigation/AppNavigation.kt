package com.wagarcdev.compose_mvvm_empty_project.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wagarcdev.compose_mvvm_empty_project.MainViewModel
import com.wagarcdev.compose_mvvm_empty_project.presentation.screens.screen_detail.DetailScreen
import com.wagarcdev.compose_mvvm_empty_project.presentation.screens.screen_main.MainScreen

@Composable
fun AppNavigation() {

    val mainViewModel: MainViewModel = hiltViewModel()

    mainViewModel.navHostController = rememberNavController()

    NavHost(
        startDestination = Screens.MainScreen.name,
        navController = mainViewModel.navHostController
    ) {

        /** MainScreen */
        composable(Screens.MainScreen.name){
            MainScreen(mainViewModel)
        }

        /** DetailScreen */
        composable(Screens.DetailScreen.name){
            DetailScreen(mainViewModel)
        }
    }

}
