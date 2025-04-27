package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.repository

import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.model.Post
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.Resource

/**
 * Step 8: Create Repository Interface
 */

interface PostRepository {
    suspend fun getPosts(): Resource<List<Post>>
}
