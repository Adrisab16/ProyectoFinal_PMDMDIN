package com.example.proyectopmdm_din.screens.CRUD

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.viewModels.CardsViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * @OptIn(ExperimentalComposeUiApi::class, DelicateCoroutinesApi::class)
 * @Composable función que representa la pantalla de implementación de una nueva carta.
 *
 * Permite al usuario introducir el título y la descripción de la nueva carta. Al hacer clic en el botón
 * de añadir carta, se llama a la función correspondiente en el ViewModel para añadir la carta a Firestore y
 * luego navega de vuelta al menú CRUD.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 * @param cardsViewModel ViewModel que contiene la lógica para gestionar las cartas.
 */
@OptIn(ExperimentalComposeUiApi::class, DelicateCoroutinesApi::class)
@Composable
fun ImplementarCarta(navController: NavController, cardsViewModel: CardsViewModel) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    val keyboardController = LocalSoftwareKeyboardController.current
    val imeAction = if (keyboardController != null) ImeAction.Done else ImeAction.Next

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {

        // Formulario para introducir nuevas cartas
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Campo de texto para el título
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Título") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction),
                keyboardActions = KeyboardActions(
                    onDone = {
                        if (imeAction == ImeAction.Done) {
                            keyboardController?.hide()
                        }
                    }
                )
            )

            // Campo de texto para la descripción
            OutlinedTextField(
                value = description,
                onValueChange = { description = it },
                label = { Text("Descripción") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(
                    onDone = { keyboardController?.hide() }
                )
            )

            // Botón para añadir la carta
            Button(
                onClick = {
                    // Verificar que se haya ingresado un título y descripción antes de añadir
                    if (title.isNotBlank() && description.isNotBlank()) {
                        // Llamar a la función suspendida desde un ámbito de coroutine
                        GlobalScope.launch {
                            cardsViewModel.addCardToFirestore(title, description)
                            // Limpiar los campos después de añadir la carta
                            title = ""
                            description = ""

                        }
                    }
                    navController.navigate("CrudMenu")
                }
            ) {
                Text("Añadir Carta")
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
                buttonLogOut = { navController.navigate("login") },
            )
        }
    }
}