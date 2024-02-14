package com.example.proyectopmdm_din.model

/**
 * Define el modelo de datos para un usuario.
 * Utilizado para gestionar la información de los usuarios en la base de datos.
 */
data class UserModel(
    val userId: String,
    val email: String,
    val username: String,
)