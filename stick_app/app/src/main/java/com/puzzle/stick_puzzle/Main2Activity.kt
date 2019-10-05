package com.puzzle.stick_puzzle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

        var editText: TextView = findViewById(R.id.editText)
        editText.text = "残り本数：" + Integer.toString(count()) + "本"

        button33.setOnClickListener{ onClick(button33,button34, button35, button21, button11, button32, button31, button43, button55) }
        button34.setOnClickListener{ onClick(button34,button35, button36, button22, button12, button33, button32, button44, button56) }
        button35.setOnClickListener{ onClick(button35,button36, button37, button23, button13, button34, button33, button45, button57) }

        button43.setOnClickListener{ onClick(button43,button44, button45, button33, button21, button42, button41, button55, button65) }
        button44.setOnClickListener{ onClick(button44,button45, button46, button34, button22, button43, button42, button56, button66) }
        button45.setOnClickListener{ onClick(button45,button46, button47, button35, button23, button44, button43, button57, button67) }

        button53.setOnClickListener{ onClick(button53,button54, button55, button41, button31, button52, button51, button63, button73) }
        button54.setOnClickListener{ onClick(button54,button55, button56, button42, button32, button53, button52, button64, button74) }
        button55.setOnClickListener{ onClick(button55,button56, button57, button43, button33, button54, button53, button65, button75) }
        button56.setOnClickListener{ onClick(button56,button57, button58, button44, button34, button55, button54, button66, button76) }
        button57.setOnClickListener{ onClick(button57,button58, button59, button45, button35, button56, button55, button67, button77) }
        button58.setOnClickListener{ onClick(button58,button59, button510, button46, button36, button57, button56, button68, button78) }
        button59.setOnClickListener{ onClick(button59,button510, button511, button47, button37, button58, button57, button69, button79) }

        button63.setOnClickListener{ onClick(button63,button64, button65, button53, button41, button62, button61, button73, button81) }
        button64.setOnClickListener{ onClick(button64,button65, button66, button54, button42, button63, button62, button74, button82) }
        button65.setOnClickListener{ onClick(button65,button66, button67, button55, button43, button64, button63, button75, button83) }
        button66.setOnClickListener{ onClick(button66,button67, button68, button56, button44, button65, button64, button76, button84) }
        button67.setOnClickListener{ onClick(button67,button68, button69, button57, button45, button66, button65, button77, button85) }
        button68.setOnClickListener{ onClick(button68,button69, button610, button58, button46, button67, button66, button78, button86) }
        button69.setOnClickListener{ onClick(button69,button610, button611, button59, button47, button68, button67, button79, button87) }

        button73.setOnClickListener{ onClick(button73,button74, button75, button63, button53, button72, button71, button81, button91) }
        button74.setOnClickListener{ onClick(button74,button75, button76, button64, button54, button73, button72, button82, button92) }
        button75.setOnClickListener{ onClick(button75,button76, button77, button65, button55, button74, button73, button83, button93) }
        button76.setOnClickListener{ onClick(button76,button77, button78, button66, button56, button75, button74, button84, button94) }
        button77.setOnClickListener{ onClick(button77,button78, button79, button67, button57, button76, button75, button85, button95) }
        button78.setOnClickListener{ onClick(button78,button79, button710, button68, button58, button77, button76, button86, button96) }
        button79.setOnClickListener{ onClick(button79,button710, button711, button69, button59, button78, button77, button87, button97) }

        button83.setOnClickListener{ onClick(button83,button84, button85, button75, button65, button82, button81, button93, button101) }
        button84.setOnClickListener{ onClick(button84,button85, button86, button76, button66, button83, button82, button94, button102) }
        button85.setOnClickListener{ onClick(button85,button86, button87, button77, button67, button84, button83, button95, button103) }

        button93.setOnClickListener{ onClick(button93,button94, button95, button83, button75, button92, button91, button101, button111) }
        button94.setOnClickListener{ onClick(button94,button95, button96, button84, button76, button93, button92, button102, button112) }
        button95.setOnClickListener{ onClick(button95,button96, button97, button85, button77, button94, button93, button103, button113) }
    }

    fun onClick(b: Button, br: Button, brr: Button, bu: Button, buu: Button, bl: Button, bll: Button, bd: Button, bdd: Button){
        // 移動可否の判断処理
        if(b.getTag()=="checked"){

            var rFlg: Boolean = false
            var uFlg: Boolean = false
            var lFlg: Boolean = false
            var dFlg: Boolean = false

            if(isMovable(br,brr)){
                brr.setBackgroundResource(R.drawable.highlight)
                deactivateButton()
                brr.setTag("highlight_r")
                rFlg = true
            }
            if(isMovable(bu,buu)){
                buu.setBackgroundResource(R.drawable.highlight)
                deactivateButton()
                buu.setTag("highlight_u")
                uFlg = true
            }
            if(isMovable(bl,bll)){
                bll.setBackgroundResource(R.drawable.highlight)
                deactivateButton()
                bll.setTag("highlight_l")
                lFlg = true
            }
            if(isMovable(bd,bdd)){
                bdd.setBackgroundResource(R.drawable.highlight)
                deactivateButton()
                bdd.setTag("highlight_d")
                dFlg = true
            }


            if(rFlg){brr.isClickable = true}
            if(uFlg){buu.isClickable = true}
            if(lFlg){bll.isClickable = true}
            if(dFlg){bdd.isClickable = true}

        }

        // ジャンプ処理
        if(b.getTag()=="highlight_r"){
            resetButtonLooks()
            b.setTag("checked")
            b.setBackgroundResource(R.drawable.btn_checked)

            bll.setTag("unchecked")
            bll.setBackgroundResource(R.drawable.btn_unchecked)
            bl.setTag("unchecked")
            bl.setBackgroundResource(R.drawable.btn_unchecked)

            activateButton()

        }else if(b.getTag()=="highlight_u"){
            resetButtonLooks()
            b.setTag("checked")
            b.setBackgroundResource(R.drawable.btn_checked)

            bdd.setTag("unchecked")
            bdd.setBackgroundResource(R.drawable.btn_unchecked)
            bd.setTag("unchecked")
            bd.setBackgroundResource(R.drawable.btn_unchecked)

            activateButton()
        }else if(b.getTag()=="highlight_l"){
            resetButtonLooks()
            b.setTag("checked")
            b.setBackgroundResource(R.drawable.btn_checked)

            brr.setTag("unchecked")
            brr.setBackgroundResource(R.drawable.btn_unchecked)
            br.setTag("unchecked")
            br.setBackgroundResource(R.drawable.btn_unchecked)

            activateButton()
        }else if(b.getTag()=="highlight_d"){
            resetButtonLooks()
            b.setTag("checked")
            b.setBackgroundResource(R.drawable.btn_checked)

            buu.setTag("unchecked")
            buu.setBackgroundResource(R.drawable.btn_unchecked)
            bu.setTag("unchecked")
            bu.setBackgroundResource(R.drawable.btn_unchecked)

            activateButton()
        }


        var editText: TextView = findViewById(R.id.editText)
        editText.text = "残り本数：" + Integer.toString(count()) + "本"

    }

    fun count(): Int{
        var cnt:Int = 0
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


        if(button33.getTag()=="checked"){
            cnt++
        }
        if(button34.getTag()=="checked"){
            cnt++
        }
        if(button35.getTag()=="checked"){
            cnt++
        }


        if(button43.getTag()=="checked"){
            cnt++
        }
        if(button44.getTag()=="checked"){
            cnt++
        }
        if(button45.getTag()=="checked"){
            cnt++
        }


        if(button53.getTag()=="checked"){
            cnt++
        }
        if(button54.getTag()=="checked"){
            cnt++
        }
        if(button55.getTag()=="checked"){
            cnt++
        }
        if(button56.getTag()=="checked"){
            cnt++
        }
        if(button57.getTag()=="checked"){
            cnt++
        }
        if(button58.getTag()=="checked"){
            cnt++
        }
        if(button59.getTag()=="checked"){
            cnt++
        }


        if(button63.getTag()=="checked"){
            cnt++
        }
        if(button64.getTag()=="checked"){
            cnt++
        }
        if(button65.getTag()=="checked"){
            cnt++
        }
        if(button66.getTag()=="checked"){
            cnt++
        }
        if(button67.getTag()=="checked"){
            cnt++
        }
        if(button68.getTag()=="checked"){
            cnt++
        }
        if(button69.getTag()=="checked"){
            cnt++
        }


        if(button73.getTag()=="checked"){
            cnt++
        }
        if(button74.getTag()=="checked"){
            cnt++
        }
        if(button75.getTag()=="checked"){
            cnt++
        }
        if(button76.getTag()=="checked"){
            cnt++
        }
        if(button77.getTag()=="checked"){
            cnt++
        }
        if(button78.getTag()=="checked"){
            cnt++
        }
        if(button79.getTag()=="checked"){
            cnt++
        }

        if(button83.getTag()=="checked"){
            cnt++
        }
        if(button84.getTag()=="checked"){
            cnt++
        }
        if(button85.getTag()=="checked"){
            cnt++
        }


        if(button93.getTag()=="checked"){
            cnt++
        }
        if(button94.getTag()=="checked"){
            cnt++
        }
        if(button95.getTag()=="checked"){
            cnt++
        }

        return cnt

    }

    fun resetButtonLooks(){
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



        if(button33.getTag()=="highlight_r" || button33.getTag()=="highlight_u" || button33.getTag()=="highlight_l" || button33.getTag()=="highlight_d"){
            button33.setTag("unchecked")
            button33.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button34.getTag()=="highlight_r" || button34.getTag()=="highlight_u" || button34.getTag()=="highlight_l" || button34.getTag()=="highlight_d"){
            button34.setTag("unchecked")
            button34.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button35.getTag()=="highlight_r" || button35.getTag()=="highlight_u" || button35.getTag()=="highlight_l" || button35.getTag()=="highlight_d"){
            button35.setTag("unchecked")
            button35.setBackgroundResource(R.drawable.btn_unchecked)
        }


        if(button43.getTag()=="highlight_r" || button43.getTag()=="highlight_u" || button43.getTag()=="highlight_l" || button43.getTag()=="highlight_d"){
            button43.setTag("unchecked")
            button43.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button44.getTag()=="highlight_r" || button44.getTag()=="highlight_u" || button44.getTag()=="highlight_l" || button44.getTag()=="highlight_d"){
            button44.setTag("unchecked")
            button44.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button45.getTag()=="highlight_r" || button45.getTag()=="highlight_u" || button45.getTag()=="highlight_l" || button45.getTag()=="highlight_d"){
            button45.setTag("unchecked")
            button45.setBackgroundResource(R.drawable.btn_unchecked)
        }



        if(button53.getTag()=="highlight_r" || button53.getTag()=="highlight_u" || button53.getTag()=="highlight_l" || button53.getTag()=="highlight_d"){
            button53.setTag("unchecked")
            button53.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button54.getTag()=="highlight_r" || button54.getTag()=="highlight_u" || button54.getTag()=="highlight_l" || button54.getTag()=="highlight_d"){
            button54.setTag("unchecked")
            button54.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button55.getTag()=="highlight_r" || button55.getTag()=="highlight_u" || button55.getTag()=="highlight_l" || button55.getTag()=="highlight_d"){
            button55.setTag("unchecked")
            button55.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button56.getTag()=="highlight_r" || button56.getTag()=="highlight_u" || button56.getTag()=="highlight_l" || button56.getTag()=="highlight_d"){
            button56.setTag("unchecked")
            button56.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button57.getTag()=="highlight_r" || button57.getTag()=="highlight_u" || button57.getTag()=="highlight_l" || button57.getTag()=="highlight_d"){
            button57.setTag("unchecked")
            button57.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button58.getTag()=="highlight_r" || button58.getTag()=="highlight_u" || button58.getTag()=="highlight_l" || button58.getTag()=="highlight_d"){
            button58.setTag("unchecked")
            button58.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button59.getTag()=="highlight_r" || button59.getTag()=="highlight_u" || button59.getTag()=="highlight_l" || button59.getTag()=="highlight_d"){
            button59.setTag("unchecked")
            button59.setBackgroundResource(R.drawable.btn_unchecked)
        }


        if(button63.getTag()=="highlight_r" || button63.getTag()=="highlight_u" || button63.getTag()=="highlight_l" || button63.getTag()=="highlight_d"){
            button63.setTag("unchecked")
            button63.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button64.getTag()=="highlight_r" || button64.getTag()=="highlight_u" || button64.getTag()=="highlight_l" || button64.getTag()=="highlight_d"){
            button64.setTag("unchecked")
            button64.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button65.getTag()=="highlight_r" || button65.getTag()=="highlight_u" || button65.getTag()=="highlight_l" || button65.getTag()=="highlight_d"){
            button65.setTag("unchecked")
            button65.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button66.getTag()=="highlight_r" || button66.getTag()=="highlight_u" || button66.getTag()=="highlight_l" || button66.getTag()=="highlight_d"){
            button66.setTag("unchecked")
            button66.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button67.getTag()=="highlight_r" || button67.getTag()=="highlight_u" || button67.getTag()=="highlight_l" || button67.getTag()=="highlight_d"){
            button67.setTag("unchecked")
            button67.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button68.getTag()=="highlight_r" || button68.getTag()=="highlight_u" || button68.getTag()=="highlight_l" || button68.getTag()=="highlight_d"){
            button68.setTag("unchecked")
            button68.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button69.getTag()=="highlight_r" || button69.getTag()=="highlight_u" || button69.getTag()=="highlight_l" || button69.getTag()=="highlight_d"){
            button69.setTag("unchecked")
            button69.setBackgroundResource(R.drawable.btn_unchecked)
        }


        if(button73.getTag()=="highlight_r" || button73.getTag()=="highlight_u" || button73.getTag()=="highlight_l" || button73.getTag()=="highlight_d"){
            button73.setTag("unchecked")
            button73.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button74.getTag()=="highlight_r" || button74.getTag()=="highlight_u" || button74.getTag()=="highlight_l" || button74.getTag()=="highlight_d"){
            button74.setTag("unchecked")
            button74.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button75.getTag()=="highlight_r" || button75.getTag()=="highlight_u" || button75.getTag()=="highlight_l" || button75.getTag()=="highlight_d"){
            button75.setTag("unchecked")
            button75.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button76.getTag()=="highlight_r" || button76.getTag()=="highlight_u" || button76.getTag()=="highlight_l" || button76.getTag()=="highlight_d"){
            button76.setTag("unchecked")
            button76.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button77.getTag()=="highlight_r" || button77.getTag()=="highlight_u" || button77.getTag()=="highlight_l" || button77.getTag()=="highlight_d"){
            button77.setTag("unchecked")
            button77.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button78.getTag()=="highlight_r" || button78.getTag()=="highlight_u" || button78.getTag()=="highlight_l" || button78.getTag()=="highlight_d"){
            button78.setTag("unchecked")
            button78.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button79.getTag()=="highlight_r" || button79.getTag()=="highlight_u" || button79.getTag()=="highlight_l" || button79.getTag()=="highlight_d"){
            button79.setTag("unchecked")
            button79.setBackgroundResource(R.drawable.btn_unchecked)
        }



        if(button83.getTag()=="highlight_r" || button83.getTag()=="highlight_u" || button83.getTag()=="highlight_l" || button83.getTag()=="highlight_d"){
            button83.setTag("unchecked")
            button83.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button84.getTag()=="highlight_r" || button84.getTag()=="highlight_u" || button84.getTag()=="highlight_l" || button84.getTag()=="highlight_d"){
            button84.setTag("unchecked")
            button84.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button85.getTag()=="highlight_r" || button85.getTag()=="highlight_u" || button85.getTag()=="highlight_l" || button85.getTag()=="highlight_d"){
            button85.setTag("unchecked")
            button85.setBackgroundResource(R.drawable.btn_unchecked)
        }

        if(button93.getTag()=="highlight_r" || button93.getTag()=="highlight_u" || button93.getTag()=="highlight_l" || button93.getTag()=="highlight_d"){
            button93.setTag("unchecked")
            button93.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button94.getTag()=="highlight_r" || button94.getTag()=="highlight_u" || button94.getTag()=="highlight_l" || button94.getTag()=="highlight_d"){
            button94.setTag("unchecked")
            button94.setBackgroundResource(R.drawable.btn_unchecked)
        }
        if(button95.getTag()=="highlight_r" || button95.getTag()=="highlight_u" || button95.getTag()=="highlight_l" || button95.getTag()=="highlight_d"){
            button95.setTag("unchecked")
            button95.setBackgroundResource(R.drawable.btn_unchecked)
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
