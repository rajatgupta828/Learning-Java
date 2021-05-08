package com.rajat.oopsConcepts.Polymorphism;

public class PolyExecutor {
    public static void main(String[] args) {

        for(int i = 0; i <10; i++){
            Movie movie = randomMovie();

            System.out.println("Movie Name :" + movie.getMovieName() + " Genre : " + movie.getGenre() +
                    " Plot : " + movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        switch (randomNumber){
            case 1:
                return new Jaws("Jaws","Action");

            case 2:
                return new WhyHim("Why him", "Comedy");
            case 3:
                return new Movie("Random Movie", "No Genre");
            default:
                return null;
        }
    }
}
