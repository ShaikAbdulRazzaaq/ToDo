package com.practice.todo.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.practice.todo.utils.Constants.DATABASE_TABLE_NAME

@Entity(tableName = DATABASE_TABLE_NAME)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
