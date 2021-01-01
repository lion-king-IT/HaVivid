package com.reo.running.havivid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //アニメーションを延期するためのHandler
    val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animation()
        animation2()
        animation3()
    }

    private fun animation() {
            //変化前と変化後の値
            val fadeAnim = AlphaAnimation(0.0f,1.0f)
            //五秒掛けて実行する
            fadeAnim.duration = 5000
            fadeAnim.fillAfter = true
            //life_title.animation = fadeAnim
    }

    private fun animation2() {
        Handler(Looper.getMainLooper()).postDelayed({
            //変化前と変化後の値
            val fadeAnim = AlphaAnimation(0.0f,1.0f)
            //五秒掛けて実行する
            fadeAnim.fillAfter = true
            //life_title.animation = fadeAnim
        },3000)
    }

    private fun animation3() {
        Handler(Looper.getMainLooper()).postDelayed({
            //変化前と変化後の値
            val fadeAnim = AlphaAnimation(0.0f,1.0f)
            //五秒掛けて実行する
            fadeAnim.fillAfter = true
            //name_title.animation = fadeAnim
        },6000)
    }
}