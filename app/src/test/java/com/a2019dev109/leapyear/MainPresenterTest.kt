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
    private val year = 2016

    @Mock private lateinit var view: MainContract.View

    @Before
    fun setUp() {
        mainPresenter = MainPresenter(view)
    }

    @Test
    fun isLeapYear() {
        mainPresenter.isLeapYear(year)
        verify(view).showIsLeapYearOrNot(true)
    }

    @Test
    fun isNotLeapYear() {
        mainPresenter.isLeapYear(year)
        verify(view).showIsLeapYearOrNot(false)
    }
}