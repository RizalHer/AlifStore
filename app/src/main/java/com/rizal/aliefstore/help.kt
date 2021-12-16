package com.rizal.aliefstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class help : AppCompatActivity() {
    private lateinit var masalah: EditText
    private lateinit var btnKirim : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
       masalah= findViewById(R.id.masalah)

        btnKirim=findViewById(R.id.kirim)
        btnKirim.setOnClickListener{
            val pesan1 = masalah.getText().toString()
            val semuapesan ="Masalah Yang dilaporkan :"+ pesan1 + "\n"
            val intent  = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, semuapesan)
            intent.putExtra("jid", "085258022025" + "@s.whatsapp.net")
            intent.setPackage("com.whatsapp")
            startActivity(intent)
    }
}}