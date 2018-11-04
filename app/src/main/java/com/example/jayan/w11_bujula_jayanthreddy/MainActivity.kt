package com.example.jayan.w11_bujula_jayanthreddy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // Array for storing the sequence values
    var retrieve : ArrayList<Int> = arrayListOf(0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get all button id's
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
        // perform respective button operations
        when (v?.getId()) {
            R.id.button1 -> assign(1)
            R.id.button2 ->  assign(2)
            R.id.button3 -> assign(3)
            R.id.button4 -> assign(4)
            R.id.button5 -> assign(5)
            R.id.button6 -> assign(6)
            R.id.button7 -> assign(7)
            R.id.button8 -> assign(8)
            R.id.button9 -> assign(9)
            R.id.button10 -> assign(10)
            R.id.button11 -> assign(11)
            R.id.button12 -> assign(12)
            R.id.undo ->     {
                if (retrieve.size>1){
                    retrieve.removeAt(retrieve.size-1)
                    textview.text=retrieve.get(retrieve.size-1).toString()
                }
            }
            R.id.clear ->   {
                retrieve.clear()
                retrieve.add(0)
                textview.text="0"
            }
            else -> { // Note the block
                Log.d("RESULT:","x is neither 1 nor 2")
            }
        }    }
    // assigns value to the text view
    public fun assign(number: Int){
        var str = (retrieve.get(retrieve.size-1)+number).toString()
        textview.text = str
        retrieve.add(str.toInt())
    }
}
