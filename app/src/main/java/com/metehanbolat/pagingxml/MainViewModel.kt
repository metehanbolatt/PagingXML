package com.metehanbolat.pagingxml

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.metehanbolat.pagingxml.data.dto.Character
import com.metehanbolat.pagingxml.domain.repository.RickAndMortyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: RickAndMortyRepository
) : ViewModel() {

    private val _character = MutableLiveData<Character>()
    val character: LiveData<Character> get() = _character

    fun getAllCharacter() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getAllCharacter()
                .onStart { println("onStart") }
                .onCompletion { println("onCompletion") }
                .collect {
                    _character.postValue(it)
                }
        }
    }

}