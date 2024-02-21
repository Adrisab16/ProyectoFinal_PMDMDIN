package com.example.proyectopmdm_din.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectopmdm_din.viewModels.LoginViewModel
import com.example.proyectopmdm_din.screens.Biblioteca.BibliotecaAnime
import com.example.proyectopmdm_din.screens.Biblioteca.BibliotecaGeneral
import com.example.proyectopmdm_din.screens.Biblioteca.BibliotecaVideojuegos
import com.example.proyectopmdm_din.screens.Biblioteca.MiBiblioteca
import com.example.proyectopmdm_din.screens.Others.BlankView
import com.example.proyectopmdm_din.screens.Gacha.GachaAnime
import com.example.proyectopmdm_din.screens.Gacha.GachaGeneral
import com.example.proyectopmdm_din.screens.Gacha.GachaVideojuegos
import com.example.proyectopmdm_din.screens.Gacha.MenuGacha
import com.example.proyectopmdm_din.screens.Gacha.ResultadoGacha
import com.example.proyectopmdm_din.screens.Others.Home
import com.example.proyectopmdm_din.screens.Login.LogIn
import com.example.proyectopmdm_din.screens.Login.SignUp
import com.example.proyectopmdm_din.screens.Biblioteca.ShowCard

/**
 * @Composable función para gestionar la navegación entre diferentes pantallas de la aplicación.
 *
 * Esta función utiliza el sistema de navegación de Jetpack Compose para definir las rutas y mostrar las
 * vistas correspondientes a cada pantalla.
 *
 * @param loginVM ViewModel para gestionar el estado y la lógica relacionada con la autenticación.
 */
@Composable
fun NavManager(loginVM: LoginViewModel) {
    // DCS - Configuración del sistema de navegación y definición de las rutas.

    // Se crea el controlador de navegación que recordará el estado de la navegación.
    val navController = rememberNavController()

    // Se configuran las rutas y se asocian con las respectivas funciones que muestran las vistas.
    NavHost(navController = navController, startDestination = "Blank") {
        composable("Blank") {
            // Muestra la vista correspondiente a la pantalla Blank.
            BlankView(navController)
        }
        composable("Sign-Up") {
            // Muestra la vista correspondiente a la pantalla de registro (Sign-Up).
            SignUp(navController, loginVM)
        }
        composable("Login") {
            // Muestra la vista correspondiente a la pantalla de inicio de sesión (Login).
            LogIn(navController, loginVM)
        }
        composable("Home") {
            // Muestra la vista correspondiente a la pantalla principal (Home).
            Home(navController)
        }
        composable("MiBiblioteca") {
            // Muestra la vista correspondiente a la pantalla de la biblioteca personal (MiBiblioteca).
            MiBiblioteca(navController)
        }
        composable("BibliotecaAnime") {
            // Muestra la vista correspondiente a la pantalla de la biblioteca de anime (BibliotecaAnime).
            BibliotecaAnime(navController)
        }
        composable("BibliotecaGeneral") {
            // Muestra la vista correspondiente a la pantalla de la biblioteca general (BibliotecaGeneral).
            BibliotecaGeneral(navController)
        }
        composable("BibliotecaVideojuegos") {
            // Muestra la vista correspondiente a la pantalla de la biblioteca de videojuegos (BibliotecaVideojuegos).
            BibliotecaVideojuegos(navController)
        }
        composable("ShowCard") {
            // Muestra la vista correspondiente a la pantalla de detalles de la tarjeta (ShowCard).
            ShowCard(navController)
        }
        composable("MenuGacha") {
            // Muestra la vista correspondiente al menú Gacha (MenuGacha).
            MenuGacha(navController)
        }
        composable("GachaGeneral") {
            // Muestra la vista correspondiente a la pantalla Gacha general (GachaGeneral).
            GachaGeneral(navController)
        }
        composable("GachaVideojuegos") {
            // Muestra la vista correspondiente a la pantalla Gacha de videojuegos (GachaVideojuegos).
            GachaVideojuegos(navController)
        }
        composable("GachaAnime") {
            // Muestra la vista correspondiente a la pantalla Gacha de anime (GachaAnime).
            GachaAnime(navController)
        }
        composable("ResultadoGacha") {
            // Muestra la vista correspondiente a la pantalla de resultados del Gacha (ResultadoGacha).
            ResultadoGacha(navController)
        }
    }
}
