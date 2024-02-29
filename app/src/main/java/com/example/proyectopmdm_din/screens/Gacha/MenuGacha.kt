package com.example.proyectopmdm_din.screens.Gacha

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField
import kotlinx.coroutines.launch

/**
 * @Composable función para mostrar la pantalla principal del menú Gacha.
 *
 * Esta pantalla contiene un encabezado, opciones de navegación, botones centrados y un
 * bloque de cierre de sesión.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 */

@Composable
fun MenuGacha(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Bloque 1: Encabezado
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.Top
        ) {
            Header()
        }

        // Bloque 2: Opciones de navegación
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavField(
                navButtonBiblioteca = { navController.navigate("MiBiblioteca") },
                navButtonInicio = { navController.navigate("Home") },
                navButtonGacha = { navController.navigate("MenuGacha") }
            )
        }

        // Bloque 3: Botones centrados
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Botones centrados
            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "General", // Aquí debería ir tu texto
            ){ navController.navigate("GachaGeneral") }

            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "Videojuegos", // Aquí debería ir tu texto
            ){ navController.navigate("GachaVideojuegos") }

            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "Anime", // Aquí debería ir tu texto
            ){ navController.navigate("GachaAnime") }


        // Espacio en el centro
        Spacer(modifier = Modifier.weight(1f))

        // Bloque 4: Botón de cierre de sesión
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            ButtonBackLogOutForAndroidStudio(
                modifier = Modifier.fillMaxWidth(),
                buttonLogOut = { navController.navigate("login") },
                buttonBack = { navController.navigate("Home") }
            )
        }
    }
}
}
