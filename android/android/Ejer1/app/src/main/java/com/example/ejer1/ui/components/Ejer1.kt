package com.example.ejer1.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

@Composable
fun Text1(text: String, modifier: Modifier, color : Color, textUnit: TextUnit)
{
    Box(modifier)
    {
        Text(text = text,color = color, fontSize = textUnit)
    }

}