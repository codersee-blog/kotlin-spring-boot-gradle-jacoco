package com.codersee.jacoco

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JacocoApplication

fun main(args: Array<String>) {
    runApplication<JacocoApplication>(*args)
}


@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class CoderseeAnnotation