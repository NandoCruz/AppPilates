package com.example.apppilates

import android.content.Intent
import android.graphics.Outline
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewOutlineProvider
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declarando variáveis profissional e vinculando o xml ao java
        var prof = findViewById<Button> (R.id.btnProf) as Button;
        prof.setOnClickListener(this)

        // declarando variáveis cliente e vinculando o xml ao java
        var cliente = findViewById<Button> (R.id.btnCliente) as Button;
        cliente.setOnClickListener(this)
    } // Fim do OnCreate

    // Vai para tela de Login
    override fun onClick(v: View?) {
        val intent = Intent (applicationContext, LoginActivity::class.java)
        startActivity(intent)
    } // Fim do OnClick tela de Login

    /*/ Vai para tela de Login
    override fun onClick(v: View?) {
        val intent = Intent (applicationContext, ClienteActivity::class.java)
        startActivity(intent) */
    } // Fim do OnClick tela de Login
} // Fim da Classe
