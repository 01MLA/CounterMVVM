package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(private val _repository: CounterRepository) : ViewModel() {

    private val _count = mutableIntStateOf(_repository.getCounter().count)

    // express the count as an immutable state
    val count: MutableState<Int> = _count

    fun incremnet() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decremnet() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }


}