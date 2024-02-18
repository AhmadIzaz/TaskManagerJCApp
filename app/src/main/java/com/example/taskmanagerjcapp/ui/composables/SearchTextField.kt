package com.example.taskmanagerjcapp.ui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(onSearchChanged: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier
            .padding(bottom = 15.dp, end = 10.dp, start = 10.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(size = 5.dp)),
        value = "",
        placeholder = { Text(text = "Search here") },
        onValueChange = {})
}