package com.example.esraa.mvp

class Presenter{
    var modelObj=Model();
    fun modelCounterIncrement():(Int) {
        return modelObj.increaseCounter();
    }

}