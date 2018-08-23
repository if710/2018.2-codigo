package br.ufpe.cin.if710.primeiraaula

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/*
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
*/

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //Código Kotlin com "sotaque" Java
        val labelTexto = findViewById(R.id.labelTexto) as TextView
        labelTexto.setText("Mudou no código")
        val campoTexto = findViewById<EditText>(R.id.campoTexto)
        val botao = findViewById<Button>(R.id.botao)
        botao.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                labelTexto.setText(campoTexto.text)
            }
        })
        //TextView labelTexto = findViewById(R.id.labelTexto);
        */

        //Acessando properties diretamente
        labelTexto.text = "Mudou no código"

        //Várias formas de setar o Listener com lambda expressions
        //botao.setOnClickListener(View.OnClickListener { v -> labelTexto.text = campoTexto.text })
        //botao.setOnClickListener({ v -> labelTexto.text = campoTexto.text })
        //botao.setOnClickListener(){ v -> labelTexto.text = campoTexto.text }
        //botao.setOnClickListener(){ labelTexto.text = campoTexto.text }
        botao.setOnClickListener { labelTexto.text = campoTexto.text }

    }
}
