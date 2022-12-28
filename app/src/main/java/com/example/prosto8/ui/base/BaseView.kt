package com.example.prosto8.ui.base

import android.content.Context


interface BaseView {
    fun bindViews()
    fun getContext() : Context
}