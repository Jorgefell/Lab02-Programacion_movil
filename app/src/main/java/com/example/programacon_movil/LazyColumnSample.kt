package com.example.programacon_movil

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LazyColumnSample() {
    val itemsList = (1..10).map { "Elemento $it" }
    LazyColumn {
        items(itemsList) { item ->
            Text(
                text = item,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLazyColumnSample() {
    LazyColumnSample()
}