package com.a2019dev109.leapyear

interface MainContract {
    interface View{
        fun showIsLeapYearOrNot(isLeapYear: Boolean)
    }
    interface Presenter{
        fun isLeapYear(year: Int)
    }
}