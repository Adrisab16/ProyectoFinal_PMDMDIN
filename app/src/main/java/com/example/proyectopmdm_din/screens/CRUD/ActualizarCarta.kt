package com.example.proyectopmdm_din.screens.CRUD

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField
import com.example.proyectopmdm_din.viewModels.CardsViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * Composable que representa la pantalla de actualización de una carta.
 *
 * @param navController NavController utilizado para la navegación entre pantallas.
 * @param cardsViewModel Instancia de [CardsViewModel] que contiene la lógica de negocio relacionada con las cartas.
 */
@OptIn(ExperimentalComposeUiApi::class, DelicateCoroutinesApi::class)
@Composable
fun ActualizarCarta(navController: NavController, cardsViewModel: CardsViewModel) {
    var oldTitle by remember { mutableStateOf("") }
    var newTitle by remember { mutableStateOf("") }
    var newDescription by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        // Primer Row en la parte superior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.Top
        ) {
            Header()
        }

        // Barra de navegación en la parte superior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            NavField(
                navButtonBiblioteca = { navController.navigate("MiBiblioteca") },
                navButtonGacha = { navController.navigate("MenuGacha") }
            )
        }

        // Espacio adicional en la parte superior
        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            TextField(
                value = oldTitle,
                onValueChange = { oldTitle = it },
                label = { Text("Título de la carta a actualizar") },
            )
            TextField(
                value = newTitle,
                onValueChange = { newTitle = it },
                label = { Text("Nuevo título") },
            )
            TextField(
                value = newDescription,
                onValueChange = { newDescription = it },
                label = { Text("Nueva descripción") },
            )

            Button(
                onClick = {
                    // Llamar a la función suspendida desde un ámbito de coroutine
                    GlobalScope.launch {
                        cardsViewModel.updateCardByTitle(oldTitle, newTitle, newDescription)
                    }
                }
            ) {
                Text("Actualizar Carta")
            }
        }

        // Espacio adicional en la parte inferior
        Spacer(modifier = Modifier.height(20.dp))

        // Segundo Row en la parte inferior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.Bottom,
        ) {
            // Botón de retroceso y cierre de sesión
            ButtonBackLogOutForAndroidStudio(
                modifier = Modifier.fillMaxWidth(),
                buttonBack = {navController.navigate("CrudMenu")},
                buttonLogOut = { navController.navigate("login") }
            )
        }
    }
}
