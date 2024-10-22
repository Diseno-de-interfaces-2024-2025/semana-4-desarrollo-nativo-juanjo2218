package com.example.ejer2.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyButtonText(modifier: Modifier = Modifier) {
    // Usamos un estado para guardar el texto
    var buttonText by remember { mutableStateOf("Pulsa aquí") }
    Box(modifier) {
        Button(onClick = {
            // Cambiamos el texto al hacer clic
            buttonText = "Boton pulsado"
        }) {
            Text(buttonText)
        }
    }
}