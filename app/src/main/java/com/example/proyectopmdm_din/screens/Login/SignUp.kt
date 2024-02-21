package com.example.proyectopmdm_din.screens.Login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.viewModels.LoginViewModel
import com.example.proyectopmdm_din.screens.Components.Alert

/**
 * @Composable función para representar la pantalla de registro (Sign-Up).
 *
 * Esta función toma un [NavController] y un [LoginViewModel] como parámetros para gestionar la navegación
 * y la lógica de autenticación respectivamente.
 *
 * @param navController Controlador de navegación para gestionar el flujo de navegación.
 * @param loginVM ViewModel que contiene la lógica y el estado relacionados con la autenticación.
 */
@Composable
fun SignUp(navController: NavController, loginVM: LoginViewModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        // Row para mostrar el encabezado en la parte superior.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.Top
        ) {
            Header()
        }

        // Campo de texto para introducir el nombre de usuario.
        OutlinedTextField(
            value = loginVM.userName,
            onValueChange = { loginVM.changeUserName(it) },
            label = { Text(text = "Username") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        // Campo de texto para introducir la dirección de correo electrónico.
        OutlinedTextField(
            value = loginVM.email,
            onValueChange = { loginVM.changeEmail(it) },
            label = { Text(text = "Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        // Campo de texto para introducir la contraseña.
        OutlinedTextField(
            value = loginVM.password,
            onValueChange = { loginVM.changePassword(it) },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )

        // Espaciado vertical entre los campos de texto y el botón de registro.
        Spacer(modifier = Modifier.height(20.dp))

        // Botón para realizar el registro.
        Button(
            onClick = {
                // Se intenta crear el usuario al hacer clic en el botón.
                // Se navega a la pantalla de inicio si el registro es exitoso.
                loginVM.createUser { navController.navigate("Home") }
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Registrarse")
        }

        // Se muestra un diálogo de alerta si [LoginViewModel.showAlert] es true.
        if (loginVM.showAlert) {
            Alert(
                title = "Alerta",
                message = "Usuario no creado correctamente",
                confirmText = "Aceptar",
                onConfirmClick = { loginVM.closeAlert() },
                onDismissClick = { }
            ) // DCS - ninguna acción en onDismissClick para que no oculte el diálogo
        }
    }
}