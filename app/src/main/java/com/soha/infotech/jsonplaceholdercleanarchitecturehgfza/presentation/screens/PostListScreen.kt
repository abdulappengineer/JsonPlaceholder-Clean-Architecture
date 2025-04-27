package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.PostViewModel
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.Resource

/**
 * Step 12: Create PostListScreen.kt
 */

@Composable
fun PostListScreen(viewModel: PostViewModel = hiltViewModel()) {
    val postsState = viewModel.posts.collectAsState()

    Box(modifier = Modifier.fillMaxSize()) {
        when (val posts = postsState.value) {
            is Resource.Loading -> {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
            is Resource.Success -> {
                LazyColumn {
                    items(posts.data) { post ->
                        Text(text = post.title, modifier = Modifier.padding(16.dp))
                    }
                }
            }
            is Resource.Error -> {
                Text(
                    text = posts.message,
                    color = Color.Red,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}
