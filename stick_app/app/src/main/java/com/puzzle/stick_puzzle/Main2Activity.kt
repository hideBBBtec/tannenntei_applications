package com.puzzle.stick_puzzle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




    }


    override fun onTouchEvent(event: MotionEvent) :Boolean {
        return super.onTouchEvent(event)
    }
}
