package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils

/**
 * Step 7: Create Sealed Class for Result Handling
 */

sealed class Resource<out T> {
    object Loading : Resource<Nothing>()
    data class Success<T>(val data: T) : Resource<T>()
    data class Error(val message: String) : Resource<Nothing>()
}
