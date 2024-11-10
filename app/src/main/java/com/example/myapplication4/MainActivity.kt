package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    private var stateView: LotView? = null
    private var stateView1: LotView? = null
    private var stateView2: LotView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stateView = findViewById<LotView>(R.id.stateView)
        stateView1 = findViewById<LotView>(R.id.stateView1)
        stateView2 = findViewById<LotView>(R.id.stateView2)
    }


    fun bt1(v: View) {
        stateView?.setState(this, 2)
        stateView1?.setState(this, 0)
        stateView2?.visibility =View.GONE
    }
}