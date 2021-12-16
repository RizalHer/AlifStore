package com.rizal.aliefstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Joki : AppCompatActivity() {
    private lateinit var nama: EditText
    private lateinit var idServer: EditText
    private lateinit var nickMl: EditText
    private lateinit var rankAwal: EditText
    private lateinit var perBintang: EditText
    private lateinit var paket: EditText
    private lateinit var btnKirim : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joki)
        nama= findViewById(R.id.nama)
        idServer = findViewById(R.id.id_server)
        nickMl=findViewById(R.id.nick_ml)
        rankAwal=findViewById(R.id.rank)
        perBintang= findViewById(R.id.bintang)
        paket= findViewById(R.id.paket)

        btnKirim=findViewById(R.id.kirim)
        btnKirim.setOnClickListener{
            val pesan1 = nama.getText().toString()
            val pesan2 = idServer.getText().toString()
            val pesan3 = nickMl.getText().toString()
            val pesan4 = rankAwal.getText().toString()
            val pesan5 = perBintang.getText().toString()
            val pesan6 = paket.getText().toString()


            val semuapesan ="Nama :"+ pesan1 + "\n" + "Id dan Server :"+ pesan2 + "\n" + "Nick Ml :"+ pesan3 + "\n" +"Rank Awal :"+ pesan4 + "\n" + "per Bintang :"+ pesan5 + "\n"+ "Paketan :"+ pesan6 + "\n"

            val intent  = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, semuapesan)
            intent.putExtra("jid", "085258022025" + "@s.whatsapp.net")
            intent.setPackage("com.whatsapp")
            startActivity(intent)
        }
    }
}