package com.a2019_dev_109.leap_year

class Presenter(private val view: Contract.View): Contract.Presenter {

    override fun isLeapYear(year: Int) {
        if (divisibleBy400(year))
            view.showIsLeapYearOrNot(true)
        else if (divisibleBy100(year) && divisibleBy400(year))
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