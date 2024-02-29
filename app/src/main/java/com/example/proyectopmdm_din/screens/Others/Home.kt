package com.example.proyectopmdm_din.screens.Others

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.descriptionforandroidstudio.DescriptionForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField

/**
 * @Composable función que representa la pantalla Home.
 *
 * Muestra la pantalla principal de la aplicación con un encabezado, una barra de navegación y un botón para acceder a
 * la sección de ajustes (CrudMenu).
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 */
@Composable
fun Home(navController: NavController) {
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
                buttonTxt = "Ajustes", // Aquí debería ir tu texto
            ) {
                navController.navigate("CrudMenu")
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





