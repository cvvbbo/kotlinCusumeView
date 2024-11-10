package com.example.myapplication4

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View


class LotView : View {
    private var paint: Paint? = null
    private val radius = 100 // 圆的半径

    // 构造方法1：仅带有Context参数
    constructor(context: Context?) : super(context) {
        init()
    }

    // 构造方法2：带有Context和AttributeSet参数
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    // 构造方法3：带有Context、AttributeSet和defStyleAttr参数
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    // 初始化Paint对象
    private fun init() {
        paint = Paint()
        paint!!.color = Color.BLUE // 设置颜色为蓝色
        paint!!.style = Paint.Style.FILL // 填充样式
        paint!!.isAntiAlias = true // 抗锯齿
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // 获取控件的中心点
        val cx = width / 2
        val cy = height / 2

        // 绘制一个圆
        canvas.drawCircle(cx.toFloat(), cy.toFloat(), radius.toFloat(), paint!!)
    }
}
