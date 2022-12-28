package com.example.prosto8.ui

import com.example.prosto8.ui.auth.AuthView
import com.example.prosto8.ui.base.BaseView

interface LoginView : BaseView, AuthView {
    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun navigateToSignUp()
    fun navigateToHome()
}