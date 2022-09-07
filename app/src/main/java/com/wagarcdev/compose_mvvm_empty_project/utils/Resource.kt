package com.wagarcdev.compose_mvvm_empty_project.utils

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T): Resource<T>(data)
    class Loading<T>(data: T): Resource<T>()
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
}
