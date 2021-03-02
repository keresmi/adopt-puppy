package com.example.androiddevchallenge.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androiddevchallenge.domain.GetPuppies
import com.example.androiddevchallenge.domain.model.Puppy

class MainViewModel(getPuppies: GetPuppies) : ViewModel() {

    private val _puppies: MutableLiveData<List<Puppy>> = MutableLiveData()
    val puppies: LiveData<List<Puppy>> = _puppies

    init {
        getPuppies(viewModelScope) { result ->
            result.onSuccess { _puppies.value = it }
        }
    }
}
