package com.MyDate.entities;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     */

    @JsonProperty("id")
    private int id;

    @JsonProperty("adult")
    private boolean isAdult;

    @JsonProperty("original_title")
    private String Title;

    @JsonProperty("poster_path")
    private String Image_Path;

    @JsonProperty("overview")
    private String OverView;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("release_date")
    private LocalDate ReleaseDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImage_Path() {
        return Image_Path;
    }

    public void setImage_Path(String image_Path) {
        Image_Path = image_Path;
    }

    public String getOverView() {
        return OverView;
    }

    public void setOverView(String overView) {
        OverView = overView;
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        ReleaseDate = releaseDate;
    }

    public Movie(int id, boolean isAdult, String title, String image_Path, String overView, LocalDate releaseDate) {
        this.id = id;
        this.isAdult = isAdult;
        Title = title;
        Image_Path = image_Path;
        OverView = overView;
        ReleaseDate = releaseDate;
    }

    public Movie() {
    }
}
