package task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cinema {
    public static void main(String[] args) {
        Random rateGenerator = new Random();
        Movie movie1 = new Movie("BLACK BOX", rateGenerator.nextInt(11));
        Movie movie2 = new Movie("MULAN", rateGenerator.nextInt(11));
        Movie movie3 = new Movie("FAMILY ROMANCE", rateGenerator.nextInt(11));
        Movie movie4 = new Movie("THE LODGE", rateGenerator.nextInt(11));
        Movie movie5 = new Movie("JUNGLELAND", rateGenerator.nextInt(11));

        Cartoon cartoon1 = new Cartoon("Kipo and the Age of Wonderbeasts", rateGenerator.nextInt(11));
        Cartoon cartoon2 = new Cartoon("Peppa Pig", rateGenerator.nextInt(11));
        Cartoon cartoon3 = new Cartoon("Ask the StoryBots", rateGenerator.nextInt(11));
        Cartoon cartoon4 = new Cartoon("Beat Bugs", rateGenerator.nextInt(11));
        Cartoon cartoon5 = new Cartoon("Shimmer and Shine", rateGenerator.nextInt(11));
        Cartoon cartoon6 = new Cartoon("Invader Zim", rateGenerator.nextInt(11));

        List<Watchable> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(cartoon1);
        movies.add(cartoon2);
        movies.add(cartoon3);
        movies.add(cartoon4);
        movies.add(cartoon5);
        movies.add(cartoon6);
        int highestrate = 0;
        // finding the highest rate in colection of movies;
        for (Watchable movie : movies) {
            if (movie instanceof Movie) {
                if (((Movie) movie).getRate() > highestrate) highestrate = ((Movie) movie).getRate();
            }
        }

        //displaying movies with the highest rate in che collection
        for (Watchable movie : movies) {
            if (movie instanceof Movie) {
                if (highestrate == ((Movie) movie).getRate())
                    System.out.println("This movie have the highest rate in our cinema: " + ((Movie) movie).getTitle());
            }
        }

    }
}
