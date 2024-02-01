package com.practice.todo.navigation

import androidx.navigation.NavHostController
import com.practice.todo.utils.Action
import com.practice.todo.utils.Constants

class Screens(navHostController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navHostController.navigate(route = "list/${action.name}") {
            popUpTo(Constants.LIST_SCREEN) {
                inclusive = true
            }
        }
    }

    val task: (taskId: Int) -> Unit = { taskId ->
        navHostController.navigate(route = "task/$taskId")
    }
}