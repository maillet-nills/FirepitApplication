package com.nillsmaillet.firepitapplication.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirepitHomeCard(){
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,

            disabledContainerColor = MaterialTheme.colorScheme.surface,
            disabledContentColor = MaterialTheme.colorScheme.onSurface
        )
    ) {
        Column(
            modifier = Modifier.padding(20.dp).fillMaxWidth()
        ) {
            Text(
                text = "Insert Book Title",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.primary
            )

            Row() {
                // Book Cover Image (Missing)


                // Book Synopsis
                Column() {
                    Text(
                        text = "Insert book description. Lorem ipsum. This book is about an exciting adventure.",
                        textAlign = TextAlign.Justify,
                    )

                    Button(
                        onClick = {},
                        colors = ButtonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onBackground,

                            disabledContainerColor = MaterialTheme.colorScheme.primary,
                            disabledContentColor = MaterialTheme.colorScheme.onBackground
                        ),
                        shape = RoundedCornerShape(14.dp),

                    ) {
                        Text(
                            text = "View"
                        )
                    }
                }

            }
        }
    }
}