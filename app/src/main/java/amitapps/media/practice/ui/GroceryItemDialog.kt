package amitapps.media.practice.ui

import amitapps.media.practice.R
import amitapps.media.practice.model.Room.entity.GroceryItems
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog

class GroceryItemDialog(context: Context,var dialogListener: DialogListener):AppCompatDialog(context) {
    val tvSave : TextView? = findViewById(R.id.tvSave)
    val etItemName: EditText? = findViewById(R.id.etItemName)
    val etItemQuantity: EditText? = findViewById(R.id.etItemQuantity)
    val etItemPrice: EditText? = findViewById(R.id.etItemPrice)
    val tvCancel: TextView? = findViewById(R.id.tvCancel)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.grocerydialog)

        tvSave?.setOnClickListener {

            val name = etItemName?.text.toString()
            val quantity = etItemQuantity?.text.toString().toInt()
            val price = etItemPrice?.text.toString().toInt()

            if (name.isEmpty()){
                Toast.makeText(context,"Please Enter Item Name",Toast.LENGTH_SHORT).show()
            }

            val item = GroceryItems(name , quantity , price)
            dialogListener.onAddButtonClicked(item)
            dismiss()

        }

        tvCancel?.setOnClickListener {
            cancel()
        }
    }
}