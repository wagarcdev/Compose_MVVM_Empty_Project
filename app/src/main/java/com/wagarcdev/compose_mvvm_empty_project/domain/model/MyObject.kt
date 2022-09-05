package com.wagarcdev.compose_mvvm_empty_project.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyObject(

    @PrimaryKey
    val id: Long? = null,

    val name: String? = null,
    val time: Int? = null
)