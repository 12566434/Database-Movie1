
public class Movie {
    private int ID;
    private String name;
    /*private double price1;
    private double price2;
    private double price3;*/
    private String movieDescription;
    private int movieRating;

    public Movie(int ID, String name, double price1){
        setID(ID);
        setName(name);
        /*setPrice1(price1);
        setPrice2(price2);
        setPrice3(price3);*/
        setMovieDescription(movieDescription);
        setMovieRating(movieRating);


    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }
    /*
    public void setPrice1(double price1){
        this.price1 = price1;
    }

    public void setPrice2(double price2){
        this.price2 = price2;
    }

    public void setPrice3(double price3){
        this.price3 = price3;
    }
     */
    public void setMovieDescription(String movieDescription){
        this.movieDescription = movieDescription;
    }

    public void setMovieRating(int movieRating){
        this.movieRating = movieRating;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getMovieDescription(){
        return movieDescription;
    }

    public int getMovieRating(){
         return movieRating;
    }

    public String toString(){
        return ID + " " + name + " " + movieDescription + " " + movieRating;

    }

}
