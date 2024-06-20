package com.example.myapp

import androidx.core.content.MimeTypeFilter.matches
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// add the anotations from the espresso class created automatically
@LargeTest
@RunWith(AndroidJUnit4::class)
class EspressoTestManual {
    // add the class anotations to be tested
    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(HomeActivity::class.java)

    // add the functions to be tested these can be of any functions even the new functions
    @Test
    fun logintest() {
        //select the etui
        onView(withId(R.id.edui))
        //type into etui -- hai rakesh
            .perform(typeText("hai rakesh"), closeSoftKeyboard());
        //click the button
        onView(withId(R.id.btnui)).perform(click());
        //assert the tvui has hai rakesh
        onView(withId(R.id.tvui))
            .check(matches(withText("hai rakesh")));

    }
}

private fun Any.perform(text: Any, closeSoftKeyboard: Any) {
    TODO("Not yet implemented")
}

