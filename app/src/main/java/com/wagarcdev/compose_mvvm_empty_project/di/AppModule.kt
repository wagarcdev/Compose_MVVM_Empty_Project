package com.wagarcdev.compose_mvvm_empty_project.di

import android.app.Application
import androidx.room.Room
import com.wagarcdev.compose_mvvm_empty_project.data.AppRepositoryImplementation
import com.wagarcdev.compose_mvvm_empty_project.data.local.AppDatabase
import com.wagarcdev.compose_mvvm_empty_project.data.local.AppDatabaseDAO
import com.wagarcdev.compose_mvvm_empty_project.data.remote.ApplicationAPI
import com.wagarcdev.compose_mvvm_empty_project.domain.repository.AppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.gotev.cookiestore.okhttp.JavaNetCookieJar
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.CookieManager
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAppDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            "app_database.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideAppDAO(appDatabase: AppDatabase): AppDatabaseDAO = appDatabase.dao

    @Singleton
    @Provides
    fun provideApi(): ApplicationAPI {

        return Retrofit.Builder()
            .build()
            .create(ApplicationAPI::class.java)
    }
}