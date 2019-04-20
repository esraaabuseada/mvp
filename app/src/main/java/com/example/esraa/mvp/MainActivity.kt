package com.example.esraa.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  textView =findViewById<TextView>(R.id.textView)
        val increment = findViewById<Button>(R.id.increment)
        var presenterObj=Presenter();
    //    Log.v("teemo",presenterObj.modelCounterIncrement.toString());


        increment.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
            textView.text=presenterObj.modelCounterIncrement().toString()
         //  Log.v("yorick",presenterObj.modelCounterIncrement().toString());

            }

        } )

    }
}
