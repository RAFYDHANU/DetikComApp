package com.example.aplikasidetikcom.NewsAdapter

import com.example.aplikasidetikcom.R

data class news(var title: String, var desc:String,var photo: Int)


object NewsModel {
    val newlist = listOf<news>(
        news("pasar mai di kunjungi oleh banyak warga" ,
        "detikcom / 1 jam yang lalu",
        R.drawable.img_news1),

        news("kapal nelayan menyalurkan baksos kepada yang membutuhkan",
        "detikcom / 1 jam yang lalu",
        R.drawable.img_news2),

        news("Kemacetan mulai terjadi di jalur pantura",
        "detikcom / 1 jam yang lalu",
        R.drawable.img_news3),

        news("Jelang new normal Jakarta mulai macet kembali",
        "detikcom / 1 jam yang lalu",
         R.drawable.img_news4),

        news("sampoerna mendonasikan kepada indonesia untuk covid19",
        "detikcom / 1 jam yang lalu",
        R.drawable.img_news5),

        news("risma menjelaskan tentang virus corona kepada para kaopal",
        "detikcom / 5 jam yang lalu",
        R.drawable.img_news6),

        news("Banjir keritik para warga amerika kepada trump usai kematia george floyd",
        "detikcom / 6 jam yang lalu",
        R.drawable.img_news7),

        news("mengapa aksi demo george floyd menjadi rusuh di maerika??",
        "detikcom / 7 jam yang lalu",
        R.drawable.img_news8),

        news("pada tahun ini jamaah haji tidak di perbolehkan berangkat",
        "detikcom / 8 jam yang lalu ",
        R.drawable.img_news4)


    )
}