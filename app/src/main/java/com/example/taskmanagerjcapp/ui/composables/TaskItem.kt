package com.example.taskmanagerjcapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.taskmanagerjcapp.R
import com.example.taskmanagerjcapp.model.Task
import com.example.taskmanagerjcapp.ui.theme.Typography

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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(text = task.name, style = Typography.titleLarge)
                Image(
                    modifier = Modifier
                        .size(width = 20.dp, height = 20.dp),
                    painter = painterResource(id = R.drawable.unfilled_star),
                    contentDescription = "Favourite Icon"
                )
            }
            task.notes.takeIf { it?.isNotEmpty() == true }
                ?.let { Text(modifier = Modifier.padding(top = 10.dp), text = it) }
        }
    }
}