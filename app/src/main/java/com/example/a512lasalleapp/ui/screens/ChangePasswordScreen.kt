package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ChangePasswordScreen(innerPadding: PaddingValues) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Cambiar Contraseña", style = MaterialTheme.typography.headlineMedium)
    }, body = {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text("Pantalla de cambio de contraseña", style = MaterialTheme.typography.bodyLarge)
        }
    })
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChangePasswordScreenPreview() {
    _512LaSalleAppTheme {
        ChangePasswordScreen(innerPadding = PaddingValues(0.dp))
    }
}
