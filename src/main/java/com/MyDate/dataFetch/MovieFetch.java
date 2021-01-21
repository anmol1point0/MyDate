package com.MyDate.dataFetch;

import com.MyDate.entities.Movie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieFetch {

    public Movie[] getAllFightMovies() throws JsonMappingException, JsonProcessingException {
        String myApi = "https://api.themoviedb.org/3/search/movie?api_key=d3f4636f81c506a5e93e83bd9c3177f2&language=en-US&query=Fight";
        RestTemplate restTemplate = new RestTemplate();
        String MovieString = restTemplate.getForObject(myApi, String.class);
        JSONObject jsonObject = new JSONObject(MovieString);
        JSONArray jsonArray = jsonObject.getJSONArray("results");
        ObjectMapper objectMapper = new ObjectMapper();
        Movie[] movies = objectMapper.readValue(jsonArray.toString(), Movie[].class);
        return movies;
    }
}
