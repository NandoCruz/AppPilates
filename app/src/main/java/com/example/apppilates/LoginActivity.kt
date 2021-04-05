package com.example.apppilates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // declarando variáveis e vinculando o xml ao java
        var avancar = findViewById<Button>(R.id.btnAvancarSenha) as Button;
        avancar.setOnClickListener(this)
    } // Fim do OnCreate

    // OnClick - Vai para Tela Alterar Senha
    override fun onClick(v: View?) {
        val intent = Intent(applicationContext, ProfissionalActivity::class.java)
        startActivity(intent)
    } // Fim do OnClick - Vai para tela alterar Senha

} // Fim da Classe
