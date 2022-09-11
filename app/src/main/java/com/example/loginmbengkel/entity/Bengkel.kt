package com.example.loginmbengkel.entity

class Bengkel (var name : String, var alamat : String, var tahunBerdiri: Int){

    companion object{
        @JvmField
        var listOfBengkel = arrayOf(
            Bengkel("Bengkel Rich Bryant", "Jalan Mami", 2016),
            Bengkel("Bengkel Cebokers",  "Jalan Hujan", 2018),
            Bengkel("Bengkel Gado", "Jalan kusendiri", 2019),
            Bengkel("Bengkel Neraka", "Jalan keuwuan", 2020),
            Bengkel("Bengkel Sendiri", "Jalan anmu", 2022)
        )
    }
}