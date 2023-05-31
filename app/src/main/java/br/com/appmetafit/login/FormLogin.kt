package br.com.appmetafit.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.appmetafit.R

class FormLogin : AppCompatActivity() {
    lateinit var campoEmail: EditText
    lateinit var campoSenha: EditText
    lateinit var botaoCriarNovaConta: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)


        botaoCriarNovaConta = findViewById(R.id.buttonCreateAccount)

        campoEmail = findViewById(R.id.emailFormLogin)
        campoSenha = findViewById(R.id.passwordFormLogin)

        botaoCriarNovaConta.setOnClickListener {
            setContentView(R.layout.activity_from_create_account)
        }
    }
}