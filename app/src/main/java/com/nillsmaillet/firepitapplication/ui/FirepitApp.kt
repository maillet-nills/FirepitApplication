package com.nillsmaillet.firepitapplication.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nillsmaillet.firepitapplication.ui.navigation.Destination

@Composable
fun FirepitApp (){
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar() {
                Destination.entries.forEach { destination ->
                    NavigationBarItem(
                        selected = false,
                        onClick = {},
                        icon = { Icon(destination.icon, contentDescription = destination.label) },
                        label = { Text(destination.label) }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Destination.LIBRARY.route,
            modifier = Modifier.padding(innerPadding)
        ){
            composable (Destination.LIBRARY.route){ PlaceholderScreen(Destination.LIBRARY.label)}
            composable (Destination.JOURNAL.route){ PlaceholderScreen(Destination.JOURNAL.label)}
            composable (Destination.STATS.route){ PlaceholderScreen(Destination.STATS.label)}
            composable (Destination.SETTINGS.route){ PlaceholderScreen(Destination.SETTINGS.label)}
        }
    }
}