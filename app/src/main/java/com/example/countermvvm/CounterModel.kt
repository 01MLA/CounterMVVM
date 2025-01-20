package com.example.countermvvm

data class CounterModel(var count: Int)

class CounterRepository { // this is where all the data is owned and processed!

    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter() = _counter.count++

    fun decrementCounter() = _counter.count--
}