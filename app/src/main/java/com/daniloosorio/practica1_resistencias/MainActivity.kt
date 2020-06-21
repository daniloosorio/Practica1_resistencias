package com.daniloosorio.practica1_resistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clicked(view: View) {
        var  franja1 =0
        var  franja2 =0
        var franja3 =0F
        var franja4=""
        var multiplicador= ""
        var resistencia : Float
/////////////////////franja 1////////////////////////
        if(rb_cafe1.isChecked) franja1=1
        if(rb_rojo1.isChecked) franja1=2
        if(rb_naranja1.isChecked) franja1=3
        if(rb_amarillo1.isChecked) franja1=4
        if(rb_verde1.isChecked) franja1=5
        if(rb_azul1.isChecked) franja1=6
        if(rb_morado1.isChecked) franja1=7
        if(rb_gris1.isChecked) franja1=8
        if(rb_blanco1.isChecked) franja1=9
////////////////////// franja 2////////////////////
        if(rb_negro2.isChecked) franja2=0
        if(rb_cafe2.isChecked) franja2=1
        if(rb_rojo2.isChecked) franja2=2
        if(rb_naranja2.isChecked) franja2=3
        if(rb_amarillo2.isChecked) franja2=4
        if(rb_verde2.isChecked) franja2=5
        if(rb_azul2.isChecked) franja2=6
        if(rb_morado2.isChecked) franja2=7
        if(rb_gris2.isChecked) franja2=8
        if(rb_blanco2.isChecked) franja2=9
/////////////////////////franja 3/////////////////////////7
        if(rb_negro3.isChecked) franja3= 1F
        if(rb_cafe3.isChecked) franja3=10F
        if(rb_rojo3.isChecked) franja3=100F
        if(rb_naranja3.isChecked) franja3=1000F
        if(rb_amarillo3.isChecked) franja3=10000F
        if(rb_verde3.isChecked) franja3=100000F
        if(rb_azul3.isChecked) franja3=1000000F
        if(rb_morado3.isChecked) franja3=10000000F
        if(rb_gris3.isChecked) franja3=100000000F
        if(rb_blanco3.isChecked) franja3=1000000000F
        if(rb_dorado3.isChecked) franja3= 1/10F
        if(rb_plateado3.isChecked) franja3=1/100F
////////////////////franja 4///////////////////////////////
        if(rb_cafe4.isChecked) franja4= "1%"
        if(rb_rojo4.isChecked) franja4= "2%"
        if(rb_verde4.isChecked) franja4="0.5%"
        if(rb_azul4.isChecked) franja4="0.25%"
        if(rb_morado4.isChecked) franja4="0.1%"
        if(rb_gris4.isChecked) franja4="0.05%"
        if(rb_dorado4.isChecked) franja4="5%"
        if(rb_plateado4.isChecked) franja4="10%"
/////////////////////concatenacion y multiplicacion////////////////
        multiplicador="$franja1$franja2"
        resistencia= multiplicador.toFloat()*franja3
/////////////////////Asignacion de sufijos////////////////////////
        if(resistencia>1000000000) {
            resistencia=resistencia/1000000000
            tv_resultado.text= "$resistencia G Ω $franja4"
        }else if(resistencia>1000000){
            resistencia=resistencia/1000000
            tv_resultado.text= "$resistencia M Ω $franja4"
        }else if(resistencia>1000){
            resistencia=resistencia/1000
            tv_resultado.text= "$resistencia K Ω $franja4"
        }else{
            tv_resultado.text= "$resistencia Ω $franja4"
        }
    }
}