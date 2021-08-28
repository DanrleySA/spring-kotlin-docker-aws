package com.danrleyalencar.beerstore.resource

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/beers")
class BeerResource {

    @GetMapping
    fun all() : List<String>{
        return listOf("Cãolorado", "Heineken", "Budweiser", "Bohemia")
    }
}