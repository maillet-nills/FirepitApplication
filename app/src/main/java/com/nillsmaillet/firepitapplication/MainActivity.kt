package com.nillsmaillet.firepitapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nillsmaillet.firepitapplication.ui.FirepitApp
import com.nillsmaillet.firepitapplication.ui.theme.FirepitApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirepitApplicationTheme {
                FirepitApp()
            }
        }
    }
}