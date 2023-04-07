package com.example.praktikum2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var PahlawanList: ArrayList<Pahlawan>
    private lateinit var PahlawanAdapter: PahlawanAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)

        PahlawanList = ArrayList()

        PahlawanList.add(Pahlawan(R.drawable.aminoto,"H.Oemar Said Tjokroaminoto"))
        PahlawanList.add(Pahlawan(R.drawable.bonjol,"Tuanku Imam Bonjol"))
        PahlawanList.add(Pahlawan(R.drawable.dewi,"Raden Dewi Sartika"))
        PahlawanList.add(Pahlawan(R.drawable.dinata,"Otto Iskandar Dinata"))
        PahlawanList.add(Pahlawan(R.drawable.diponegoro,"Pangeran Diponegoro"))
        PahlawanList.add(Pahlawan(R.drawable.jenderal,"Jenderal Soedirman"))
        PahlawanList.add(Pahlawan(R.drawable.kapitan,"Kapitan Pattimura"))
        PahlawanList.add(Pahlawan(R.drawable.malaka,"Tan Malaka"))
        PahlawanList.add(Pahlawan(R.drawable.nyak,"Tjut Nyak Dhien"))
        PahlawanList.add(Pahlawan(R.drawable.pangeran,"Pangeran Antasari"))
        PahlawanList.add(Pahlawan(R.drawable.soetomo,"Dr. Soetomo"))
        PahlawanList.add(Pahlawan(R.drawable.sultan,"Sultan Hasanuddin"))
        PahlawanList.add(Pahlawan(R.drawable.wr,"W.R Soepratman"))
        PahlawanList.add(Pahlawan(R.drawable.wahid,"K.H. Abdul Wahid Hasjim"))
        PahlawanList.add(Pahlawan(R.drawable.yani,"Achmad Yani"))

        PahlawanAdapter= PahlawanAdapter(PahlawanList)
        recyclerView.adapter = PahlawanAdapter

        PahlawanAdapter.onItemClick= {
            val intent=Intent(this, DetailActivity::class.java)
            intent.putExtra("Pahlawan", it)
            startActivity(intent)
        }
    }
}