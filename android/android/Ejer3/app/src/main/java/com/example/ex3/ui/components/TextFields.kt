package com.example.ex3.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TextFielUsuario()
{
    // Usamos un estado para guardar el texto
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var textComprobacion by remember { mutableStateOf("") }
    var textColorComprobacion by remember { mutableStateOf(Color.Transparent) }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        OutlinedTextField(
            value = text1,
            onValueChange = {text1 = it},
            label = { Text("Usario") }
        )
        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = text2,
            onValueChange = {text2 = it},
            label = { Text("Contraseña") },
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedTextColor = Color.Transparent
            )
        )
        Spacer(Modifier.height(10.dp))
        Text(textComprobacion,color = textColorComprobacion)
        Spacer(Modifier.height(10.dp))
        Button(onClick =
        {

            if (text1.equals("admin") && text2.equals("1234"))
            {
                textComprobacion = "Usuario Correcto"
                textColorComprobacion = Color.Green
            }
            else
            {
                textComprobacion = "Usuario Incorrecto"
                textColorComprobacion = Color.Red
            }
        }) {
            Text("Acceder")
        }
    }

}