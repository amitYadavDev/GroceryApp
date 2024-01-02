package amitapps.media.practice.ui

import amitapps.media.practice.model.Room.entity.GroceryItems
import amitapps.media.practice.model.repository.GroceryRepository
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository): ViewModel() {
    fun insert(item: GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }

    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }

    fun allGroceryItems() = repository.allGroceryItems()
}