package com.example.loginmbengkel.entity

class Pesan (var name : String, var namaBengkel : String){

    companion object{
        @JvmField
        var listOfPesan = arrayOf(
            Pesan("Bebek", "Bengkel Rich Bryan"),
            Pesan("Gantenk", "Bengkel Cebokers"),

            )
    }
}