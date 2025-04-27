package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.model.Post
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.usecase.GetPostsUseCase
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Step 11: Create ViewModel
 */

@HiltViewModel
class PostViewModel @Inject constructor(
    private val getPostsUseCase: GetPostsUseCase
) : ViewModel() {

    private val _posts = MutableStateFlow<Resource<List<Post>>>(Resource.Loading)
    val posts: StateFlow<Resource<List<Post>>> = _posts

    init {
        fetchPosts()
    }

    private fun fetchPosts() {
        viewModelScope.launch {
            _posts.value = getPostsUseCase()
        }
    }
}
