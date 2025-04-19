import java.util.ArrayList;

class Sport {
    private String name;
    private String originCountry;
    private int numberOfPlayers;
    private String type; // Indoor/Outdoor
    private boolean isOlympicSport;
    private String equipment;

    public Sport() {
        // Default constructor
    }

    public Sport(String name, String originCountry, int numberOfPlayers,
                 String type, boolean isOlympicSport, String equipment) {
        this.name = name;
        this.originCountry = originCountry;
        this.numberOfPlayers = numberOfPlayers;
        this.type = type;
        this.isOlympicSport = isOlympicSport;
        this.equipment = equipment;
    }

    public void displaySportDetails() {
        System.out.println("Sport Name: " + this.name);
        System.out.println("Origin Country: " + this.originCountry);
        System.out.println("Number of Players: " + this.numberOfPlayers);
        System.out.println("Type: " + this.type);
        System.out.println("Olympic Sport: " + this.isOlympicSport);
        System.out.println("Equipment: " + this.equipment);
    }
}

class Cricket extends Sport {
    private ArrayList<String> famousPlayers = new ArrayList<>();
    private int worldCupsWon;
    private String popularFormat;
    private String captainName;
    private String coachName;

    public Cricket(ArrayList<String> famousPlayers, int worldCupsWon, String popularFormat,
                   String captainName, String coachName,
                   String name, String originCountry, int numberOfPlayers,
                   String type, boolean isOlympicSport, String equipment) {
        super(name, originCountry, numberOfPlayers, type, isOlympicSport, equipment);
        this.famousPlayers = famousPlayers;
        this.worldCupsWon = worldCupsWon;
        this.popularFormat = popularFormat;
        this.captainName = captainName;
        this.coachName = coachName;
    }

    public void displayCricketDetails() {
        System.out.println("Famous Players: " + this.famousPlayers);
        System.out.println("World Cups Won: " + this.worldCupsWon);
        System.out.println("Popular Format: " + this.popularFormat);
        System.out.println("Captain: " + this.captainName);
        System.out.println("Coach: " + this.coachName);
    }
}

public class SingleLevelSportExample2 {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Virat Kohli");
        players.add("Rohit Sharma");
        players.add("MS Dhoni");

        Cricket cricket = new Cricket(
                players, 2, "T20",
                "Rohit Sharma", "Rahul Dravid",
                "Cricket", "England", 11, "Outdoor", false, "Bat, Ball, Stumps"
        );

        cricket.displaySportDetails();
        cricket.displayCricketDetails();
    }
}
