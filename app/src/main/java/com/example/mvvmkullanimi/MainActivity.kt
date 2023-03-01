package com.example.mvvmkullanimi

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       tasarim=DataBindingUtil.setContentView(this
               ,R.layout.activity_main)
        tasarim.textViewSonuc.text="0"
        tasarim.buttonToplama.setOnClickListener{
            val alinanSayi1=tasarim.editTextSayi1.text.toString()
            val alinanSayi2=tasarim.editTextSayi2.text.toString()
            val sayi1=alinanSayi1.toInt()
            val sayi2=alinanSayi2.toInt()
            val toplam=sayi1+sayi2
            tasarim.textViewSonuc.text=toplam.toString()
        }
        tasarim.buttonCarpma.setOnClickListener{
            val alinanSayi1=tasarim.editTextSayi1.text.toString()
            val alinanSayi2=tasarim.editTextSayi2.text.toString()
            val sayi1=alinanSayi1.toInt()
            val sayi2=alinanSayi2.toInt()
            val carpma=sayi1*sayi2
            tasarim.textViewSonuc.text=carpma.toString()
        }

}


    }

