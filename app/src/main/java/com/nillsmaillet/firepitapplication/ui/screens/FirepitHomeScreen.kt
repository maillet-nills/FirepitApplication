package com.nillsmaillet.firepitapplication.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nillsmaillet.firepitapplication.ui.components.FirepitHomeCard
import com.nillsmaillet.firepitapplication.ui.components.FirepitSectionTitle

@Composable
fun FirepitHomeScreen(title: String){
    val spacer = Modifier.height(20.dp)

    Column(
        modifier = Modifier.padding(horizontal = 35.dp, vertical = 40.dp)
    ) {
        FirepitSectionTitle("Welcome Dear User !")

        Spacer(modifier = spacer)

        FirepitHomeCard()

        Spacer(modifier = spacer)

    }
}
