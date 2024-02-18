package com.example.taskmanagerjcapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.taskmanagerjcapp.model.dummyTaskList
import com.example.taskmanagerjcapp.ui.composables.SearchTextField
import com.example.taskmanagerjcapp.ui.composables.TaskItem
import com.example.taskmanagerjcapp.ui.composables.TopAppBar

@Composable
fun MainScreen() {
    TopAppBar(mainContent = { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier.padding(top = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SearchTextField(onSearchChanged = {})
                LazyColumn {
                    items(dummyTaskList) { task ->
                        TaskItem(task = task)
                    }
                }
            }
        }
    })
}



