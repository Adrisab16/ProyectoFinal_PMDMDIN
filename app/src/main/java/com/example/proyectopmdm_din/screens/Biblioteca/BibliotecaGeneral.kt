package com.example.proyectopmdm_din.screens.Biblioteca

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.model.Card
import com.example.proyectopmdm_din.navfield.NavField
import com.example.proyectopmdm_din.viewModels.CardsViewModel

/**
 * Composable que representa la pantalla de la biblioteca general.
 *
 * Esta pantalla muestra una lista de tarjetas del usuario utilizando Compose.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 * @param cardsViewModel ViewModel que proporciona los datos de las tarjetas del usuario.
 */
@Composable
fun BibliotecaGeneral(navController: NavController, cardsViewModel: CardsViewModel){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
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
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)) {
            NavField(
                navButtonBiblioteca = { navController.navigate("MiBiblioteca") },
                navButtonInicio = { navController.navigate("Home") },
                navButtonGacha = { navController.navigate("MenuGacha") }
            )
        }

        LazyColumn {
            items(cardsViewModel.userCards) { card ->
                CardItem(card = card)
            }
        }

        // Espacio en el centro
        Spacer(modifier = Modifier.weight(1f))

        // Segundo Row en la parte inferior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.Bottom,
        ) {
            ButtonBackLogOutForAndroidStudio(
                modifier = Modifier.fillMaxWidth(),
                buttonLogOut = { navController.navigate("login") },
                buttonBack = { navController.navigate("MiBiblioteca") }
            )
        }
    }
}
/**
 * Composable que representa un elemento de tarjeta individual.
 *
 * Muestra la información de una tarjeta en un formato específico.
 *
 * @param card Tarjeta que se va a mostrar.
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
