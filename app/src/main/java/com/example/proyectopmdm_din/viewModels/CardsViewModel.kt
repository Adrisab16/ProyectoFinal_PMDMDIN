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
class CardsViewModel() : ViewModel() {
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
     * Función suspendida para eliminar una tarjeta por su título tanto en Firestore como en la lista local.
     *
     * @param cardTitle Título de la tarjeta que se desea eliminar.
     * @throws Exception Se lanza si ocurre algún error durante la operación.
     */
    suspend fun deleteCardByTitle(cardTitle: String) {
        try {
            // Buscar la tarjeta en Firestore por título
            val querySnapshot = cardsCollection.whereEqualTo("title", cardTitle).get().await()

            // Si se encuentra la tarjeta, eliminarla
            for (document in querySnapshot.documents) {
                val card = document.toObject(Card::class.java)
                card?.let {
                    // Eliminar la tarjeta de Firestore
                    cardsCollection.document(it.id).delete().await()

                    // Eliminar la tarjeta de la lista local
                    cards.remove(it)
                }
            }
        } catch (e: Exception) {
            // Manejar la excepción de manera adecuada (puedes mostrar un mensaje de error, etc.)
            // Log.e("CardsViewModel", "Error al eliminar la tarjeta: $e")
            throw e
        }
    }

    /**
     * Función suspendida para actualizar una tarjeta por su título tanto en Firestore como en la lista local.
     *
     * @param title Título de la tarjeta que se desea actualizar.
     * @param newTitle Nuevo título para la tarjeta.
     * @param newDescription Nueva descripción para la tarjeta.
     */
    suspend fun updateCardByTitle(title: String, newTitle: String, newDescription: String) {
        // Buscar la tarjeta en Firestore por título
        val querySnapshot = cardsCollection.whereEqualTo("title", title).get().await()

        // Si se encuentra la tarjeta, actualizarla
        for (document in querySnapshot.documents) {
            val card = document.toObject(Card::class.java)
            card?.let {
                // Actualizar la tarjeta en Firestore
                cardsCollection.document(it.id).update(
                    mapOf(
                        "title" to newTitle,
                        "description" to newDescription
                    )
                ).await()

                // Actualizar la tarjeta en la lista local
                it.title = newTitle
                it.description = newDescription
            }
        }
    }

    /**
     * Función suspendida para obtener todas las tarjetas tanto desde Firestore como desde la lista local.
     *
     * @return Lista de objetos [Card] que representan las tarjetas.
     */
    suspend fun getAllCards(): List<Card> {
        // Obtener todas las tarjetas desde Firestore
        val querySnapshot = cardsCollection.get().await()

        // Mapear los documentos a objetos de tipo Card
        return querySnapshot.documents.mapNotNull {
            it.toObject(Card::class.java)
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