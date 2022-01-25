package com.codersee.jacoco.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ComponentTwoTest {

    private val componentTwo = ComponentTwo()

    @Test
    fun testNumberOnePositive() {
        val result = componentTwo.two(100)

        assertEquals(10.0, result)
    }

}