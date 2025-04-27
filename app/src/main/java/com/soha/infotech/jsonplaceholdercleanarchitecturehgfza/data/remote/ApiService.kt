package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.remote

import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.model.PostDto
import retrofit2.http.GET

/**
 * Step 5: Create Retrofit API Service
 */

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<PostDto>
}