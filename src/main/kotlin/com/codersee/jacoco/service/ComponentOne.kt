package com.codersee.jacoco.service

import com.codersee.jacoco.CoderseeAnnotation
import org.springframework.stereotype.Component

@Component
class ComponentOne {

    @CoderseeAnnotation
    fun one(): String = "example"

    fun two(arg: Int): Double =
        if (arg > 0)
            10.0
        else
            20.0
}