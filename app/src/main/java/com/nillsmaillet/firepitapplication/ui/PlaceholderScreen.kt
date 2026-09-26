package com.nillsmaillet.firepitapplication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nillsmaillet.firepitapplication.ui.components.FirepitSectionTitle

@Composable
fun PlaceholderScreen(title: String) {
    Column(
        modifier = Modifier.padding(horizontal = 35.dp, vertical = 40.dp),
    ) {
        FirepitSectionTitle("Welcome !")
    }
}

@Preview(showBackground = true)
@Composable
private fun PlaceholderScreenPreview() {
    PlaceholderScreen(title = "Bibliothèque")
}