package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.domain.PuppyRepository
import com.example.androiddevchallenge.domain.model.Gender
import com.example.androiddevchallenge.domain.model.Puppy
import com.example.androiddevchallenge.domain.model.Type

class FakePuppyRepository : PuppyRepository {

    override suspend fun getPuppies(): List<Puppy> {
        return listOf(
            Puppy(
                name = "Buddy",
                breed = "Shiba Inu",
                imageUrl = "https://random.dog/6b3100c1-34a0-4795-8de6-82da13eec2af.jpg",
                gender = Gender.BOY,
                type = Type.DOG,
                description = "Buddy is an active, playful, yet friendly and loyal dog for our family. He loves to play fetch with people, and he don’t mind if strange people pet his head. Buddy loves to wake up in the morning and then wake you up too. He is friendly to everyone, even to cats and bunnies.",
                age = "1 year old"
            ),
            Puppy(
                name = "Cooter",
                breed = "Maine Coon",
                imageUrl = "https://purr.objects-us-east-1.dream.io/i/h8cHb.jpg",
                gender = Gender.GIRL,
                type = Type.CAT,
                description = "Cooter is an active, playful, yet friendly and loyal cat for our family. He loves to play fetch with people, and he don’t mind if strange people pet his head. Buddy loves to wake up in the morning and then wake you up too. He is friendly to everyone, even to cats and bunnies.",
                age = "6 months old"
            )
        )
    }
}