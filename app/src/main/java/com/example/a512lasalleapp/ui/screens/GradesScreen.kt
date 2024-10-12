package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Calificaciones", style = MaterialTheme.typography.headlineMedium)
    }, body = {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Información del alumno
            Text("Bardo Arion Aranda", style = MaterialTheme.typography.bodyLarge)
            Text("Carrera: Ingeniería en Sistemas", style = MaterialTheme.typography.bodyLarge)
            Text("Semestre: 5", style = MaterialTheme.typography.bodyLarge)
            Text("Promedio acumulado: 9.0", style = MaterialTheme.typography.bodyLarge)

            Spacer(modifier = Modifier.height(20.dp))

            // Lista de materias con su promedio
            val subjects = listOf(
                "Matemáticas Avanzadas" to 9.2,
                "Programación Orientada a Objetos" to 8.7,
                "Redes de Computadoras" to 9.5
            )

            subjects.forEach { (subject, average) ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { navController.navigate("subject_details/$subject") },
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(
                        text = "$subject: Promedio $average",
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    })
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GradesScreenPreview() {
    val navController = rememberNavController()
    _512LaSalleAppTheme {
        GradesScreen(innerPadding = PaddingValues(0.dp), navController = navController)
    }
}
