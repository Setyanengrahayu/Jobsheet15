package com.example.job15_setya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnnama = findViewById<Button>(R.id.nama)
        val btnkelas = findViewById<Button>(R.id.kelas)
        val btnnis = findViewById<Button>(R.id.nis)

        btnnama.setOnClickListener{
            Toast.makeText(this, "Setya Neng Rahayu", Toast.LENGTH_LONG).show()
        }

        btnkelas.setOnClickListener{
            Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_LONG).show()
        }

        btnnis.setOnClickListener{
            Toast.makeText(this, "3030", Toast.LENGTH_LONG).show()
        }
    }
}