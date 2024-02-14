package com.example.proyectopmdm_din.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectopmdm_din.views.Biblioteca.BibliotecaAnime
import com.example.proyectopmdm_din.views.Biblioteca.BibliotecaGeneral
import com.example.proyectopmdm_din.views.Biblioteca.BibliotecaVideojuegos
import com.example.proyectopmdm_din.views.Biblioteca.MiBilioteca
import com.example.proyectopmdm_din.views.Others.BlankView
import com.example.proyectopmdm_din.views.Gacha.GachaAnime
import com.example.proyectopmdm_din.views.Gacha.GachaGeneral
import com.example.proyectopmdm_din.views.Gacha.GachaVideojuegos
import com.example.proyectopmdm_din.views.Gacha.ResultadoGacha
import com.example.proyectopmdm_din.views.Others.Home
import com.example.proyectopmdm_din.views.Others.Inicio
import com.example.proyectopmdm_din.views.Login.LogIn
import com.example.proyectopmdm_din.views.Login.SignUp
import com.example.proyectopmdm_din.views.Gacha.ShowCard

@Composable
fun NavManager() {
    // DCS - Configuración del sistema de navegación y definición de las rutas.

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Blank" ){
        composable("Blank"){
            BlankView(navController)
        }
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
            MiBilioteca(navController)
        }
        composable("BibliotecaAnime"){
            BibliotecaAnime(navController)
        }
        composable("BibliotecaGeneral"){
            BibliotecaGeneral(navController)
        }
        composable("BibliotecaVideojuegos"){
            BibliotecaVideojuegos(navController)
        }
        composable("ShowCard"){
            ShowCard(navController)
        }
        composable("GachaGeneral"){
            GachaGeneral(navController)
        }
        composable("GachaVideojuegos"){
            GachaVideojuegos(navController)
        }
        composable("GachaAnime"){
            GachaAnime(navController)
        }
        composable("ResultadoGacha"){
            ResultadoGacha(navController)
        }
    }
}