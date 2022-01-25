package com.codersee.jacoco.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ComponentOneTest {

    private val componentOne = ComponentOne()

    @Test
    fun testNumberOne() {
        val result = componentOne.one()

        assertEquals("example", result)
    }

    @Test
    fun testNumberTwoPositive() {
        val result = componentOne.two(100)

        assertEquals(10.0, result)
    }

    @Test
    fun testNumberTwoNegative() {
        val result = componentOne.two(-100)

        assertEquals(20.0, result)
    }
}