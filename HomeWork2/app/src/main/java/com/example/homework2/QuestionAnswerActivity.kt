package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import kotlin.system.exitProcess

class QuestionAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_answer)

        val wordButton: Button = findViewById(R.id.wordButton)

        val cardViewText1: TextView = findViewById(R.id.textView1)
        val cardViewText2: TextView = findViewById(R.id.textView2)
        val cardViewText3: TextView = findViewById(R.id.textView3)
        val cardViewText4: TextView = findViewById(R.id.textView4)

        wordButton.text = intent.getStringExtra("word")

        cardViewText1.text = intent.getStringArrayExtra("answers")?.get(0)
        cardViewText2.text = intent.getStringArrayExtra("answers")?.get(1)
        cardViewText3.text = intent.getStringArrayExtra("answers")?.get(2)
        cardViewText4.text = intent.getStringArrayExtra("answers")?.get(3)

        var bar: ProgressBar = findViewById(R.id.progress_circular)
        var text: TextView = findViewById(R.id.countdown_time)

        var progress : Int


        var timer = object: CountDownTimer(20000, 1000){
            override fun onTick(timeLeft: Long) {
                progress = (timeLeft.toInt() / 1000)
                update(bar, text, progress)
            }
            override fun onFinish() {


            }
        }
        timer.start()
    }

    private fun update(bar: ProgressBar, text: TextView, progres: Int){
        bar.progress = progres * 5
        text.text = "$progres"
    }


}