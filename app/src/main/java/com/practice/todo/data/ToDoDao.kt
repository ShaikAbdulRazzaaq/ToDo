package com.practice.todo.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.practice.todo.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {
    @Query("SELECT * FROM ToDo_Table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM ToDo_Table WHERE id = :taskId")
    fun getTask(taskId: Int): Flow<ToDoTask>

    @Insert(onConflict = OnConflictStrategy.REPLACE, entity = ToDoTask::class)
    suspend fun addTask(toDoTask: ToDoTask)

    @Update
    suspend fun updateTask(toDoTask: ToDoTask)

    @Delete
    suspend fun deleteTask(toDoTask: ToDoTask)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM todo_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchQuery(searchQuery: String): Flow<List<ToDoTask>>

    @Query("select * from todo_table order by case when priority like 'L%' then 1 when priority like 'M%' then 2 when priority like 'H%' then 3 end")
    fun sortByLowPriority(): Flow<List<ToDoTask>>

    @Query("select * from todo_table order by case when priority like 'H%' then 1 when priority like 'M%' then 2 when priority like 'L%' then 3 end")
    fun sortByHighPriority(): Flow<List<ToDoTask>>
}