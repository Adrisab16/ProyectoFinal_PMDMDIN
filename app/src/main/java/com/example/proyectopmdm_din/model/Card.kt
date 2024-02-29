package com.example.proyectopmdm_din.model

/**
 * Define el modelo de datos para una carta. Utilizado para gestionar las cartas en la base de datos.
 */
data class Card(
    val id: String,
    val title: String,
    val description: String
)