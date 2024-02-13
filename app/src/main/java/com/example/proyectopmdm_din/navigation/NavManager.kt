package com.example.proyectopmdm_din.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectopmdm_din.views.Home
import com.example.proyectopmdm_din.views.Inicio
import com.example.proyectopmdm_din.views.LogIn
import com.example.proyectopmdm_din.views.SignUp

@Composable
fun NavManager() {
    // DCS - Configuración del sistema de navegación y definición de las rutas.

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Blank" ){
        composable("Sign-Up"){
            SignUp(navController)
        }
        composable("Login"){
            LogIn(navController)
        }
        composable("Home"){
            Home(navController)
        }
        composable("inicio"){
            Inicio(navController)
        }
        composable("MiBilioteca"){

        }
        composable("BibliotecaAnime"){

        }
        composable("BibliotecaGeneral"){

        }
        composable("BibliotecaVideojuegos"){

        }
        composable("ShowCard"){

        }
        composable("GachaGeneral"){

        }
        composable("GachaVideojuegos"){

        }
        composable("GachaAnime"){

        }
        composable("ResultadoGacha"){

        }
    }
}