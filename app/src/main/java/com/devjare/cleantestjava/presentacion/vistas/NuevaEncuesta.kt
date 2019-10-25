package com.devjare.cleantestjava.presentacion.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.devjare.cleantestjava.R
import kotlinx.android.synthetic.main.activity_main.*

class NuevaEncuesta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNuevaEncuesta.setOnClickListener(View.OnClickListener {

        })
    }
}
