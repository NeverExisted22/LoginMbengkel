package com.example.loginmbengkel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class RegisterActivity  : AppCompatActivity() {
    private lateinit var username: TextView
    private lateinit var password: TextView
    private lateinit var email: TextView
    private lateinit var tanggalLahir: TextView
    private lateinit var nomorTelepon: TextView
//    lateinit var mBundle : Bundle

    lateinit var vUsername: String
    lateinit var vPassword: String
    lateinit var vEmail: String
    lateinit var vTanggalLahir: String
    lateinit var vNomorTelepon: String


//    val btnRegister2: TextView = findViewById(R.id.btnRegister)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnRegister2 : Button = findViewById(R.id.btnRegister2)

        init()
        getBundle()
        setText()

        btnRegister2.setOnClickListener {
            val register = Intent(this, MainActivity::class.java)

            startActivity(register)
        }
    }

    private fun init() {
        username = findViewById(R.id.etUsername)
        password = findViewById(R.id.etPassword)
        tanggalLahir = findViewById(R.id.etTanggalLahir)
        nomorTelepon = findViewById(R.id.etNomorTelepon)
        email = findViewById(R.id.etEmail)

        vUsername = ""
        vPassword = ""
        vEmail = ""
        vTanggalLahir = ""
        vNomorTelepon = ""
    }

    private fun getBundle() {

        val mBundle = Bundle()

        //memasukan data kedalam bundle
        mBundle.putString("username", username.text.toString())
        mBundle.putString("password", password.text.toString())
        mBundle.putString("email", email.text.toString())
        mBundle.putString("tanggalLahir", tanggalLahir.text.toString())
        mBundle.putString("nomorTelepon", nomorTelepon.text.toString())

        //melakukan intent dengan memanggil bundle
        intent.putExtra("Register", mBundle)
    }

    private fun setText() {

        username.setText(vUsername)

        password.setText(vPassword)

        email.setText(vEmail)

        tanggalLahir.setText(vTanggalLahir)

        nomorTelepon.setText(vNomorTelepon)
    }
}