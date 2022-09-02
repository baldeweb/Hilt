package dev.baldewb.hilt.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.baldewb.hilt.data.model.SWAPIModel
import dev.baldewb.hilt.domain.SWAPIRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SWAPIViewModel @Inject constructor(val repository: SWAPIRepository): ViewModel() {
    private var _startships = MutableLiveData<SWAPIModel>()
    val startships : LiveData<SWAPIModel> = _startships

    fun getStarships() {
        viewModelScope.launch {
            val response = repository.getStartships().body()
            _startships.value = response
        }
    }
}