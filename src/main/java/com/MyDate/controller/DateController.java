package com.MyDate.controller;

import com.MyDate.dataFetch.MovieFetch;
import com.MyDate.entities.Movie;
import com.MyDate.entities.UserResponse;
import com.MyDate.services.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class DateController {

    @Autowired
    private MovieFetch movieFetch;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/fight")
    public Movie[] getFightMovies() throws JsonMappingException, JsonProcessingException {
        Movie[] movies = movieFetch.getAllFightMovies();
        return movies;
    }

    @PostMapping(value = "/preference")
    public ResponseEntity<String> updateuserData(@RequestBody UserResponse userResponse) {
    	System.out.println(userResponse.getDirection());
        return userService.saveData(userResponse);
    }

}
