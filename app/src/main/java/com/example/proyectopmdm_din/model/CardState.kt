package com.example.proyectopmdm_din.model

import android.media.Image

/**
 * Define el modelo de datos para una carta. Utilizado para gestionar las cartas en la base de datos.
 */
data class CardState(
    val cardId: String,
    val rareIcon: Image,
    val nameCharacter: String,
    val typeIcon: Image,
    val image: Image,
    val descTxt: String
)