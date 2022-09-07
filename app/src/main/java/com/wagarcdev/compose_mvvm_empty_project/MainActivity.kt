package com.wagarcdev.compose_mvvm_empty_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.wagarcdev.compose_mvvm_empty_project.navigation.AppNavigation
import com.wagarcdev.compose_mvvm_empty_project.presentation.ui.theme.Compose_MVVM_Empty_ProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            setKeepOnScreenCondition { mainViewModel.isLoading.value }
        }

        setContent {
            Compose_MVVM_Empty_ProjectTheme {

                AppNavigation()

            }
        }
    }
}
