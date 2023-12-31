package amitapps.media.practice.ui

import amitapps.media.practice.R
import amitapps.media.practice.model.Room.entity.GroceryItems
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroceryAdapter(var list: List<GroceryItems>, val viewModel: GroceryViewModel):
    RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder>() {
    //        @Override fun onCreateView
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GroceryAdapter.GroceryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.groceryadapter, parent, false)
        return GroceryViewHolder(view)
    }

    override fun onBindViewHolder(holder: GroceryAdapter.GroceryViewHolder, position: Int) {
        var currentPosition = list[position]
        holder.itemView.findViewById<TextView>(R.id.txtItemName).text = currentPosition.itemName
        holder.itemView.findViewById<TextView>(R.id.txtItemPrice).text = "${currentPosition.itemPrice}"
        holder.itemView.findViewById<TextView>(R.id.txtItemQuantity).text = "${currentPosition.itemQuantity}"
        holder.itemView.findViewById<ImageButton>(R.id.ibDelete).setOnClickListener {
            viewModel.delete(currentPosition)
        }
        // To get total cost
        if (position == list.size - 1) {
            var totalCost = 0
            for (i in 0 until list.size) {
                totalCost += list[i].itemPrice
            }
            holder.itemView.findViewById<TextView>(R.id.txtItemTotalCost).visibility = View.VISIBLE
            holder.itemView.findViewById<TextView>(R.id.txtTotalCostTitle).visibility = View.VISIBLE
            holder.itemView.findViewById<TextView>(R.id.txtItemTotalCost).text = "$totalCost"
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    inner class GroceryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}