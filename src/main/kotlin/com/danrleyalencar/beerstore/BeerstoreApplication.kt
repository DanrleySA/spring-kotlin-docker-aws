package com.danrleyalencar.beerstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeerstoreApplication

fun main(args: Array<String>) {
	runApplication<BeerstoreApplication>(*args)
}
