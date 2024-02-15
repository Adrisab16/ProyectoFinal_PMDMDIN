package com.example.proyectopmdm_din.views.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.proyectopmdm_din.header.Header
import com.example.proyectopmdm_din.signupfield.LinkLogin
import com.example.proyectopmdm_din.signupfield.SignUpField

@Composable
fun SignUp(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        // Primer Row en la parte superior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.Top
        ) { Header() }
        Row(modifier = Modifier
            .height(1000.dp)
            .width(600.dp)
            .padding(30.dp)
            .padding(top = 15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            SignUpField(
                linkLogin = {navController.navigate("Login")},
                signUpButton = {navController.navigate("Home")})
        }
    }
}