package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPassword : TextView
    lateinit var txtRegister : TextView
    val validMobileNumber = "0123456789"
    val validPassword = arrayOf("Arpita","Abhishek", "Dipika","Kanchan","Anuradha")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)



        btnLogin.setOnClickListener {
//            Toast.makeText(
//                this@LoginActivity,
//                "Clicked on Login Button",
//                Toast.LENGTH_LONG
//            ).show()

            val mobileNumber = etMobileNumber.text.toString()
            val password= etPassword.text.toString()

            var nameOfUser = "Unknown"

          //  if((mobileNumber == validMobileNumber) && (validPassword.contains(password))) {

            val intent = Intent(this@LoginActivity, MainActivity::class.java)

            if((mobileNumber ==validMobileNumber)) {

                if (password == validPassword[0]) {
                    nameOfUser = "Arpita"
                    startActivity(intent)
                    intent.putExtra("Name",nameOfUser)
                    finish()
                } else if (password == validPassword[1]) {
                    nameOfUser = "Abhishek"
                    intent.putExtra("Name",nameOfUser)
                    startActivity(intent)
                    finish()
                } else if (password == validPassword[2]) {
                    nameOfUser = "Dipika"
                    intent.putExtra("Name",nameOfUser)
                    startActivity(intent)
                    finish()
                } else if (password == validPassword[3]) {
                    nameOfUser = "Kanchan"
                    intent.putExtra("Name",nameOfUser)
                    startActivity(intent)
                    finish()
                } else if (password == validPassword[4]) {
                    nameOfUser == "Anuradha"
                    startActivity(intent)
                    intent.putExtra("Name",nameOfUser)
                    finish()
                }

            }

            else {

                Toast.makeText(this@LoginActivity, "Invalid Credentials",Toast.LENGTH_LONG).show()
            }



    }


    }
}