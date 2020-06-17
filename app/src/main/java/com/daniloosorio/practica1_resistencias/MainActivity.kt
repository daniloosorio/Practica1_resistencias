package com.daniloosorio.practica1_resistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  franja1 =0
        rg_franja1.setOnClickListener {
            if(rb_cafe1.isChecked) franja1=1
            if(rb_rojo1.isChecked) franja1=2
            if(rb_naranja1.isChecked) franja1=3

        tv_resultado.text=franja1.toString()

        }


    }
}