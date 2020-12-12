package com.example.movies.objects

class Movies(
    val id: Int,
    val title: String,
    val date: String,
    val language: String,
    val seasons: Int,
    val imageUrl: String,
    val cast: List<Cast>
)