package com.inapp.geomatrix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.content_dashboard_side_menu.view.*
import java.util.ArrayList
import com.inapp.geomatrix.plant as plant




class CustomAdapter(val plantList: ArrayList<plant>, mainActivity: MainActivity,private val onUserClick:OnUserClickListener) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_dashboard_side_menu, parent, false)

        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.plantImage.setImageBitmap(plantList[position].img)
        holder.plantName.text = plantList[position].name
        holder.plantdesc.text = plantList[position].desc
        onUserClick.onUserCick(plantList[position])


    }


    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return plantList.size
    }

    interface OnUserClickListener {
        fun onUserCick(plants: plant)
    }


    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var plantName:TextView = itemView.findViewById(R.id.lltv1) as TextView
        var plantdesc=itemView.findViewById(R.id.lltv2) as TextView
        var plantImage=itemView.findViewById(R.id.im1) as ImageView

    }
}
