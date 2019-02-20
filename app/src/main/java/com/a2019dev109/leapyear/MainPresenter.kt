package com.a2019dev109.leapyear

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {

    override fun isLeapYear(year: Int) {
        if (divisibleBy400(year))
            view.showIsLeapYearOrNot(true)
        else if (divisibleBy4(year) && !divisibleBy100(year))
            view.showIsLeapYearOrNot(true)
        else
            view.showIsLeapYearOrNot(false)
    }

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