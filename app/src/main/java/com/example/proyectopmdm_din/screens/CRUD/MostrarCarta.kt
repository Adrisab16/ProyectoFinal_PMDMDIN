package com.example.proyectopmdm_din.screens.CRUD

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.model.Card
import com.example.proyectopmdm_din.viewModels.CardsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Muestra la lista de tarjetas en una interfaz de usuario [LazyColumn].
 *
 * @param navController Controlador de navegación para manejar las transiciones entre las pantallas.
 * @param cardsViewModel ViewModel que proporciona los datos de las tarjetas.
 */
@OptIn(ExperimentalCoroutinesApi::class)
@Composable
fun MostrarCartas(navController: NavController, cardsViewModel: CardsViewModel) {
    val cards by produceState<List<Card>>(initialValue = emptyList()) {
        value = cardsViewModel.getAllCards()
    }

    LazyColumn {
        items(cards) { card ->
            CardItem(card = card)
        }
    }
}

/**
 * Muestra una tarjeta individual en la interfaz de usuario.
 *
 * @param card La tarjeta que se va a mostrar.
 */
@Composable
fun CardItem(card: Card) {
    // Renderizar la tarjeta individual
    // Puedes personalizar la apariencia según tus necesidades
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(1.dp, Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "ID: ${card.id}")
            Text(text = "Title: ${card.title}")
            Text(text = "Description: ${card.description}")
        }
    }
}
