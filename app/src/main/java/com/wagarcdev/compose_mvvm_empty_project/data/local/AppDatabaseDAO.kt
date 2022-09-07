package com.wagarcdev.compose_mvvm_empty_project.data.local

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.wagarcdev.compose_mvvm_empty_project.domain.model.MyObject
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDatabaseDAO {

    @Insert(onConflict = REPLACE)
    fun addMyObject(myObject: MyObject): Long

    @Update
    fun updateMyObject(myObject: MyObject)

    @Query("SELECT * from my_object_tbl")
    fun getAllMyObjects(): List<MyObject>

    @Query("SELECT * from my_object_tbl where id=:id")
    fun getMyObjectById(id: Long): MyObject

    @Query("DELETE  from my_object_tbl where id=:id")
    fun deleteMyObjectById(id: Long)

    @Query("DELETE from my_object_tbl")
    fun deleteAllMyObjects()

}