package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri hazırlığı

        var superKahramanIsımleri = ArrayList<String>()
        superKahramanIsımleri.add("Batman")
        superKahramanIsımleri.add("Superman")
        superKahramanIsımleri.add("Dr Strange")
        superKahramanIsımleri.add("Iron Man")
        superKahramanIsımleri.add("Dr Octopus")

        //Verimsiz tanımlamalar
/*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val drstrangeBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.drstrange)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val droctopusBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.droctopus)

        var superKahramanGorselleri = ArrayList<Bitmap>()   //Görselleri arrayliste aktarma
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(drstrangeBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(droctopusBitmap)
*/

        //Verimli Tanımlamalar

        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val drstrangeDrawableId = R.drawable.drstrange
        val ironmanDrawableId = R.drawable.ironman
        val droctopusDrawableId = R.drawable.droctopus

        var superKahramanDrawableListesi = ArrayList<Int>()

        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(drstrangeDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(droctopusDrawableId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsımleri,superKahramanDrawableListesi)
        recyclerView.adapter = adapter


    }


    }