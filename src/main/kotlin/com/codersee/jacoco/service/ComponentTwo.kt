package com.codersee.jacoco.service

import com.codersee.jacoco.CoderseeAnnotation
import org.springframework.stereotype.Component

@CoderseeAnnotation
@Component
class ComponentTwo {
    fun two(arg: Int): Double =
        if (arg > 0)
            10.0
        else
            20.0
}