package com.nillsmaillet.firepitapplication.ui

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nillsmaillet.firepitapplication.ui.navigation.Destination
import com.nillsmaillet.firepitapplication.ui.navigation.FirepitNavigationBar
import com.nillsmaillet.firepitapplication.ui.screens.FirepitHomeScreen

@Composable
fun FirepitApp (){
    val navController = rememberNavController()

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        bottomBar = {
            FirepitNavigationBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Destination.HOME.route,
            modifier = Modifier.padding(innerPadding),
            enterTransition = {
                fadeIn(animationSpec = tween(100))
            },
            exitTransition = {
                fadeOut(animationSpec = tween(100))
            }
        ){
            composable (Destination.HOME.route){ FirepitHomeScreen(Destination.HOME.label)}
            composable (Destination.LIBRARY.route){ PlaceholderScreen(Destination.LIBRARY.label)}
            composable (Destination.JOURNAL.route){ PlaceholderScreen(Destination.JOURNAL.label)}
            composable (Destination.PROFILE.route){ PlaceholderScreen(Destination.PROFILE.label)}
        }
    }
}