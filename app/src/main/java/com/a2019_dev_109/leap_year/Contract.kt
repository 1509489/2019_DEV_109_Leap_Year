package com.a2019_dev_109.leap_year

interface Contract {
    interface View{
        fun showIsLeapYearOrNot(isLeapYear: Boolean)
    }
    interface Presenter{
        fun isLeapYear(year: Int)
    }
}