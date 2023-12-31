package amitapps.media.practice.model.Room.Dao

import amitapps.media.practice.model.Room.entity.GroceryItems
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GroceryDao {
    @Insert(onConflict = onConflictStrategy.REPLACE)
    suspend fun insert(item : GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query("SELECT * FROM grocery_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}