package com.example.lucaa.precogasolina

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gasolina.*

class GasolinaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gasolina)

        Btncalcular.setOnClickListener{
            val telaResultado = Intent(this,ResultadoActivity::class.java)

            telaResultado.putExtra("Valor da Gasolina",TIGs.editText?.text.toString())
            telaResultado.putExtra("Valor do Alcool",TIAl.editText?.text.toString())


            startActivity(telaResultado)
        }





    }





}
