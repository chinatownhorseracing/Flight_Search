package com.example.flightsearch

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FlightSearchApp(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        SearchField()
        SearchButton()
    }
}

@Composable
fun SearchField(
    modifier: Modifier = Modifier
) {
    var text by remember { mutableStateOf("") }

    TextField(
       value = text,
        onValueChange = { currentValue ->
            text = currentValue
        }
    )
}

@Composable
fun SearchButton() {
    IconButton(
        onClick = {}
    ) {
        Icon(
            Icons.Filled.Search,
            null
        )
    }
}