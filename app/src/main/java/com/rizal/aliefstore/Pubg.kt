package com.rizal.aliefstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Pubg : AppCompatActivity() {
    private lateinit var nama: EditText
    private lateinit var idServer: EditText
    private lateinit var nickPubg: EditText
    private lateinit var uc: EditText
    private lateinit var sisa: EditText
    private lateinit var btnKirim : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pubg)
        nama= findViewById(R.id.nama)
        idServer = findViewById(R.id.id_server)
        nickPubg=findViewById(R.id.nick_pubg)
        uc=findViewById(R.id.uc)
        sisa= findViewById(R.id.sisa)

        btnKirim=findViewById(R.id.kirim)
        btnKirim.setOnClickListener{
            val pesan1 = nama.getText().toString()
            val pesan2 = idServer.getText().toString()
            val pesan3 = nickPubg.getText().toString()
            val pesan4 = uc.getText().toString()
            val pesan5 = sisa.getText().toString()


            val semuapesan ="Nama :"+ pesan1 + "\n" + "Id dan Server :"+ pesan2 + "\n" + "Nick PUBG :"+ pesan3 + "\n" +"Uc :"+ pesan4 + "\n" + "Sisa Uc :"+ pesan5 + "\n"

            val intent  = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, semuapesan)
            intent.putExtra("jid", "085258022025" + "@s.whatsapp.net")
            intent.setPackage("com.whatsapp")
            startActivity(intent)
        }
    }
}