package com.example.taskmanagerjcapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.taskmanagerjcapp.ui.screens.MainScreen
import com.example.taskmanagerjcapp.ui.theme.TaskManagerJCAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerJCAppTheme {
                MainScreen()
            }
        }
    }
}
