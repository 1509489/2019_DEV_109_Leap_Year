package com.a2019_dev_109.leap_year

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Contract.View {
    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)
    }

    override fun showIsLeapYearOrNot(isLeapYear: Boolean) {
        val message: String
        val year = etYear.text.toString()

        if (isLeapYear){
            message = "$year ${resources.getString(R.string.is_leap_year)}"
            tvMessage.text = message
        }
        else{
            message = "$year ${resources.getString(R.string.not_leap_year)}"
            tvMessage.text = message
        }
    }

    fun onCheckYear(v: View){
        when(v.id){
            R.id.btnCheck ->{
                val year = etYear.text.toString()
                presenter.isLeapYear(year.toInt())
                etYear.onEditorAction(EditorInfo.IME_ACTION_DONE)
            }
        }
    }
}
