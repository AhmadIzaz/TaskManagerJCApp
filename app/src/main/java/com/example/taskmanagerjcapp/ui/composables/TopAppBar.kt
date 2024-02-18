package com.example.taskmanagerjcapp.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextOverflow
import com.example.taskmanagerjcapp.ui.screens.MainScreen
import com.example.taskmanagerjcapp.ui.theme.backgroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(mainContent: @Composable (PaddingValues) -> Unit) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text(
                        "Task Manager",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                /* navigationIcon = {
                     IconButton(onClick = { /* do something */ }) {
                         Icon(
                             imageVector = Icons.Filled.ArrowBack,
                             contentDescription = "Localized description"
                         )
                     }
                 },*/
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            tint = MaterialTheme.colorScheme.background,
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        },
    ) { paddingValues ->
        mainContent(paddingValues)
    }
}