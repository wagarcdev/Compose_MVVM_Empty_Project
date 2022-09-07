package com.wagarcdev.compose_mvvm_empty_project.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wagarcdev.compose_mvvm_empty_project.MainViewModel
import com.wagarcdev.compose_mvvm_empty_project.navigation.Screens


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailScreen(
    mainViewModel: MainViewModel
) {

    Scaffold(
        topBar = {  },
        content = {
            DetailScreenContent(mainViewModel)
        }
    )

}

@Composable
fun DetailScreenContent(
    mainViewModel: MainViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize(1.0f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "" +
                "WRITE ABOUT" +
                "")

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { mainViewModel.navHostController.navigate(route = Screens.MainScreen.name) }
        ) {

        }
    }
}
