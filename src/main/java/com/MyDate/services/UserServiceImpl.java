package com.MyDate.services;

import java.util.List;

import com.MyDate.entities.UserResponse;
import com.MyDate.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<String> saveData(UserResponse userResponse) {
        if (userResponse != null) {
            List<UserResponse> movies = userRepository.findByUserName(userResponse.getUserName());
            System.out.println(userResponse.getUserName());
            System.out.println(movies.size());
            movies.add(userResponse);
            userRepository.saveAll(movies);
            return ResponseEntity.ok().body("Saved in the DB");
        } else {
            return ResponseEntity.badRequest().body("Response is null");
        }
    }

}
