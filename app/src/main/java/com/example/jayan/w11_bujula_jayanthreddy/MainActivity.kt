package com.example.jayan.w11_bujula_jayanthreddy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var one : Button = findViewById(R.id.button1)
        one.setOnClickListener(this)
        var two : Button = findViewById(R.id.button2)
        two.setOnClickListener(this)
        var three : Button = findViewById(R.id.button3)
        three.setOnClickListener(this)
        var four : Button = findViewById(R.id.button4)
        four.setOnClickListener(this)
        var five : Button = findViewById(R.id.button5)
        five.setOnClickListener(this)
        var six : Button = findViewById(R.id.button6)
        six.setOnClickListener(this)
        var seven : Button = findViewById(R.id.button7)
        seven.setOnClickListener(this)
        var eight : Button = findViewById(R.id.button8)
        eight.setOnClickListener(this)
        var nine : Button = findViewById(R.id.button9)
        nine.setOnClickListener(this)
        var ten : Button = findViewById(R.id.button10)
        ten.setOnClickListener(this)
        var eleven : Button = findViewById(R.id.button11)
        eleven.setOnClickListener(this)
        var twelve : Button = findViewById(R.id.button12)
        twelve.setOnClickListener(this)
        var undo : Button = findViewById(R.id.undo)
        undo.setOnClickListener(this)
        var clear : Button = findViewById(R.id.clear)
        clear.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.getId()) {
            R.id.button1 ->  Log.d("RESULT:","x == 1")
            R.id.button2 ->  Log.d("RESULT:","x == 2")
            R.id.button3 ->  Log.d("RESULT:","x == 3")
            R.id.button4 ->  Log.d("RESULT:","x == 4")
            R.id.button5 ->  Log.d("RESULT:","x == 5")
            R.id.button6 ->  Log.d("RESULT:","x == 6")
            R.id.button7 ->  Log.d("RESULT:","x == 7")
            R.id.button8 ->  Log.d("RESULT:","x == 8")
            R.id.button9 ->  Log.d("RESULT:","x == 9")
            R.id.button10 -> Log.d("RESULT:","x == 10")
            R.id.button11 -> Log.d("RESULT:","x == 11")
            R.id.button12 -> Log.d("RESULT:","x == 12")
            R.id.undo ->     Log.d("RESULT:","x == 13")
            R.id.clear ->    Log.d("RESULT:","x == 14")
            else -> { // Note the block
                Log.d("RESULT:","x is neither 1 nor 2")
            }
        }    }
}
