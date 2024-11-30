import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

       Movie[] movies = new Movie[]{
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
    
        };
      
     
        for (int i =0; i< movies.length; i++) {
           
            store.setMovie(i,movies[i]);
        }
    //     Movie myMovie=store.getMovie(1);
    //     System.out.println(myMovie);

    //    store.getMovie(4);

        public static void userInput(){
            Scanner scanner = new Scanner(System.in);
            String status = "continue";
            while(status.equals("continue")){
                System.out.print("Choose an integer btw 0-9");
                int choice = scanner.nextInt();
                Movie movie =store.getMovie(choice);

                System.out.print("Set a new rating for " + movie.getName+":")
                double rating = scanner.nextDouble();
                movie.setRating(rating);
                store.setMoive(choice, movie);

                System.out.print("To edit another rating, type:continue");
                String response = scanner.next();
            }

            System.out.println("\nPlease enter ");

        };
    

    
    }
}
