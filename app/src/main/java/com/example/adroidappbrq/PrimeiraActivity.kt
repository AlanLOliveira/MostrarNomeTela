package com.example.adroidappbrq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PrimeiraActivity : AppCompatActivity() {

    lateinit var campo1: EditText // Declarando Váriaveis Como Globais dando enter ele importa as bibliotecas automaticamente
    lateinit var botao1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)
        campo1 = findViewById(R.id.nome)       //instanciar variaveis
        botao1 = findViewById(R.id.button2)

        botao1.setOnClickListener (object : View.OnClickListener {   // configurar click do botão
            override fun onClick(v: View?) {
                val textoDigitado = campo1.text.toString()
                Toast.makeText(applicationContext, textoDigitado, Toast.LENGTH_LONG).show()

            //  Ação do botão - Class + construtor(1º Parametros, 2º Parametro Mensagem        , tempo de execução
                //Toast.makeText(applicationContext, "Mensagem Texte Uhhhhh", Toast.LENGTH_LONG).show()

            }

        })

    }
}
