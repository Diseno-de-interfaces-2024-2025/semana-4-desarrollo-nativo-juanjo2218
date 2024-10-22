package com.example.ejer2.ui.components
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(text : String,color : Color,modifier: Modifier = Modifier)
{
    // Usamos un estado para guardar el texto
    var buttonText by remember { mutableStateOf(text) }
    var buttonColor by remember { mutableStateOf(Color.Black) }
    var buttonColorText by remember { mutableStateOf(Color.White)}
    var buttonBorder by remember { mutableStateOf(BorderStroke(1.dp,Color.Black))}
    var buttonShape by remember { mutableStateOf(RoundedCornerShape(20.dp))}
    Box(modifier) {
        Button(onClick = {
            // Cambiamos el texto al hacer clic
            buttonText = "Ha cambiado el texto"
            buttonColorText = Color.Black
            buttonColor = color
            buttonBorder = BorderStroke(3.dp,Color.Black)
            buttonShape = RoundedCornerShape(4.dp)
        },
            border = buttonBorder,
            colors = ButtonDefaults.buttonColors(
                containerColor = buttonColor
            ),
            shape = buttonShape
            )
        {
            Text(buttonText,color = buttonColorText)
        }
    }
}
