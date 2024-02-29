package com.example.proyectopmdm_din.screens.Components

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

/**
 * Composable que representa un cuadro de diálogo de alerta.
 *
 * Este cuadro de diálogo muestra un título, un mensaje y botones para confirmar o cancelar acciones.
 *
 * @param title Título del cuadro de diálogo.
 * @param message Mensaje del cuadro de diálogo.
 * @param confirmText Texto del botón de confirmación.
 * @param onConfirmClick Lambda que se ejecuta al hacer clic en el botón de confirmación.
 * @param onDismissClick Lambda que se ejecuta al cerrar o descartar el cuadro de diálogo.
 */
@Composable
fun Alert(
    title: String,
    message: String,
    confirmText: String,
    onConfirmClick: () -> Unit,
    onDismissClick: () -> Unit
) {
    // DCS - Estructura del diálogo de alerta.

    // Estado de desplazamiento para el texto del mensaje
    val scroll = rememberScrollState(0)

    // Creación del cuadro de diálogo de alerta
    AlertDialog(onDismissRequest = { onDismissClick() },
        title = { Text(text = title) },
        text = {
            // Texto del mensaje con posibilidad de desplazamiento vertical
            Text(
                text = message,
                textAlign = TextAlign.Justify,
                modifier = Modifier.verticalScroll(scroll)
            )
        },
        confirmButton = {
            Button(onClick = { onConfirmClick() }) {
                Text(text = confirmText)
            }
        }
    )
}