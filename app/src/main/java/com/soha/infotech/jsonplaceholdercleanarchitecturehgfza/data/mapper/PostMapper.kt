package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.mapper

import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.model.PostDto
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.model.Post

/**
 * Step 8: Create a Mapper
 *
 * Create an extension function to map PostDto to Post
 */

fun PostDto.toDomain(): Post {
    return Post(
        id = this.id,
        title = this.title,
        body = this.body
    )
}