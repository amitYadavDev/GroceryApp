package amitapps.media.practice.model.repository

import amitapps.media.practice.model.Room.GroceryDatabase
import amitapps.media.practice.model.Room.entity.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {
    suspend fun insert(item: GroceryItems) = db.getGroceryDao().insert(item)
    suspend fun delete(item: GroceryItems) = db.getGroceryDao().delete(item)
    fun allGroceryItems() = db.getGroceryDao().getAllGroceryItems()
}