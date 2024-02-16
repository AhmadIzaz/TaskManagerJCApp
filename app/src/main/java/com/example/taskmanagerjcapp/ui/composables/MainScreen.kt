package com.example.taskmanagerjcapp.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.taskmanagerjcapp.model.Task
import com.example.taskmanagerjcapp.model.dummyTaskList
import com.example.taskmanagerjcapp.ui.theme.Typography

@Composable
fun MainScreen() {
    Box {
        Column(
            modifier = Modifier.padding(top = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                modifier = Modifier.padding(bottom = 15.dp),
                value = "Search Bar",
                onValueChange = {})
            LazyColumn {
                items(dummyTaskList) { task ->
                    TaskItem(task = task)
                }
            }
        }
    }
}

@Composable
fun TaskItem(task: Task) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(10.dp)
    ) {
        Column(modifier = Modifier.padding(15.dp)) {
            Text(text = task.name, style = Typography.titleLarge)
            task.notes.takeIf { it?.isNotEmpty() == true }
                ?.let { Text(modifier = Modifier.padding(top = 10.dp), text = it) }
        }
    }
}

@Composable
fun SearchTextField(onSearchChanged: (String) -> Unit) {
    var searchText by remember { mutableStateOf(TextFieldValue()) }

    /*BasicTextField(
        value = searchText,
        onValueChange = { it ->
            searchText = it
            onSearchChanged(it.text)
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color.Gray),
        textStyle = MaterialTheme.typography.bodyMedium,
        singleLine = true,
        placeholder = {
            Text(text = "Search")
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Gray,
            cursorColor = Color.White,
            textColor = Color.White,
            placeholderColor = Color.Gray
        )
    )*/
}
