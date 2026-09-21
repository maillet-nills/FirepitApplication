package com.nillsmaillet.firepitapplication.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nillsmaillet.firepitapplication.ui.navigation.Destination

@Composable
fun FirepitApp (){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destination.LIBRARY.route,
    ){
        composable (Destination.LIBRARY.route){ PlaceholderScreen(Destination.LIBRARY.label)}
        composable (Destination.JOURNAL.route){ PlaceholderScreen(Destination.JOURNAL.label)}
        composable (Destination.STATS.route){ PlaceholderScreen(Destination.STATS.label)}
        composable (Destination.SETTINGS.route){ PlaceholderScreen(Destination.SETTINGS.label)}
    }
}