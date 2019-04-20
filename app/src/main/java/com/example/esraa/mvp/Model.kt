package com.example.esraa.mvp

import android.util.Log

class Model{
    companion object {
        private  var counter=0;
    }
 fun increaseCounter():Int{
        counter=counter+1
     Log.v( "qwerty","inside function"+counter +"times");


     return counter;
    }
}