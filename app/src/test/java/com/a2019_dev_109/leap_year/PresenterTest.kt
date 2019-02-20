package com.a2019_dev_109.leap_year

import org.junit.Before
import org.junit.Test

import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PresenterTest {

    private lateinit var presenter: Presenter
    private val year = 2016

    @Mock private lateinit var view: Contract.View

    @Before
    fun setUp() {
        presenter = Presenter(view)
    }

    @Test
    fun isLeapYear() {
        presenter.isLeapYear(year)
        verify(view).showIsLeapYearOrNot(true)
    }

    @Test
    fun isNotLeapYear() {
        presenter.isLeapYear(year)
        verify(view).showIsLeapYearOrNot(false)
    }
}