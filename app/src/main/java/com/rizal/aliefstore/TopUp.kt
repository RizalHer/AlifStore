package com.rizal.aliefstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TopUp : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnml: Button
    private lateinit var btnff: Button
    private lateinit var btnpubg: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_up)
        btnml= findViewById(R.id.btn_ml)
        btnml.setOnClickListener(this)

        btnff = findViewById(R.id.btn_ff)
        btnff.setOnClickListener(this)

        btnpubg = findViewById(R.id.btn_pubg)
        btnpubg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn_ml -> run {
                    val intent = Intent(this, Ml::class.java)
                    startActivity(intent)
                }
                R.id.btn_ff -> run {
                    val intent = Intent(this, Ff::class.java)
                    startActivity(intent)
                }
                R.id.btn_pubg -> run {
                    val intent = Intent(this, Pubg::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}