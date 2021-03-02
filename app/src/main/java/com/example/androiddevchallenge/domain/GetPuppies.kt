package com.example.androiddevchallenge.domain

import com.example.androiddevchallenge.domain.model.Puppy
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class GetPuppies(private val puppyRepository: PuppyRepository) {

    operator fun invoke(
        scope: CoroutineScope,
        onResult: (
            Result<List<Puppy>>
        ) -> Unit
    ) {
        scope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching { puppyRepository.getPuppies() }
            }
            onResult(result)
        }
    }
}