package com.mashup.friendlycoding.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModel
import com.mashup.friendlycoding.R
import com.mashup.friendlycoding.model.RunModel

class CodeBlock(var funcName: String, var argument : Int = 0, var address : Int = 0, var type : Int = 0)

class CodeBlockViewModel : ViewModel() {
    val sunnyImage: Int = R.drawable.ic_sunny
    var mRun = RunModel()

    fun insertBlockModeOff() {
        mRun.blockInsertMode = false
        Log.e("해제", "${mRun.blockInsertMode}")
    }

    fun clearBlock() {
        Log.e("새로고침", " ")
        mRun.clearBlock()
    }

    fun addNewBlock(codeBlock: CodeBlock) {
        Log.e("${codeBlock.funcName} ", "ddddddd")
        mRun.addNewBlock(codeBlock)
    }

    fun coloringNowProcessing(view: View?) {
        if (view == null)
            return
        view.setBackgroundResource(R.color.processing)
    }

    fun coloringNowTerminated(view: View?) {
        if (view == null)
            return
        view.setBackgroundResource(R.color.Invisible)
    }

    @SuppressLint("SetTextI18n")
    fun insertBlock(view : View?, funcName: String) {
        if (view == null)
            return
        view.findViewById<TextView>(R.id.insertedBlock).text = "$funcName()"
    }

    fun run() {
        Log.e("RunModel", "실행")
        mRun.run()
    }

    fun changeBlockLevel(OpenOrClose : Boolean) {
        mRun.changeBlockLevel(OpenOrClose)
    }
}