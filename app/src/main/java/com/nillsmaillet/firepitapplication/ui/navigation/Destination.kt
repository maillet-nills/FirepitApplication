package com.nillsmaillet.firepitapplication.ui.navigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class Destination (
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    LIBRARY("library", "Library", Icons.Filled.Home),
    JOURNAL("journal", "Journal", Icons.Filled.Edit),
    STATS("stats", "Statistics", Icons.Filled.Info),
    SETTINGS("settings", "Settings", Icons.Filled.Settings)
}