package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.PostViewModel
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.presentation.navigation.AppNavHost
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.ui.theme.JsonPlaceholderCleanArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Step 14: Set Up MainActivity.kt
 */

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: PostViewModel by viewModels() // Hilt Injected ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            AppNavHost(navController, viewModel)
        }
    }
}
