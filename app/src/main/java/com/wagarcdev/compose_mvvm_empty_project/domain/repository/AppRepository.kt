package com.wagarcdev.compose_mvvm_empty_project.domain.repository

import com.wagarcdev.compose_mvvm_empty_project.domain.model.MyObject
import com.wagarcdev.compose_mvvm_empty_project.utils.Resource
import kotlinx.coroutines.flow.Flow

interface AppRepository {

    suspend fun addMyObject(myObject: MyObject): Long?

    suspend fun updateMyObject(myObject: MyObject)

    suspend fun getMyObjectById(myObjectId: Long): MyObject

    suspend fun getAllMyObjects(): List<MyObject>

    suspend fun deleteAllMyObjects()
}