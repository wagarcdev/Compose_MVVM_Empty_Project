package com.wagarcdev.compose_mvvm_empty_project.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wagarcdev.compose_mvvm_empty_project.domain.model.MyObject

@Database(
    entities = [MyObject::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {

    abstract val dao: AppDatabaseDAO

}