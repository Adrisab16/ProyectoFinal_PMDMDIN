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

@Composable
fun NavManager(loginVM: LoginViewModel) {
    // DCS - Configuración del sistema de navegación y definición de las rutas.

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Blank" ){
        composable("Blank"){
            BlankView(navController)
        }
        composable("Sign-Up"){
            SignUp(navController, loginVM)
        }
        composable("Login"){
            LogIn(navController, loginVM)
        }
        composable("Home"){
            Home(navController)
        }
        composable("MiBiblioteca"){
            MiBiblioteca(navController)
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
        composable("MenuGacha"){
            MenuGacha(navController)
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