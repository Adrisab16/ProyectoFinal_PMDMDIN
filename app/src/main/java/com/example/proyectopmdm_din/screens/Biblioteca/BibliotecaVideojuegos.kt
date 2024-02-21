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

@Composable
fun BibliotecaVideojuegos(navController: NavController){
    Column(
        modifier = Modifier
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

        // Segundo bloque con NavField
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

        // LazyColumn con botones
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            item {
                // Fila 1 con los primeros 3 botones
                // Es un ejemplo de visualización, ya que se irán añadiendo
                // según las cartas que el usuario haya conseguido
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    CardPreviewTemplateForAndroidStudio(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    )
                    CardPreviewTemplateForAndroidStudio(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    )
                    CardPreviewTemplateForAndroidStudio(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    )
                }
            }

            // Se puede agregar más items aquí con las siguientes filas de botones

            // item {
            //     // Fila 2 con los siguientes 3 botones
            //     ...
            // }

            // item {
            //     // Fila 3 con los siguientes 3 botones
            //     ...
            // }

            // y así sucesivamente...
        }

        // Cuarto bloque con ButtonBackLogOutForAndroidStudio
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            ButtonBackLogOutForAndroidStudio(
                modifier = Modifier.fillMaxWidth(),
                buttonLogOut = { navController.navigate("login") },
                buttonBack = { navController.navigate("MiBiblioteca") }
            )
        }
    }
}
