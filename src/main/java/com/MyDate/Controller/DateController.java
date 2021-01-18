package com.MyDate.Controller;

import com.MyDate.DataFetch.MovieFetch;
import com.MyDate.Entities.Movie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @Autowired
    private MovieFetch movieFetch;

    @GetMapping("/")
    public String check() {
        return "Hello";
    }

    @GetMapping("/fight")
    public Movie[] getFightMovies() throws JsonMappingException, JsonProcessingException {
        Movie[] movies = movieFetch.getAllFightMovies();
        return movies;
    }

}
