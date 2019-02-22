package com.a2019dev109.leapyear

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {

    private var validInput = false

    override fun isLeapYear(year: String) {
        if (year.length < 4 || year.length > 4){
            view.showMessage("Year is either too long or short. Year should be like: (2000 or 1901)")
            validInput = false
        }else if (!year.matches(Regex("\\d+"))){
            view.showMessage("Year should not contain alphabets or special characters")
            validInput = false
        }
        else {
            validInput = true
            if (divisibleBy400(year.toInt()))
                view.showIsLeapYearOrNot(true)
            else if (divisibleBy4(year.toInt()) && !divisibleBy100(year.toInt()))
                view.showIsLeapYearOrNot(true)
            else
                view.showIsLeapYearOrNot(false)
        }

    }

    fun isValidInput(): Boolean = validInput

    private fun divisibleBy400(year: Int):Boolean{
        return year % 400 == 0
    }

    private fun divisibleBy100(year: Int):Boolean{
        return year % 100 == 0
    }

    private fun divisibleBy4(year: Int):Boolean{
        return year % 4 == 0
    }
}