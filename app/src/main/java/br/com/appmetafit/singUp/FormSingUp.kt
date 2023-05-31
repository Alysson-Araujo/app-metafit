package br.com.appmetafit.singUp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.appmetafit.R
import br.com.appmetafit.login.FormLogin

class FormSingUp : AppCompatActivity() {
    lateinit var botao1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_from_create_account)

        botao1 = findViewById(R.id.buttonRealizarCadastro)

        botao1.setOnClickListener {
            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show()
            irParaTelaLogin()
        }

    }

    private fun irParaTelaLogin() {
        startActivity(Intent(this, FormLogin::class.java))
    }
}