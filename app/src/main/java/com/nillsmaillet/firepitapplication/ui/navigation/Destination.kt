package com.nillsmaillet.firepitapplication.ui.navigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

enum class Destination (
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    HOME("home", "Home", Icons.Filled.Home),
    LIBRARY("library", "Library", Icons.Filled.Star),
    JOURNAL("journal", "Journal", Icons.Filled.Edit),
    PROFILE("profile", "Profile", Icons.Filled.AccountCircle)
}