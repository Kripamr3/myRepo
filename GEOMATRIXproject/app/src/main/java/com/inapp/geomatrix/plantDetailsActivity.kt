package com.inapp.geomatrix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.plantdetails.*
import android.graphics.Bitmap
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.inapp.geomatrix.R
import com.inapp.geomatrix.plant


class plantDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plantdetails)
//        var strUser = this.intent.getStringExtra("key")
//        val bitmap = this.intent.getParcelableExtra("BitmapImage") as Bitmap
//
//
//        stv1.text = strUser
//        imgscreen.setImageBitmap(bitmap)


//        val user1 = getIntent().getExtras().getExtra("extrauser") as? user
//
        val plant1 = getIntent().getSerializableExtra("extrauser") as? plant
        bigtext.text = plant1?.name
        bigimage.setImageBitmap(plant1?.img)


//        receivevalue()

        val fab: FloatingActionButton = findViewById(R.id.fab1)
        fab.setOnClickListener {
            setContentView(R.layout.addplant)
        }

    }
}

