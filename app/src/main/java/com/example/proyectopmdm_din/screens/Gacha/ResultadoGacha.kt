package com.example.proyectopmdm_din.screens.Gacha

import androidx.cardview.widget.CardView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField
import com.example.proyectopmdm_din.viewModels.CardsViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.example.proyectopmdm_din.model.Card
import kotlinx.coroutines.launch

/**
 * @Composable función que representa la pantalla de resultado del gacha.
 *
 * Muestra una interfaz para el usuario con un encabezado, opciones de navegación y el resultado de la tarjeta obtenida.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 * @param cardsViewModel ViewModel que contiene la lógica para obtener tarjetas aleatorias.
 */
@Composable
fun ResultadoGacha(navController: NavController, cardsViewModel: CardsViewModel){
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

        RandomCardScreen(cardsViewModel = cardsViewModel)

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
                buttonLogOut = {navController.navigate("login") },
                buttonBack = {navController.navigate("MenuGacha")}
            )
        }
    }
}

/**
 * @Composable función que representa la pantalla de visualización de una tarjeta aleatoria.
 *
 * Muestra la tarjeta aleatoria obtenida y proporciona un botón para obtener otra tarjeta.
 *
 * @param cardsViewModel ViewModel que contiene la lógica para obtener tarjetas aleatorias.
 */
@Composable
fun RandomCardScreen(cardsViewModel: CardsViewModel) {
    var randomCard by remember { mutableStateOf<Card?>(null) }
    val coroutineScope = rememberCoroutineScope()

    // La primera vez que se carga la pantalla, obtén una tarjeta aleatoria
    LaunchedEffect(true) {
        coroutineScope.launch {
            randomCard = cardsViewModel.getRandomCard()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (randomCard != null) {
            CardView(card = randomCard!!)
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    // Obtén una nueva tarjeta aleatoria y actualiza la variable de estado
                    coroutineScope.launch {
                        randomCard = cardsViewModel.getRandomCard()
                    }
                }
            ) {
                Icon(imageVector = Icons.Default.Refresh, contentDescription = null)
                Spacer(modifier = Modifier.width(4.dp))
                Text("Obtener otra tarjeta")
            }
        } else {
            // Manejar el caso en el que no se pueda obtener una tarjeta aleatoria
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(imageVector = Icons.Default.Warning, contentDescription = null)
                Text("No se pudo obtener una tarjeta aleatoria")
            }
        }
    }
}

/**
 * @Composable función que representa la vista de una tarjeta.
 *
 * Muestra la información de la tarjeta, incluyendo título y descripción.
 *
 * @param card Tarjeta a mostrar.
 */
@Composable
fun CardView(card: Card) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Mostrar la información de la tarjeta
        Text(text = card.title)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = card.description)
    }
}