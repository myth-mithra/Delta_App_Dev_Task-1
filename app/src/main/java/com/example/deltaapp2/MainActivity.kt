package com.example.deltaapp2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

val random = Random()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var highscore = 0
        var lives = 3
        val btn00 = findViewById<Button>(R.id.button00)
        val btn01 = findViewById<Button>(R.id.button01)
        val btn10 = findViewById<Button>(R.id.button10)
        val btn11 = findViewById<Button>(R.id.button11)
        val btn20 = findViewById<Button>(R.id.button20)
        val btn21 = findViewById<Button>(R.id.button21)
        val btn30 = findViewById<Button>(R.id.button30)
        val btn31 = findViewById<Button>(R.id.button31)
        val btn40 = findViewById<Button>(R.id.button40)
        val btn41 = findViewById<Button>(R.id.button41)
        val txt02 = findViewById<TextView>(R.id.textView02)
        val txt12 = findViewById<TextView>(R.id.textView12)
        val txt22 = findViewById<TextView>(R.id.textView22)
        val txt32 = findViewById<TextView>(R.id.textView32)
        val txt42 = findViewById<TextView>(R.id.textView42)
        val btn50 = findViewById<Button>(R.id.button50)
        val btn51 = findViewById<Button>(R.id.button51)
        val btn52 = findViewById<Button>(R.id.button52)
        val btn53 = findViewById<Button>(R.id.button53)
        val btn54 = findViewById<Button>(R.id.button54)
        val btn60 = findViewById<Button>(R.id.button60)
        val btn61 = findViewById<Button>(R.id.button61)
        val btn62 = findViewById<Button>(R.id.button62)
        val btn63 = findViewById<Button>(R.id.button63)
        val btn64 = findViewById<Button>(R.id.button64)

        val l1= listOf<Button>(btn00,btn01,btn10,btn11,btn20,btn21,btn30,btn31,btn40,btn41,btn50,btn51,btn52,btn53,btn54,btn60,btn61,btn62,btn63,btn64)

        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)
        fun rand(from: Int, to: Int) : Int {
            return random.nextInt(to - from) + from
        }

        fun numbers(a:Int,list1:List<Int>){
            if (a == 0) {
                btn00.setBackgroundColor(Color.parseColor("#808080"))
                btn01.setBackgroundColor(Color.parseColor("#808080"))
                btn10.setBackgroundColor(Color.parseColor("#808080"))
                btn11.setBackgroundColor(Color.parseColor("#808080"))
                btn20.setBackgroundColor(Color.parseColor("#808080"))
                btn21.setBackgroundColor(Color.parseColor("#808080"))
                btn30.setBackgroundColor(Color.parseColor("#808080"))
                btn31.setBackgroundColor(Color.parseColor("#808080"))
                btn40.setBackgroundColor(Color.parseColor("#808080"))
                btn41.setBackgroundColor(Color.parseColor("#808080"))
                btn00.text = ""
                btn01.text = ""
                btn10.text = ""
                btn11.text = ""
                btn20.text = ""
                btn21.text = ""
                btn30.text = ""
                btn31.text = ""
                btn40.text = ""
                btn41.text = ""
                btn50.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn51.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn52.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn53.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn54.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn60.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn61.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn62.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn63.setBackgroundColor(Color.parseColor("#42F2F7"))
                btn64.setBackgroundColor(Color.parseColor("#42F2F7"))
            val add1= rand(1,100)
            val add2=rand(1,100)
            var sub1=rand(1,100)
            var sub2=rand(1,100)
            operator fun Any.compareTo(any: Any): Int {
                return 0
            }
            if (sub1<sub2){
                val temp=sub1
                sub1=sub2
                sub2=temp
            }
            val mul1=rand(1,20)
            val mul2=rand(1,20)
            var div1=rand(1,100)
            var div2=rand(1,100)
            if (div1<div2){
                var temp=div1
                div1=div2
                div2=temp
            }
            val add3=rand(1,100)
            val add4=rand(1,100)

            operator fun Any.plus(add2: Any) {
            }
            val sum1=add1+add2
            val sum2=add3+add4


            val diff=sub1-sub2
            //operator fun Any.times(any: Any) {
            //}
            val prod=mul1*mul2
            operator fun Any.div(any: Any) {
            }
            val div=div1/div2
            txt02.text = sum1.toString()
            txt12.text = diff.toString()
            txt22.text = prod.toString()
            txt32.text = div.toString()
            txt42.text = sum2.toString()

            val list1 = listOf<Any>(add1, add2, sub1, sub2, mul1, mul2, div1, div2, add3, add4)
            val l = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
            val list: MutableList<Int> = mutableListOf()
            while (list.size != 10) {
                val randomIndex = random.nextInt(l.size)
                val ran = l[randomIndex]
                if (ran !in list) {
                    list += ran
                }
            }
            btn50.text = list1[list[0]].toString()
            btn51.text = list1[list[1]].toString()
            btn52.text = list1[list[2]].toString()
            btn53.text = list1[list[3]].toString()
            btn54.text = list1[list[4]].toString()
            btn60.text = list1[list[5]].toString()
            btn61.text = list1[list[6]].toString()
            btn62.text = list1[list[7]].toString()
            btn63.text = list1[list[8]].toString()
            btn64.text = list1[list[9]].toString()
            var memory = ""
            fun handleButtonClick(view: View) {
                with (view as Button) {
                    Log.d("TAG", "$text, $id")
                }
                if (view.text!="" && memory == "") {
                    memory = view.text.toString()
                    view.text = ""
                    view.setBackgroundColor(Color.parseColor("#808080"))
                } else if (view.text=="" && memory != "") {
                    view.text = memory
                    view.setBackgroundColor(Color.parseColor("#42F2F7"))
                    memory = ""
                }
            }

            for (i in l1){
                i.setOnClickListener(::handleButtonClick)
            }
            btn.setOnClickListener{
            if (btn00.text!="" && btn01.text!="" && btn10.text!="" && btn11.text!="" && btn20.text!="" && btn21.text!="" && btn30.text!="" && btn31.text!="" && btn40.text!="" && btn41.text!="" && btn50.text=="" && btn51.text=="" && btn52.text=="" && btn53.text=="" && btn54.text=="" && btn60.text=="" && btn61.text=="" && btn62.text=="" && btn63.text=="" && btn64.text=="" ) {
                var score = 0
                val addition=btn00.text.toString().toInt() + btn01.text.toString().toInt()
                val subract=btn10.text.toString().toInt() - btn11.text.toString().toInt()
                val multiply=btn20.text.toString().toInt() * btn21.text.toString().toInt()
                val division=btn30.text.toString().toInt() / btn31.text.toString().toInt()
                val addition2=btn40.text.toString().toInt() + btn41.text.toString().toInt()
                if (addition==txt02.text.toString().toInt()){
                    score+=2
                }
                if (subract==txt12.text.toString().toInt()){
                    score+=2
                }
                if (multiply==txt22.text.toString().toInt()){
                    score+=2
                }
                if (division==txt32.text.toString().toInt()){
                    score+=2
                }
                if (addition2==txt42.text.toString().toInt()){
                    score+=2
                }
                if (score>highscore){
                    highscore=score
                }
                if (score == 10) {
                    Toast.makeText(this, "congratulations,u have got full marks!", Toast.LENGTH_LONG).show()
                    numbers(0, list1 as List<Int>)
                }
                else if (lives > 1) {
                    Toast.makeText(
                        this,
                        "please try again.\nYour highScore right now is = $highscore",
                        Toast.LENGTH_LONG
                    ).show()
                    lives--
                    txt.text = "Lives Remaining = " + lives.toString()
                    numbers(1, list1 as List<Int>)
                }
                else {
                    Toast.makeText(
                        this,
                        "Good luck next time.\nYour High Score = $highscore",
                        Toast.LENGTH_LONG
                    ).show()
                    highscore = 0
                    lives = 3
                    txt.text = "Lives Remaining = " + lives.toString()
                    numbers(0, list1 as List<Int>)
                }
            }
            else{
                    Toast.makeText(this, "finish to get score", Toast.LENGTH_LONG).show()
                }
        }
        }
        }
        numbers(0,listOf())
    }
}












