package com.example.androiddevchallenge.domain

import com.example.androiddevchallenge.domain.model.Puppy

interface PuppyRepository {
    suspend fun getPuppies(): List<Puppy>
}
