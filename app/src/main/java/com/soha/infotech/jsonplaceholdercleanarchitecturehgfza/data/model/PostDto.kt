package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.model

/**
 * Step 4: Create Model Classes
 *
 * Data Layer Model
 */

data class PostDto(
    val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)