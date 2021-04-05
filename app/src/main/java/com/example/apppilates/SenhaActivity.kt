package com.example.apppilates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SenhaActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senha)

        // declarando variáveis e vinculando o xml ao java
        var prof = findViewById<Button> (R.id.btnT2Avancar) as Button;
        prof.setOnClickListener(this)

     } // Fom do OnCeate

    // OnClick
    override fun onClick(v: View?) {
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    } // Fim do Onclick

} // Fim da Classe
