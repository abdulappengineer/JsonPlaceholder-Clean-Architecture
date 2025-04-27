package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.usecase

import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.model.Post
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.repository.PostRepository
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.Resource
import javax.inject.Inject

/**
 * Step 10: Create Use Case
 */

class GetPostsUseCase @Inject constructor(private val repository: PostRepository) {
    suspend operator fun invoke(): Resource<List<Post>> {
        return repository.getPosts()
    }
}
