package com.example.loginmbengkel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var inputUsername: TextInputLayout
    private lateinit var inputPassword: TextInputLayout
    private lateinit var mainLayout: ConstraintLayout

    private lateinit var username : TextView
    private lateinit var password : TextView
    private lateinit var email : TextView
    private lateinit var tanggalLahir : TextView
    private lateinit var nomorTelepon : TextView

    lateinit var vUsername : String
    lateinit var vPassword : String
    lateinit var vEmail : String
    lateinit var vTanggalLahir : String
    lateinit var vNomorTelepon : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("User Login")

        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)

        val btnClear : Button = findViewById(R.id.btnClear)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnRegister : Button = findViewById(R.id.btnRegister)


        btnClear.setOnClickListener{
            inputUsername.getEditText()?.setText("")
            inputPassword.getEditText()?.setText("")

            Snackbar.make(mainLayout,"Text Cleared Success", Snackbar.LENGTH_LONG).show()
        }
        btnLogin.setOnClickListener (View.OnClickListener{
            var checkLogin = false
            val username : String = inputUsername.getEditText()?.getText().toString()
            val password : String = inputPassword.getEditText()?.getText().toString()

            if(username.isEmpty()){
                inputUsername.setError("Username must be filled with text")
                checkLogin = false
            }

            if(password.isEmpty()){
                inputPassword.setError("Username must be filled with text")
                checkLogin = false
            }

            if (username == vUsername && password == vPassword) checkLogin = true
            if (!checkLogin) return@OnClickListener
            val moveHome = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(moveHome)

        })

        btnRegister.setOnClickListener {
            lateinit var mBundle: Bundle
            val intent = Intent(this, RegisterActivity::class.java)


            startActivity(intent)
        }

    }
}