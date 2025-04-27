package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.repository

import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.mapper.toDomain
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.remote.ApiService
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.model.Post
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.repository.PostRepository
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.Resource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Step 9:  Implement Repository
 */

@Singleton
class PostRepositoryImpl @Inject constructor(private val apiService: ApiService) : PostRepository {
    override suspend fun getPosts(): Resource<List<Post>> {
        return try {
            val response = apiService.getPosts()
            Resource.Success(response.map { it.toDomain() })
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred")
        }

    }
}