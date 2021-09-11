package com.example.homework2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment


class WordTestFragment : Fragment() {

    private lateinit var startbuton: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_word_test, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startbuton = view?.findViewById(R.id.startbuton)!!

        var word: String = "Visualize"
        val answers: Array<String> = arrayOf("Görselleştirmek", "Altında", "Bağış", "Ensülin")

        startbuton.setOnClickListener {
            context?.startActivity<QuestionAnswerActivity>({
               this.putExtra("word", word)
                this.putExtra("answers", answers)
            })
        }



    }



}