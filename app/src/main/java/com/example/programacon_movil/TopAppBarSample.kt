@file:OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
package com.example.programacon_movil

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
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
                text = "Versión combinada A + B",
                style = MaterialTheme.typography.headlineSmall
            )
        },
        navigationIcon = {
            IconButton(onClick = { /* abrir home o perfil */ }) {
                Icon(Icons.Filled.Home, contentDescription = "Inicio")
                Icon(Icons.Filled.AccountCircle, contentDescription = "Perfil")
            }
        },
        actions = {
            IconButton(onClick = { /* abrir configuración */ }) {
                Icon(Icons.Filled.Settings, contentDescription = "Configuración")
            }
            IconButton(onClick = { /* abrir notificaciones */ }) {
                Icon(Icons.Filled.Notifications, contentDescription = "Notificaciones")
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBarSample() {
    TopAppBarSample()
}
