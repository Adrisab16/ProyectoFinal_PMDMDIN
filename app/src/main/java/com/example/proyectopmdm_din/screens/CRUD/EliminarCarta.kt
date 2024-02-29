package com.example.proyectopmdm_din.screens.CRUD

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import androidx.navigation.NavController
import com.example.proyectopmdm_din.model.Card
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
@OptIn(DelicateCoroutinesApi::class)
@Composable
fun EliminarCarta(navController: NavController, cardsViewModel: CardsViewModel) {
    var cardTitle by remember { mutableStateOf("") }

    Column {
        TextField(
            value = cardTitle,
            onValueChange = { cardTitle = it },
            label = { Text("Título de la carta a eliminar") },
        )

        Button(
            onClick = {
                // Llamar a la función suspendida desde un ámbito de coroutine
                GlobalScope.launch {
                    cardsViewModel.deleteCardByTitle(cardTitle)
                }
                navController.navigate("CrudMenu")
            }
        ) {
            Text("Eliminar Carta")
        }
    }
}

/**
 * @suppress Llamada suspendida dentro de un ámbito no suspendido.
 *
 * Función suspendida en el ViewModel para eliminar una carta de Firestore y de la lista local.
 *
 * @param cardTitle Título de la carta que se desea eliminar.
 */
suspend fun CardsViewModel.deleteCardByTitle(cardTitle: String) {
    // Buscar la tarjeta en Firestore por título
    val querySnapshot = cardsCollection.whereEqualTo("title", cardTitle).get().await()

    // Si se encuentra la tarjeta, eliminarla
    for (document in querySnapshot.documents) {
        val card = document.toObject(Card::class.java)
        card?.let {
            // Eliminar la tarjeta de Firestore
            cardsCollection.document(it.id).delete().await()

            // Eliminar la tarjeta de la lista local
            cards.remove(it)
        }
    }
}
