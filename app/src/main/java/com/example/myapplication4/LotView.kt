package com.example.myapplication4


import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.example.myapplication4.R

public class LotView : FrameLayout {

    // 定义三种状态
    val STATE_ONE = 0
    val STATE_TWO = 1
    val STATE_THREE = 2

    private var currentState = STATE_ONE


    constructor(context: Context?) : super(context!!) {

        init(context, null)

    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs, 0) {
        init(context, attrs)
    }


    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context!!,
        attrs,
        defStyleAttr
    ) {
        init(context, attrs)
    }


    private fun init(context: Context, attrs: AttributeSet?) {
        if (attrs != null) {
            val array = context.obtainStyledAttributes(attrs, R.styleable.StatefulView)
            currentState = array.getInt(R.styleable.StatefulView_state, 0)
        }
        addView(updateView(context))
    }

    fun setState(ctx: Context, state: Int) {
        currentState = state
        removeAllViews()  // 移除当前所有子 View
        addView(updateView(ctx))  // 添加新的 View
    }

    fun getState(): Int {
        return currentState
    }


    private fun updateView(ctx: Context): View {
        var layout: Int = when (currentState) {
            STATE_ONE -> R.layout.state_one_layout
            STATE_TWO, STATE_THREE -> R.layout.state_two_layout
            else -> R.layout.state_two_layout
        }
        return LayoutInflater.from(ctx).inflate(layout, this, false)
    }


}
