package com.example.androiddevchallenge.domain.model

data class Puppy(
    val name: String,
    val breed: String,
    val imageUrl: String,
    val gender: Gender,
    val type: Type,
    val description: String,
    val age: String
)
