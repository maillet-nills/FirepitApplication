package com.nillsmaillet.firepitapplication.ui.navigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

enum class Destination (
    val route: String,
    val label: String,
    val icon: ImageVector,
    val isInBottomBar: Boolean
) {
    HOME("home", "Home", Icons.Filled.Home, true),
    LIBRARY("library", "Library", Icons.Filled.Star, true),
    ADD_BOOK("add_book", "Add book", Icons.Filled.Add, false),
    JOURNAL("journal", "Journal", Icons.Filled.Edit, true),
    PROFILE("profile", "Profile", Icons.Filled.AccountCircle, true)
}