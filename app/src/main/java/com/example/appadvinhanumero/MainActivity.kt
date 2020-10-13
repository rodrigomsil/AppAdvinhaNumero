package com.example.appadvinhanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    val numero = Random(1).nextInt(100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verificar(view: View) {

        val tentativa = tentativaAcerto.text.toString().toInt()

        if(tentativa == numero){
            Toast.makeText(this, "Acertou!", Toast.LENGTH_SHORT).show();
        }else if(tentativa > numero){
            Toast.makeText(this, "Maior!", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Menor!", Toast.LENGTH_SHORT).show();
        }
    }
}