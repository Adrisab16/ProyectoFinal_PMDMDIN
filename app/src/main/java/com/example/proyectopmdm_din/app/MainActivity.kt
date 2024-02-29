package com.example.proyectopmdm_din.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.proyectopmdm_din.navigation.NavManager
import com.example.proyectopmdm_din.ui.theme.ProyectoPMDMDINTheme
import com.example.proyectopmdm_din.viewModels.LoginViewModel
import com.google.firebase.FirebaseApp

/**
 * La clase `MainActivity` es la actividad principal de la aplicación.
 * Extiende de `ComponentActivity` y se encarga de la inicialización y configuración inicial de la aplicación.
 */
class MainActivity : ComponentActivity() {
    /**
     * Método llamado cuando se crea la actividad. En este método se inicializan Firebase y se configura el ViewModel.
     * Además, se establece el contenido de la actividad utilizando Compose.
     *
     * @param savedInstanceState Estado de la instancia anterior de la actividad, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inicializar Firebase
        FirebaseApp.initializeApp(this)
        // Configurar el ViewModel para la gestión del login
        val loginVM : LoginViewModel by viewModels()
        // Establecer el contenido de la actividad usando Compose
        setContent {
            ProyectoPMDMDINTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // NavManager se encarga de la navegación y muestra la interfaz de usuario correspondiente
                    NavManager(loginVM)
                }
            }
        }
    }
}