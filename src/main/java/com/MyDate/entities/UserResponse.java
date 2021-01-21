package com.MyDate.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;


@Document(collection = "MYDATE")
public class UserResponse {

    @Id
    private String userName;

    private int Movieid;

    @JsonProperty
    private boolean Direction;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMovieid() {
        return Movieid;
    }

    public void setMovieid(int movieid) {
        Movieid = movieid;
    }

    

    

    public boolean getDirection() {
		return Direction;
	}

	public void setDirection(boolean direction) {
		Direction = direction;
	}

	public UserResponse() {
    }

	public UserResponse(String userName, int movieid, boolean direction) {
		super();
		this.userName = userName;
		Movieid = movieid;
		Direction = direction;
	}
}
