package com.wagarcdev.compose_mvvm_empty_project.presentation.screens.screen_main

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.wagarcdev.compose_mvvm_empty_project.MainViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(
    mainViewModel: MainViewModel
) {

    Scaffold(
        topBar = {  },
        content = { MainScreenContent(mainViewModel) }
    )

}

