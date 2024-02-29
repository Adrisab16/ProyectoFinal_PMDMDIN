package com.example.proyectopmdm_din.viewModels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.proyectopmdm_din.model.Card
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import kotlin.random.Random

/**
 * ViewModel para la gestión de cartas en la aplicación.
 *
 * Esta clase maneja la interacción con Firestore y gestiona las listas locales de cartas y cartas del usuario.
 */
class CardsViewModel : ViewModel() {
    private val firestore = FirebaseFirestore.getInstance()
    val cardsCollection = firestore.collection("cards")
    private val userCardsCollection = firestore.collection("user_cards")

    // Lista mutable de tarjetas
    val cards = mutableStateListOf<Card>()
    // Lista mutable de tarjetas del usuario
    val userCards = mutableStateListOf<Card>()

    /**
     * Función suspendida para agregar una tarjeta a Firestore y actualizar la lista local de tarjetas.
     *
     * @param title Título de la tarjeta.
     * @param description Descripción de la tarjeta.
     */
    suspend fun addCardToFirestore(title: String, description: String) {
        val newCard = hashMapOf(
            "title" to title,
            "description" to description
        )

        // Añadir la tarjeta a Firestore
        val documentReference = cardsCollection.add(newCard).await()
        val cardId = documentReference.id

        // Actualizar la lista local de tarjetas
        cards.add(Card(cardId, title, description))
    }

    /**
     * Función suspendida para eliminar una tarjeta por su ID de Firestore y actualizar la lista local de tarjetas.
     *
     * @param cardId ID de la tarjeta a eliminar.
     */
    suspend fun deleteCardById(cardId: String) {
        // Buscar la tarjeta en la lista local por ID
        val card = cards.find { it.title == cardId }

        // Si se encuentra la tarjeta, eliminarla
        card?.let {
            // Eliminar la tarjeta de Firestore
            cardsCollection.document(it.title).delete().await()

            // Eliminar la tarjeta de la lista local
            cards.remove(it)
        }
    }

    /**
     * Función suspendida para agregar una tarjeta a la biblioteca del usuario en Firestore y actualizar la lista local
     * de tarjetas del usuario.
     *
     * @param card Tarjeta a agregar a la biblioteca del usuario.
     */
    suspend fun addCardToUserLibrary(card: Card) {
        // Agregar la tarjeta a la colección del usuario en Firestore
        userCardsCollection.add(card).await()

        // Actualizar la lista local de tarjetas del usuario
        userCards.add(card)
    }

     /**
     * Función suspendida para obtener una tarjeta aleatoria desde Firestore.
     *
     * @return Tarjeta aleatoria o null si no se puede obtener.
     */
    suspend fun getRandomCard(): Card? {
        // Obtener todas las tarjetas desde Firestore
        val querySnapshot = cardsCollection.get().await()

        // Obtener una tarjeta aleatoria de la lista
        val randomIndex = Random.nextInt(querySnapshot.documents.size)
        val randomCardDocument = querySnapshot.documents[randomIndex]
        return randomCardDocument.toObject(Card::class.java)
    }
}