package com.dragonrollscribe.drs.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.*
import com.dragonrollscribe.drs.R
import com.dragonrollscribe.drs.databinding.ActivityLoginBinding
import com.dragonrollscribe.drs.view.fragment.LoginFragment

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(binding.frame.id, LoginFragment())
            .commit()
    }
}