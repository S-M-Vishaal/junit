package com.example.SpringBootJunit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootJunit.entity.Movie;
import com.example.SpringBootJunit.service.MovieService;

@RestController

@RequestMapping("/movie")
public class MovieController {
	
	@Autowired

    MovieService movieService;

    @PostMapping(value="/insertMovie",consumes="application/json")
    public Movie insertMovie(@RequestBody Movie movie) {
                return movieService.insertMovie(movie);
       

}

}
