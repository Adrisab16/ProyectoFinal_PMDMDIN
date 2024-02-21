package com.example.proyectopmdm_din.screens.Biblioteca

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio.ButtonBackLogOutForAndroidStudio
import com.example.proyectopmdm_din.buttonforandroidstudio.ButtonForAndroidStudio
import com.example.proyectopmdm_din.cardpreviewtemplateforandroidstudio.CardPreviewTemplateForAndroidStudio
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.navfield.NavField

/**
 * @Composable función para representar la pantalla de la biblioteca de videojuegos.
 *
 * Esta función toma un [NavController] como parámetro para gestionar la navegación entre pantallas.
 *
 * @param navController Controlador de navegación para gestionar el flujo de navegación.
 *
 * La pantalla incluye una barra de navegación con botones para acceder a "Mi Biblioteca", "Inicio" y "Menú Gacha".
 * Además, muestra una lista de botones que representan cartas de videojuegos obtenidas por el usuario.
 * El diseño permite agregar más botones dinámicamente según las cartas obtenidas.
 * También incluye un botón de retroceso y cierre de sesión en la parte inferior.
 */
@Composable
fun BibliotecaVideojuegos(navController: NavController){
    // Columna principal que ocupa toda la pantalla y tiene un fondo negro.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Primer Row en la parte superior que contiene el encabezado.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.Top
        ) {
            Header()
        }

        // Segundo bloque que contiene la barra de navegación.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Barra de navegación con botones para Mi Biblioteca, Inicio y Menú Gacha.
            NavField(
                navButtonBiblioteca = { navController.navigate("MiBiblioteca") },
                navButtonInicio = { navController.navigate("Home") },
                navButtonGacha = { navController.navigate("MenuGacha") }
            )
        }

        // Tercer bloque que contiene la lista de botones de la biblioteca de videojuegos.
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            item {
                // Fila 1 con los primeros 3 botones.
                // Ejemplo de visualización; se agregarán más según las cartas obtenidas por el usuario.
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // Se muestra una plantilla de vista previa de tarjeta para Android Studio.
                    CardPreviewTemplateForAndroidStudio(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    )

                    // Se pueden agregar más instancias de CardPreviewTemplateForAndroidStudio aquí.
                    // Por ejemplo, para cada nueva carta obtenida por el usuario.

                    // CardPreviewTemplateForAndroidStudio(
                    //     modifier = Modifier
                    //         .weight(1f)
                    //         .padding(8.dp)
                    // )

                    // CardPreviewTemplateForAndroidStudio(
                    //     modifier = Modifier
                    //         .weight(1f)
                    //         .padding(8.dp)
                    // )
                }
            }

            // Se pueden agregar más ítems aquí para las siguientes filas de botones.

            // item {
            //     // Fila 2 con los siguientes 3 botones.
            //     // ...
            // }

            // item {
            //     // Fila 3 con los siguientes 3 botones.
            //     // ...
            // }

            // Y así sucesivamente...
        }

        // Cuarto bloque que contiene el botón de retroceso y cierre de sesión.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            // Botón de retroceso y cierre de sesión.
            ButtonBackLogOutForAndroidStudio(
                modifier = Modifier.fillMaxWidth(),
                buttonLogOut = { navController.navigate("login") },
                buttonBack = { navController.navigate("MiBiblioteca") }
            )
        }
    }
}
