import java.util.ArrayList;

class Movie {
    private String director;
    private String producer;
    private String productionHouse;
    private double budget;
    private int length;
    private String language;
    private double rating;
    private String title;
    private String releaseDate;

    public Movie() {
        // Default constructor
    }

    public Movie(String director, String producer, String productionHouse, double budget,
                 int length, String language, double rating, String title, String releaseDate) {
        this.director = director;
        this.producer = producer;
        this.productionHouse = productionHouse;
        this.budget = budget;
        this.length = length;
        this.language = language;
        this.rating = rating;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public void displayMovie() {
        System.out.println("Director: " + this.director);
        System.out.println("Producer: " + this.producer);
        System.out.println("Production House: " + this.productionHouse);
        System.out.println("Budget: " + this.budget + " cr");
        System.out.println("Length: " + this.length + " min");
        System.out.println("Language: " + this.language);
        System.out.println("Rating: " + this.rating + "/10");
        System.out.println("Title: " + this.title);
        System.out.println("Release Date: " + this.releaseDate);
    }
}

class ActionMovie extends Movie {
    private ArrayList<String> cast = new ArrayList<>();
    private double collection;
    private boolean hit;
    private int songs;
    private int screen;
    private String platform;

    public ActionMovie(ArrayList<String> cast, double collection, boolean hit,
                       int songs, int screen, String platform,
                       String director, String producer, String productionHouse,
                       double budget, int length, String language,
                       double rating, String title, String releaseDate) {
        super(director, producer, productionHouse, budget, length, language, rating, title, releaseDate);
        this.cast = cast;
        this.collection = collection;
        this.hit = hit;
        this.songs = songs;
        this.screen = screen;
        this.platform = platform;
    }

    public void displayActionMovie() {
        System.out.println("Cast: " + this.cast);
        System.out.println("Collection: " + this.collection + " cr");
        System.out.println("Hit: " + this.hit);
        System.out.println("Number of Songs: " + this.songs);
        System.out.println("Number of Screens: " + this.screen);
        System.out.println("Platform: " + this.platform);
    }
}

public class SingleLevelInheritanceExample {
    public static void main(String[] args) {
        ArrayList<String> listCast = new ArrayList<>();
        listCast.add("Ranbir Kapoor");
        listCast.add("Rashmika Mandanna");
        listCast.add("Anil Kapoor");

        ActionMovie obj = new ActionMovie(
                listCast, 900, true, 27, 4258, "Theatre",
                "Sandeep Reddy Vanga", "Bhushan Kumar", 
                "T-Series Films, Bhadrakali Pictures, and Cine1 Studios",
                100, 201, "Hindi", 6.1, "ANIMAL", "1 December 2023"
        );

        obj.displayMovie();
        obj.displayActionMovie();
    }
}
