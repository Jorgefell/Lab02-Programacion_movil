@file:OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
package com.example.programacon_movil

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopAppBarSample() {
    TopAppBar(
        title = { Text("Mi App") },
        actions = {
            IconButton(onClick = { /* Acción aquí */ }) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorito"
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBarSample() {
    TopAppBarSample()
}
