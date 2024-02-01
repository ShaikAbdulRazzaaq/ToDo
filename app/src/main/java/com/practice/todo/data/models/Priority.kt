package com.practice.todo.data.models

import androidx.compose.ui.graphics.Color
import com.practice.todo.ui.theme.highPriorityColor
import com.practice.todo.ui.theme.lowPriorityColor
import com.practice.todo.ui.theme.mediumPriorityColor
import com.practice.todo.ui.theme.nonePriorityColor

enum class Priority(val color: Color) {
    HIGH(highPriorityColor),
    MEDIUM(mediumPriorityColor),
    LOW(lowPriorityColor),
    NONE(nonePriorityColor)
}