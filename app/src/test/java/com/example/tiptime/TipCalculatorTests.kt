package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

/*

Write automated tests in the form of methods.
Annotate the method with the @Test annotation.
This lets the compiler know that the method is a
test method and runs the method accordingly.

*/

class TipCalculatorTests {

    @Test
    //fun calculateTip(amount: Double, tipPercent: Double, roundUp: Boolean)
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00 //double val
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip) //the test...
    }
}