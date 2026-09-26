package com.nillsmaillet.firepitapplication.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun FirepitSectionTitle(
    title: String
){
    Text(
        text = title,
        fontSize = 25.sp,
    )
}