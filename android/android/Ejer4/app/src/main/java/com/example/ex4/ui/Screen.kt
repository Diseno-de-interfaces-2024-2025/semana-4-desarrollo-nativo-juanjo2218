import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IdenticalFormScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Screen", color = Color.White, fontSize = 30.sp)
        }

        // Row of Circles (Scrollable Horizontally)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()) // Habilitar scroll horizontal
                .background(Color.LightGray)
                .padding(10.dp),
            horizontalArrangement = Arrangement.Start, // Distribuir desde la izquierda
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(20) { // Puedes ajustar la cantidad de círculos
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color.DarkGray, CircleShape)
                        .padding(5.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Row: Image and Scrollable Text
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Rounded blue square (Image placeholder)
            Box(
                modifier = Modifier
                    .size(150.dp)  // Reduce el tamaño si prefieres más espacio para el texto
                    .background(Color.Cyan, RoundedCornerShape(16.dp))
                    .padding(horizontal = 10.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Scrollable Text
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(200.dp) // Ajusta la altura del contenedor
                    .verticalScroll(rememberScrollState()) // Habilitar scroll vertical
            ) {
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam finibus ac ante non fringilla. Curabitur ornare malesuada hendrerit. Etiam ullamcorper enim ex, sit amet varius tellus aliquet nec. Etiam vitae aliquet sem. Proin non odio sed orci blandit sollicitudin. Aliquam gravida pharetra justo, ut consectetur ex bibendum nec. Nulla varius ante sit amet velit fermentum, ut commodo neque dignissim. Aenean consequat pharetra massa sit amet posuere.",
                    fontSize = 16.sp,  // Aumenta el tamaño del texto para que sea más legible
                    textAlign = TextAlign.Justify,  // Para justificar el texto
                    modifier = Modifier.fillMaxWidth()  // Asegúrate de que use todo el ancho disponible
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Formulario
        var text1 by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        var text3 by remember { mutableStateOf("") }
        var text4 by remember { mutableStateOf("") }

        // Texts que mostrarán el valor de los campos a la derecha
        var updatedText1 by remember { mutableStateOf("") }
        var updatedText2 by remember { mutableStateOf("") }
        var updatedText3 by remember { mutableStateOf("") }
        var updatedText4 by remember { mutableStateOf("") }

        Column {
            Row {
                OutlinedTextField(
                    value = text1,
                    onValueChange = { text1 = it },
                    label = { Text("Nombre 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = updatedText1,
                    modifier = Modifier.weight(1f),
                    fontSize = 16.sp
                )
            }

            Spacer(Modifier.height(10.dp))

            Row {
                OutlinedTextField(
                    value = text2,
                    onValueChange = { text2 = it },
                    label = { Text("Nombre 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = updatedText2,
                    modifier = Modifier.weight(1f),
                    fontSize = 16.sp
                )
            }

            Spacer(Modifier.height(10.dp))

            Row {
                OutlinedTextField(
                    value = text3,
                    onValueChange = { text3 = it },
                    label = { Text("Nombre 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = updatedText3,
                    modifier = Modifier.weight(1f),
                    fontSize = 16.sp
                )
            }

            Spacer(Modifier.height(10.dp))

            Row {
                OutlinedTextField(
                    value = text4,
                    onValueChange = { text4 = it },
                    label = { Text("Nombre 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = updatedText4,
                    modifier = Modifier.weight(1f),
                    fontSize = 16.sp
                )
            }

            Spacer(Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = {
                    updatedText1 = text1
                    updatedText2 = text2
                    updatedText3 = text3
                    updatedText4 = text4
                }) {
                    Text("Actualizar")
                }
            }
        }
    }
}
