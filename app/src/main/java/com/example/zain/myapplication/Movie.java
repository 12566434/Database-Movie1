package com.example.zain.myapplication;


public class Movie {
    private int ID;
    private String name;
    private double price1;
    private double price2;
    private double price3;
    private String movieDescription;
    private int movieRating;

    public Movie(int ID, String name, double price1, double price2, double price3, String movieDescription, int movieRating){
        setID(ID);
        setName(name);
        setPrice1(price1);
        setPrice2(price2);
        setPrice3(price3);
        setMovieDescription(movieDescription);
        setMovieRating(movieRating);


    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice1(double price1){
        this.price1 = price1;
    }

    public void setPrice2(double price2){
        this.price2 = price2;
    }

    public void setPrice3(double price3){
        this.price3 = price3;
    }

    public void setMovieDescription(String movieDescription){
        this.movieDescription = movieDescription;
    }

    public void setMovieRating(int movieRating){
        this.movieRating = movieRating;
    }
}
