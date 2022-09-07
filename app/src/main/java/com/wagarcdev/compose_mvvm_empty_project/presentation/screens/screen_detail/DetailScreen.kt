package com.wagarcdev.compose_mvvm_empty_project.presentation.screens.screen_detail

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.wagarcdev.compose_mvvm_empty_project.MainViewModel


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailScreen(
    mainViewModel: MainViewModel
) {

    Scaffold(
        topBar = {  },
        content = { DetailScreenContent(mainViewModel) }
    )

}

