@file:OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
package com.example.programacon_movil

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopAppBarSample() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Versión del compañero A",
                style = MaterialTheme.typography.headlineSmall
            )
        },
        navigationIcon = {
            IconButton(onClick = { /* abrir home */ }) {
                Icon(Icons.Filled.Home, contentDescription = "Inicio")
            }
        },
        actions = {
            IconButton(onClick = { /* abrir configuración */ }) {
                Icon(Icons.Filled.Settings, contentDescription = "Configuración")
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            titleContentColor = MaterialTheme.colorScheme.onSecondary,
            actionIconContentColor = MaterialTheme.colorScheme.onSecondary
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBarSample_A() {
    TopAppBarSample()
}
