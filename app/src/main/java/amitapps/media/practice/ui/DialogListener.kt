package amitapps.media.practice.ui

import amitapps.media.practice.model.Room.entity.GroceryItems


interface DialogListener {

    // Create a function to add items
    // in GroceryItems on clicking
    fun onAddButtonClicked(item: GroceryItems)
}
