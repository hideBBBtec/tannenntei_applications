package com.puzzle.stick_puzzle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button11: Button = findViewById(R.id.button11)
        val button12: Button = findViewById(R.id.button12)
        val button13: Button = findViewById(R.id.button13)
        val button21: Button = findViewById(R.id.button21)
        val button22: Button = findViewById(R.id.button22)
        val button23: Button = findViewById(R.id.button23)
        val button31: Button = findViewById(R.id.button31)
        val button32: Button = findViewById(R.id.button32)
        val button33: Button = findViewById(R.id.button33)
        val button34: Button = findViewById(R.id.button34)
        val button35: Button = findViewById(R.id.button35)
        val button36: Button = findViewById(R.id.button36)
        val button37: Button = findViewById(R.id.button37)
        val button41: Button = findViewById(R.id.button41)
        val button42: Button = findViewById(R.id.button42)
        val button43: Button = findViewById(R.id.button43)
        val button44: Button = findViewById(R.id.button44)
        val button45: Button = findViewById(R.id.button45)
        val button46: Button = findViewById(R.id.button46)
        val button47: Button = findViewById(R.id.button47)
        val button51: Button = findViewById(R.id.button51)
        val button52: Button = findViewById(R.id.button52)
        val button53: Button = findViewById(R.id.button53)
        val button54: Button = findViewById(R.id.button54)
        val button55: Button = findViewById(R.id.button55)
        val button56: Button = findViewById(R.id.button56)
        val button57: Button = findViewById(R.id.button57)
        val button58: Button = findViewById(R.id.button58)
        val button59: Button = findViewById(R.id.button59)
        val button510: Button = findViewById(R.id.button510)
        val button511: Button = findViewById(R.id.button511)
        val button61: Button = findViewById(R.id.button61)
        val button62: Button = findViewById(R.id.button62)
        val button63: Button = findViewById(R.id.button63)
        val button64: Button = findViewById(R.id.button64)
        val button65: Button = findViewById(R.id.button65)
        val button66: Button = findViewById(R.id.button66)
        val button67: Button = findViewById(R.id.button67)
        val button68: Button = findViewById(R.id.button68)
        val button69: Button = findViewById(R.id.button69)
        val button610: Button = findViewById(R.id.button610)
        val button611: Button = findViewById(R.id.button611)
        val button71: Button = findViewById(R.id.button71)
        val button72: Button = findViewById(R.id.button72)
        val button73: Button = findViewById(R.id.button73)
        val button74: Button = findViewById(R.id.button74)
        val button75: Button = findViewById(R.id.button75)
        val button76: Button = findViewById(R.id.button76)
        val button77: Button = findViewById(R.id.button77)
        val button78: Button = findViewById(R.id.button78)
        val button79: Button = findViewById(R.id.button79)
        val button710: Button = findViewById(R.id.button710)
        val button711: Button = findViewById(R.id.button711)
        val button81: Button = findViewById(R.id.button81)
        val button82: Button = findViewById(R.id.button82)
        val button83: Button = findViewById(R.id.button83)
        val button84: Button = findViewById(R.id.button84)
        val button85: Button = findViewById(R.id.button85)
        val button86: Button = findViewById(R.id.button86)
        val button87: Button = findViewById(R.id.button87)
        val button91: Button = findViewById(R.id.button91)
        val button92: Button = findViewById(R.id.button92)
        val button93: Button = findViewById(R.id.button93)
        val button94: Button = findViewById(R.id.button94)
        val button95: Button = findViewById(R.id.button95)
        val button96: Button = findViewById(R.id.button96)
        val button97: Button = findViewById(R.id.button97)
        val button101: Button = findViewById(R.id.button101)
        val button102: Button = findViewById(R.id.button102)
        val button103: Button = findViewById(R.id.button103)
        val button111: Button = findViewById(R.id.button111)
        val button112: Button = findViewById(R.id.button112)
        val button113: Button = findViewById(R.id.button113)



//        button0.setOnClickListener{ onClick(button0) }
//        button1.setOnClickListener{ onClick(button1) }
//        button2.setOnClickListener{ onClick(button2) }
//        button3.setOnClickListener{ onClick(button3) }
//        button4.setOnClickListener{ onClick(button4) }
//        button5.setOnClickListener{ onClick(button5) }
//        button6.setOnClickListener{ onClick(button6) }
//        button7.setOnClickListener{ onClick(button7) }
//        button8.setOnClickListener{ onClick(button8) }
//        button9.setOnClickListener{ onClick(button9) }
//        button10.setOnClickListener{ onClick(button10) }
//        button11.setOnClickListener{ onClick(button11) }
//        button12.setOnClickListener{ onClick(button12) }
//        button13.setOnClickListener{ onClick(button13) }
//        button14.setOnClickListener{ onClick(button14) }
//        button15.setOnClickListener{ onClick(button15) }
    }

    fun onClick(b: Button, br: Button, brr: Button, bu: Button, buu: Button, bl: Button, bll: Button, bd: Button, bdd: Button){
        if(b.getTag()=="checked"){




            b.setTag("unchecked")
            b.setBackgroundResource(R.drawable.btn_checked)
        }else{
            b.setTag("checked")
            b.setBackgroundResource(R.drawable.btn_unchecked)
        }

    }

    fun isMovable(a: Button, b: Button): Boolean {
        if(a.getTag()=="checked" && b.getTag()=="unchecked"){
            return true
        }else {
            return false
        }
    }

    fun deactivateButton(){

        val button33: Button = findViewById(R.id.button33)
        val button34: Button = findViewById(R.id.button34)
        val button35: Button = findViewById(R.id.button35)

        val button43: Button = findViewById(R.id.button43)
        val button44: Button = findViewById(R.id.button44)
        val button45: Button = findViewById(R.id.button45)

        val button53: Button = findViewById(R.id.button53)
        val button54: Button = findViewById(R.id.button54)
        val button55: Button = findViewById(R.id.button55)
        val button56: Button = findViewById(R.id.button56)
        val button57: Button = findViewById(R.id.button57)
        val button58: Button = findViewById(R.id.button58)
        val button59: Button = findViewById(R.id.button59)

        val button63: Button = findViewById(R.id.button63)
        val button64: Button = findViewById(R.id.button64)
        val button65: Button = findViewById(R.id.button65)
        val button66: Button = findViewById(R.id.button66)
        val button67: Button = findViewById(R.id.button67)
        val button68: Button = findViewById(R.id.button68)
        val button69: Button = findViewById(R.id.button69)

        val button73: Button = findViewById(R.id.button73)
        val button74: Button = findViewById(R.id.button74)
        val button75: Button = findViewById(R.id.button75)
        val button76: Button = findViewById(R.id.button76)
        val button77: Button = findViewById(R.id.button77)
        val button78: Button = findViewById(R.id.button78)
        val button79: Button = findViewById(R.id.button79)


        val button83: Button = findViewById(R.id.button83)
        val button84: Button = findViewById(R.id.button84)
        val button85: Button = findViewById(R.id.button85)

        val button93: Button = findViewById(R.id.button93)
        val button94: Button = findViewById(R.id.button94)
        val button95: Button = findViewById(R.id.button95)

        button33.isClickable = false
        button34.isClickable = false
        button35.isClickable = false

        button43.isClickable = false
        button44.isClickable = false
        button45.isClickable = false

        button53.isClickable = false
        button54.isClickable = false
        button55.isClickable = false
        button56.isClickable = false
        button57.isClickable = false
        button58.isClickable = false
        button59.isClickable = false

        button63.isClickable = false
        button64.isClickable = false
        button65.isClickable = false
        button66.isClickable = false
        button67.isClickable = false
        button68.isClickable = false
        button69.isClickable = false

        button73.isClickable = false
        button74.isClickable = false
        button75.isClickable = false
        button76.isClickable = false
        button77.isClickable = false
        button78.isClickable = false
        button79.isClickable = false

        button83.isClickable = false
        button84.isClickable = false
        button85.isClickable = false

        button93.isClickable = false
        button94.isClickable = false
        button95.isClickable = false

    }

    fun activateButton(){

        val button33: Button = findViewById(R.id.button33)
        val button34: Button = findViewById(R.id.button34)
        val button35: Button = findViewById(R.id.button35)

        val button43: Button = findViewById(R.id.button43)
        val button44: Button = findViewById(R.id.button44)
        val button45: Button = findViewById(R.id.button45)

        val button53: Button = findViewById(R.id.button53)
        val button54: Button = findViewById(R.id.button54)
        val button55: Button = findViewById(R.id.button55)
        val button56: Button = findViewById(R.id.button56)
        val button57: Button = findViewById(R.id.button57)
        val button58: Button = findViewById(R.id.button58)
        val button59: Button = findViewById(R.id.button59)

        val button63: Button = findViewById(R.id.button63)
        val button64: Button = findViewById(R.id.button64)
        val button65: Button = findViewById(R.id.button65)
        val button66: Button = findViewById(R.id.button66)
        val button67: Button = findViewById(R.id.button67)
        val button68: Button = findViewById(R.id.button68)
        val button69: Button = findViewById(R.id.button69)

        val button73: Button = findViewById(R.id.button73)
        val button74: Button = findViewById(R.id.button74)
        val button75: Button = findViewById(R.id.button75)
        val button76: Button = findViewById(R.id.button76)
        val button77: Button = findViewById(R.id.button77)
        val button78: Button = findViewById(R.id.button78)
        val button79: Button = findViewById(R.id.button79)


        val button83: Button = findViewById(R.id.button83)
        val button84: Button = findViewById(R.id.button84)
        val button85: Button = findViewById(R.id.button85)

        val button93: Button = findViewById(R.id.button93)
        val button94: Button = findViewById(R.id.button94)
        val button95: Button = findViewById(R.id.button95)

        button33.isClickable = true
        button34.isClickable = true
        button35.isClickable = true

        button43.isClickable = true
        button44.isClickable = true
        button45.isClickable = true

        button53.isClickable = true
        button54.isClickable = true
        button55.isClickable = true
        button56.isClickable = true
        button57.isClickable = true
        button58.isClickable = true
        button59.isClickable = true

        button63.isClickable = true
        button64.isClickable = true
        button65.isClickable = true
        button66.isClickable = true
        button67.isClickable = true
        button68.isClickable = true
        button69.isClickable = true

        button73.isClickable = true
        button74.isClickable = true
        button75.isClickable = true
        button76.isClickable = true
        button77.isClickable = true
        button78.isClickable = true
        button79.isClickable = true

        button83.isClickable = true
        button84.isClickable = true
        button85.isClickable = true

        button93.isClickable = true
        button94.isClickable = true
        button95.isClickable = true

    }
}
