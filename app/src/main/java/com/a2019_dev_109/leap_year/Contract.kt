package com.a2019_dev_109.leap_year

interface Contract {
    interface View{
        fun showIsLeapYearOrNot(isLeapYear: Boolean)
    }
    interface Presenter{
        fun isYearDivisibleBy400(year: Int):Boolean
        fun isYearDivisibleBy100(year: Int):Boolean
        fun isYearDivisibleBy4(year: Int):Boolean
        fun isLeapYear(year: Int)
    }
}