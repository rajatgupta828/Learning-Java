package com.rajat.oopsConcepts.Polymorphism;

public class Movie {
    private String movieName;
    private String genre;

    public Movie(String movieName, String genre) {
        this.movieName = movieName;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String plot(){
        return "No Plot , Parent";
    }
}
