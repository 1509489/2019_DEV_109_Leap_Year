package com.a2019dev109.leapyear

import org.junit.Before
import org.junit.Test

import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainPresenterTest {

    private lateinit var mainPresenter: MainPresenter

    @Mock private lateinit var view: MainContract.View

    @Before
    fun setUp() {
        mainPresenter = MainPresenter(view)
    }

    @Test
    fun isLeapYear() {
        val years = arrayOf("2016", "2001", "2018", "1900")

        years.forEach {
            mainPresenter.isLeapYear(it)
            when (it) {
                "2016" -> verify(view).showIsLeapYearOrNot(true)
                "2001" -> verify(view).showIsLeapYearOrNot(false)
                "2018" -> verify(view).showIsLeapYearOrNot(true)
                "1900" -> verify(view).showIsLeapYearOrNot(true)
            }
        }
    }

    @Test
    fun isValidYearFormat() {
        mainPresenter.isLeapYear(201.toString())
        verify(view).showMessage("Year is either too long or short. Year should be like: (2000 or 1901)")
    }

    @Test
    fun isValidInput(){
        mainPresenter.isLeapYear("-201")
        verify(view).showMessage("Year should not contain alphabets or special characters")
    }
}