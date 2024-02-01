package com.practice.todo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.practice.todo.navigation.destinations.listComposable
import com.practice.todo.navigation.destinations.taskComposable
import com.practice.todo.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navHostController: NavHostController) {
    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }
    NavHost(navController = navHostController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)
    }
}