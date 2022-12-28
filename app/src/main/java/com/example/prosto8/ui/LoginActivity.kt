package com.example.prosto8.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prosto8.R

class LoginActivity : AppCompatActivity(), LoginView, View.OnClickListener
    {
        private lateint var etUsername : EditText
        private lateint var etPassword: EditText
        private lateint var btnLogin: Button
        private lateint var btnSignUp: Button
        private lateint var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        bindViews()
    }

    override fun bindViews() {
        etUsername = findViewById(R.id.et_username)
        etPassword = findViewById(R.id.et_password)
        btnLogin = findViewById(R.id.btn_login)
        btnSignUp = findViewById(R.id.btn_sign_up)
        progressBar = findViewById(R.id.progressbar)
        btnLogin.setOnClickListener(this)
        btnSignUp.setOnClickListener(this)
    }

        //authentication
    override fun showAuthError() {
        Toast.makeText(this, "Invalid username and/or password.",
            Toast.LENGTH_LONG).show()

    }
    override fun onClick(view: View) {

    }
        override fun getContext() : Context {
            return this
        }

        override fun hideProgress(){
        progressBar.visibility = View.GONE
    }
        override fun setUsernameError() {
            etUsername.error = "Username cannot be empty"
        }

        override fun setPasswordError() {
            etPassword.error = "Password cannot be empty"
        }

        override fun navigateToSignUp() {

        }

        override fun navigateToHome() {

        }


    }
