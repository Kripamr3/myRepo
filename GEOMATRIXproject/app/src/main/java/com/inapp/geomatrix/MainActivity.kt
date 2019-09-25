package com.inapp.geomatrix

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.graphics.BitmapFactory
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity(), CustomAdapter.OnUserClickListener {
    override fun onUserCick(plants: plant) {


        Toast.makeText(this, plants.name, Toast.LENGTH_LONG).show()
        intent = objpass(this@MainActivity, plants)
        startActivity(intent)

    }

    private fun objpass(context: Context, plant1: plant): Intent {
        val intent = Intent(context, plantDetailsActivity::class.java)
        intent.putExtra("extrauser", plant1)
        return intent
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val plantnames = ArrayList<plant>()

//        setContentView(R.layout.activity_main)

        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant1),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant2),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant3),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant1),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant1),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant1),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant2),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant3),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )
        plantnames.add(
            plant(
                BitmapFactory.decodeResource(resources, R.drawable.plant3),
                "Ameryllis",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem"
            )
        )


        //creating our adapter
        val adapter = CustomAdapter(plantnames, this,this)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter


    }


    override fun onBackPressed() {
        super.onBackPressed()
    }
}











