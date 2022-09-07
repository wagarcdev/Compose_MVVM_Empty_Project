package com.wagarcdev.compose_mvvm_empty_project.presentation.screens.screen_main

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wagarcdev.compose_mvvm_empty_project.MainViewModel
import com.wagarcdev.compose_mvvm_empty_project.navigation.Screens

@Composable
fun MainScreenContent(
    mainViewModel: MainViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize(1.0f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Empty Compose MVVM Project")

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                mainViewModel.navHostController.navigate(
                    route = Screens.DetailScreen.name
                )
            }
        ) {
            Text(
                text = "See Detail Screen"
            )
        }
    }
}