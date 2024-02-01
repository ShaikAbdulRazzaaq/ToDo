package com.practice.todo.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.practice.todo.utils.Action
import com.practice.todo.utils.Constants.TASK_ARGUMENT_KEY
import com.practice.todo.utils.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(navigateToListScreen: (Action) -> Unit) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}