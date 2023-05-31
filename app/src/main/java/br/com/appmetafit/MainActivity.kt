package br.com.appmetafit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var botaoLogin: Button
    lateinit var botaoCadastro: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoLogin = findViewById(R.id.buttonLogin)

        botaoCadastro = findViewById(R.id.buttonCadastrarNovaConta)

        botaoCadastro.setOnClickListener {
            setContentView(R.layout.activity_from_create_account)
        }
        botaoLogin.setOnClickListener {
            setContentView(R.layout.activity_form_login)
        }
    }
}