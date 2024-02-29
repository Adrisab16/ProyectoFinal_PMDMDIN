package com.example.proyectopmdm_din.screens.Gacha

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField

/**
 * @Composable función que representa la pantalla GachaVideojuegos.
 *
 * Muestra una interfaz para el usuario con un encabezado, opciones de navegación y un espacio en el centro.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 */
@Composable
fun GachaVideojuegos(navController: NavController){
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