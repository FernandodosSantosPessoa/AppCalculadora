package com.example.appcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appcalculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener{
            var num1= binding.edtNumero1.text.toString().toInt()
            var num2= binding.edtNumero2.text.toString().toInt()

            val resultado= num1 + num2
            binding.txtResultado.text= resultado.toString()
        }
    }
}