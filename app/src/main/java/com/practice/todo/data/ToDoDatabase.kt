package com.practice.todo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.practice.todo.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun todoDao(): ToDoDao
}