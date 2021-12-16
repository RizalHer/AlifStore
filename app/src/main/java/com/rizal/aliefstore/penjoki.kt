package com.rizal.aliefstore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.penjoki.*

class penjoki : Fragment() {
    lateinit var listTeman:ArrayList<MyJoki>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyJoki("Hilma Nadhila Ardani", "Perempuan", "hilmanadhila33@gmail.com", "087675438911",
                "Blitar")
        )
        listTeman.add(MyJoki("Ajeng Ayu Pramesti", "Perempuan", "ajengayup@gmail.com", "085616483210","Blitar"))
        listTeman.add(MyJoki("Arif Setiawan", "Laki-Laki", "arif1140@gmail.com", "089817651874", "Kediri"))
    }

    private fun tampilTeman(){
        rv_joki.layoutManager=LinearLayoutManager(activity)
        rv_joki.adapter=JokiAdapter(requireActivity(), listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.penjoki, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}