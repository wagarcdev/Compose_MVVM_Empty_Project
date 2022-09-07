package com.wagarcdev.compose_mvvm_empty_project.data

import com.wagarcdev.compose_mvvm_empty_project.data.local.AppDatabaseDAO
import com.wagarcdev.compose_mvvm_empty_project.domain.model.MyObject
import com.wagarcdev.compose_mvvm_empty_project.domain.repository.AppRepository

class AppRepositoryImplementation(
    private val dao: AppDatabaseDAO
): AppRepository {

    override suspend fun addMyObject(myObject: MyObject): Long {
        return dao.addMyObject(myObject)
    }

    override suspend fun getMyObjectById(myObjectId: Long): MyObject {
        return dao.getMyObjectById(myObjectId)
    }

    override suspend fun updateMyObject(myObject: MyObject) = dao.updateMyObject(myObject)


    override suspend fun getAllMyObjects(): List<MyObject> = dao.getAllMyObjects()


    override suspend fun deleteAllMyObjects() = dao.deleteAllMyObjects()

}