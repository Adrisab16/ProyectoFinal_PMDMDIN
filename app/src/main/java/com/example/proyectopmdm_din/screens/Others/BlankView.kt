package com.example.proyectopmdm_din.screens.Others

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth

/**
 * @Composable función que representa la pantalla BlankView.
 *
 * Muestra una pantalla en blanco al iniciar la aplicación. Dependiendo del estado de autenticación, redirige al usuario
 * a la pantalla de inicio si está autenticado, o a la pantalla de inicio de sesión si no lo está.
 *
 * @param navController Controlador de navegación para gestionar las transiciones entre pantallas.
 */
@Composable
fun BlankView(navController: NavController){
    LaunchedEffect(Unit){
        if (!FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty()){
            navController.navigate("Home")
        }else{
            navController.navigate("Login")
        }
    }
}