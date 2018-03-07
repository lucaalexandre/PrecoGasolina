package com.example.lucaa.precogasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if (intent !=null){
            val gasolina = intent.getStringExtra("Valor da Gasolina").toDouble()
            val alcool = intent.getStringExtra("Valor do Alcool").toDouble()

            val conta = alcool / gasolina

            if(conta <= 0.7){

                TVmostrar.text = "Abasteça com Álcool"
            }else{
                TVmostrar.text = "Abasteça com Gasolina"
            }
        }

    }
}
