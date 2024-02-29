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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField

/**
 * @Composable función que representa un menú CRUD (Create, Read, Update, Delete).
 *
 * Este menú contiene opciones para añadir, eliminar, ver y actualizar cartas. Además, incluye un encabezado,
 * opciones de navegación y un botón de cierre de sesión.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 */
@Composable
fun CrudMenu(navController: NavController){
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
                buttonTxt = "AñadirCarta", // Aquí debería ir tu texto
            ){ navController.navigate("ImplementarCarta") }
            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "EliminarCarta", // Aquí debería ir tu texto
            ){ navController.navigate("EliminarCarta") }
            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "VerCarta", // Aquí debería ir tu texto
            ){ navController.navigate("VerCarta")}
            ButtonForAndroidStudio(
                modifier = Modifier
                    .height(76.dp)
                    .width(236.dp)
                    .padding(10.dp),
                buttonTxt = "ActualizarCarta", // Aquí debería ir tu texto
            ){ navController.navigate("ActualizarCarta") }

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