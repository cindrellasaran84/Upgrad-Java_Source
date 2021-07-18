package com.upgrad.sarang.DSA.Queue.Examples;
import java.util.*;
public class MovieStarRatingsByQueue {
    public String title;
    public int rating;

    public MovieStarRatingsByQueue(String title) {
        this.title = title;
        this.rating = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        System.out.println("Giving " + rating + " star(s) to the movie " + this.title);
        this.rating = rating;
    }
}

class Source {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieStarRatingsByQueue movie1 = new MovieStarRatingsByQueue("Dangal");
        MovieStarRatingsByQueue movie2 = new MovieStarRatingsByQueue("Gangs of Wasseypur");
        MovieStarRatingsByQueue movie3 = new MovieStarRatingsByQueue("Tubelight");
        MovieStarRatingsByQueue movie4 = new MovieStarRatingsByQueue("Padvamat");

        Queue<MovieStarRatingsByQueue> movieQueue = new LinkedList<MovieStarRatingsByQueue>();
        movieQueue.add(movie1);
        movieQueue.add(movie2);
        movieQueue.add(movie3);
        movieQueue.add(movie4);

        // Here are the movies and their ratings in the correct order, e.g. Gangs of Wasseypur has a rating 5 and so on.
        int[] movieRatings = { 5, 3, 4, 1 };
        String[] movieTitles = { "Gangs of Wasseypur", "Padvamat", "Dangal", "Tubelight" };

        for (int i = 0; i < 4; i++) {
            int rating = movieRatings[i];
            String title = movieTitles[i];

            // Iterate over Queue to find the movie with the correct title
            // and update its Rating
            // Write logic here
            Queue<Integer> q1 = new LinkedList<>();
        }
    }
}
