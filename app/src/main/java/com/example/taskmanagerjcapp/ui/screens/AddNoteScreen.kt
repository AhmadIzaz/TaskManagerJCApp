package com.example.taskmanagerjcapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddNoteScreen() {

    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
            textStyle = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold),
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = Color.Black, // Customize cursor color if needed
                focusedIndicatorColor = Color.Transparent, // Hide the indicator when focused
                unfocusedIndicatorColor = Color.Transparent, // Hide the indicator when unfocused
                disabledIndicatorColor = Color.Transparent // Hide the indicator when disabled
            ),
            value = title,
            onValueChange = { title = it },
            placeholder = {
                Text(
                    text = "Title here",
                    style = TextStyle(fontSize = 35.sp)
                )
            })

        Divider(
            color = Color.Black,
            thickness = 1.dp
        )

        TextField(modifier = Modifier.fillMaxSize(),
            textStyle = TextStyle(fontSize = 26.sp, fontWeight = FontWeight.Normal),
            value = description,
            onValueChange = { description = it },
            placeholder = { Text(text = "Description here") })

    }
}