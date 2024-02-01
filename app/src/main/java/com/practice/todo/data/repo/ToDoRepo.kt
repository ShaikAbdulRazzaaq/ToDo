package com.practice.todo.data.repo

import com.practice.todo.data.ToDoDao
import com.practice.todo.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ToDoRepo @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks = toDoDao.getAllTasks()
    val sortByLowPriority = toDoDao.sortByLowPriority()
    val sortByHighPriority = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int) = toDoDao.getTask(taskId)

    fun searchDatabase(searchQuery: String) = toDoDao.searchQuery(searchQuery)

    suspend fun addTask(task: ToDoTask) {
        toDoDao.addTask(task)
    }

    suspend fun updateTask(task: ToDoTask) {
        toDoDao.updateTask(task)
    }

    suspend fun deleteTask(task: ToDoTask) {
        toDoDao.deleteTask(task)
    }

    suspend fun deleteAllTasks() {
        toDoDao.deleteAllTasks()
    }

}