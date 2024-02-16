package com.example.taskmanagerjcapp.model

data class Task(
    val id: Long,             // Unique identifier for the task
    val name: String,         // Name or title of the task
    val dueDate: Long?,       // Due date of the task (nullable for tasks without a specific deadline)
    val priority: Priority,   // Priority level of the task (e.g., High, Medium, Low)
    val notes: String?,       // Additional notes or details about the task (nullable)
    val isCompleted: Boolean   // Indicates whether the task is completed or not
)

enum class Priority {
    HIGH,
    MEDIUM,
    LOW
}

val dummyTaskList: List<Task> = listOf(
    Task(1, "Complete project proposal", System.currentTimeMillis() + 86400000, Priority.HIGH, "Finish by tomorrow", false),
    Task(2, "Go to the gym", System.currentTimeMillis() + 172800000, Priority.MEDIUM, "Remember to pack gym bag", false),
    Task(3, "Read a chapter of a book", System.currentTimeMillis() + 259200000, Priority.LOW, "Choose any book you like", false),
    Task(4, "Prepare for meeting", System.currentTimeMillis() + 345600000, Priority.HIGH, "Gather presentation materials", false),
    Task(5, "Buy groceries", null, Priority.MEDIUM, "Don't forget to buy milk", false),
    Task(6, "Call a friend", null, Priority.LOW, "Catch up on recent events", false),
    Task(7, "Complete coding assignment", System.currentTimeMillis() + 432000000, Priority.HIGH, "Finish by end of the week", false),
    Task(8, "Water the plants", null, Priority.LOW, "Plants in the living room and balcony", false),
    Task(9, "Reply to emails", System.currentTimeMillis() + 518400000, Priority.MEDIUM, "Check inbox and respond", false),
    Task(10, "Organize workspace", null, Priority.LOW, "Declutter and clean desk", false)
)
