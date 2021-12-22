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

    lateinit var listjoki:ArrayList<MyJoki>

    private fun simulasiDataJoki(){
        listjoki= ArrayList()
        listjoki.add(MyJoki("Ergi", "ergi9191@gmail.com", "Mage", "Mhitic"))
        listjoki.add(MyJoki("Alief","Alief71@gmail.com", "Fighter","Legend"))
        listjoki.add(MyJoki("Bobby", "Bobbyp01@gmail.com","Jungler, Marksman", "Legend"))
    }

    private fun tampilJoki(){
        rv_joki.layoutManager=LinearLayoutManager(activity)
        rv_joki.adapter=JokiAdapter(requireActivity(), listjoki)
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
        simulasiDataJoki()
        tampilJoki()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}