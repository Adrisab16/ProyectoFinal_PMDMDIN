package com.example.proyectopmdm_din.screens.Gacha

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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField
import com.example.proyectopmdm_din.viewModels.CardsViewModel
import kotlinx.coroutines.launch

/**
 * @Composable función que representa la pantalla GachaGeneral.
 *
 * Muestra una interfaz para el usuario con un encabezado, opciones de navegación y un botón para obtener una tarjeta aleatoria.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 * @param cardsViewModel ViewModel que proporciona la lógica de negocio relacionada con las cartas.
 */
@Composable
fun GachaGeneral(navController: NavController, cardsViewModel: CardsViewModel){
    val coroutineScope = rememberCoroutineScope()
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Botón para obtener una tarjeta aleatoria
            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "Obtener tarjeta aleatoria", // Aquí debería ir tu texto
            ) {
                // Llamar a la función suspend desde el ámbito de coroutine
                coroutineScope.launch {
                    navController.navigate("ResultadoGacha")
                }
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
                buttonLogOut = {navController.navigate("login") },
                buttonBack = {navController.navigate("Home")}
            )
        }
    }
}