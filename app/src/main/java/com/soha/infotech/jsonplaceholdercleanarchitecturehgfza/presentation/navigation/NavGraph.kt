package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.screens.PostListScreen
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.PostViewModel

/**
 * Step 13: Add Navigation
 */

@Composable
fun AppNavHost(navController: NavHostController, viewModel: PostViewModel) {
    NavHost(navController, startDestination = "postList") {
        composable("postList") { PostListScreen(viewModel) }
    }
}
