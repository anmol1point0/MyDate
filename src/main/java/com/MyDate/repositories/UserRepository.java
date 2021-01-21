package com.MyDate.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.MyDate.entities.UserResponse;

@Repository
public interface UserRepository extends MongoRepository<UserResponse, String> {
    public List<UserResponse> findByUserName(String userName);
}
