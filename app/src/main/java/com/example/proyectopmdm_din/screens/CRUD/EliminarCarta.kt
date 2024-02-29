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
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.model.Card
import com.example.proyectopmdm_din.navfield.NavField
import com.example.proyectopmdm_din.viewModels.CardsViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.tasks.await

/**
 * @OptIn(DelicateCoroutinesApi::class)
 * @Composable función que representa la pantalla de eliminación de una carta.
 *
 * Permite al usuario introducir el título de la carta que desea eliminar. Al hacer clic en el botón de
 * eliminación, se llama a la función correspondiente en el ViewModel para eliminar la carta y luego
 * navega de vuelta al menú CRUD.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 * @param cardsViewModel ViewModel que contiene la lógica para gestionar las cartas.
 */
@OptIn(ExperimentalComposeUiApi::class, DelicateCoroutinesApi::class)
@Composable
fun EliminarCarta(navController: NavController, cardsViewModel: CardsViewModel) {
    var cardTitle by remember { mutableStateOf("") }

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
                value = cardTitle,
                onValueChange = { cardTitle = it },
                label = { Text("Título de la carta a eliminar") },
            )

            Button(
                onClick = {
                    // Llamar a la función suspendida desde un ámbito de coroutine
                    GlobalScope.launch {
                        try {
                            cardsViewModel.deleteCardByTitle("Título de la tarjeta a eliminar")
                        } catch (_: Exception) {
                        }
                    }
                    navController.navigate("CrudMenu")
                }
            ) {
                Text("Eliminar Carta")
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
