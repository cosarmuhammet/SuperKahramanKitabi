package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycle_row.view.*

class RecyclerAdapter(val kahramanListesi: ArrayList<String>, val kahramanGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>(){
    // verimsiz tanımlamada ArrayList<Bitmap> olarak tanımlanmıştı

    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {

        //Inflater, LayoutInflater, MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycle_row, parent , false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        holder.itemView.recyclerViewTextView.text =  kahramanListesi.get(position)
        holder.itemView.setOnClickListener {//Tıklandığında ne olacağını bu kısımda tanımlıyoruz

            val intent = Intent(holder.itemView.context , TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))

            intent.putExtra("superKahramanGorseli",kahramanGorselleri.get(position)) //verimli tanımlamadan sonra eklendi
/*
            val singleton = SingletonClass.SecilenKahraman          //ÖNEMLİ !
            singleton.gorsel = kahramanGorselleri.get(position)     //ÖNEMLİ !
*/

            holder.itemView.context.startActivity(intent)

        }


    }

    override fun getItemCount(): Int {
        //return 5    // kaç tane item olduğunun sayısı
        return kahramanListesi.size
    }


}