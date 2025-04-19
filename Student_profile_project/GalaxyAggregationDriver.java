import java.util.*;

class Galaxy {
    String name;
    String type;
    double distanceFromEarth; // in light-years
    int solarSystemCount;
    ArrayList<SolarSystem> listSolarSystems = new ArrayList<>();

    Galaxy(String name, String type, double distanceFromEarth, int solarSystemCount) {
        this.name = name;
        this.type = type;
        this.distanceFromEarth = distanceFromEarth;
        this.solarSystemCount = solarSystemCount;
    }

    public void displayGalaxy() {
        System.out.println("Galaxy Details");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Distance from Earth: " + distanceFromEarth + " light-years");
        System.out.println("Number of Solar Systems: " + solarSystemCount);
        System.out.println();
    }

    public void addSolarSystem(String name, int starCount, int planetCount, double ageInBillions) {
        SolarSystem ss = new SolarSystem(name, starCount, planetCount, ageInBillions);
        listSolarSystems.add(ss);
    }
}

class SolarSystem {
    String name;
    int starCount;
    int planetCount;
    double ageInBillions;
    ArrayList<Planet> listPlanets = new ArrayList<>();

    SolarSystem(String name, int starCount, int planetCount, double ageInBillions) {
        this.name = name;
        this.starCount = starCount;
        this.planetCount = planetCount;
        this.ageInBillions = ageInBillions;
    }

    public void displaySolarSystem() {
        System.out.println("Solar System Details");
        System.out.println("Name: " + name);
        System.out.println("Stars: " + starCount);
        System.out.println("Planets: " + planetCount);
        System.out.println("Age: " + ageInBillions + " billion years");
        System.out.println();
    }

    public void addPlanet(String name, double radius, double distanceFromStar, boolean hasLife) {
        Planet planet = new Planet(name, radius, distanceFromStar, hasLife);
        listPlanets.add(planet);
    }
}

class Planet {
    String name;
    double radius; // in kilometers
    double distanceFromStar; // in AU
    boolean hasLife;

    Planet(String name, double radius, double distanceFromStar, boolean hasLife) {
        this.name = name;
        this.radius = radius;
        this.distanceFromStar = distanceFromStar;
        this.hasLife = hasLife;
    }

    public void displayPlanet() {
        System.out.println("Planet Details");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius + " km");
        System.out.println("Distance from Star: " + distanceFromStar + " AU");
        System.out.println("Supports Life: " + (hasLife ? "Yes" : "No"));
        System.out.println();
    }
}

public class GalaxyAggregationDriver {
    public static void main(String[] args) {
        Galaxy milkyWay = new Galaxy("Milky Way", "Spiral", 0.0, 2);
        milkyWay.displayGalaxy();

        milkyWay.addSolarSystem("Solar System", 1, 8, 4.6);
        milkyWay.addSolarSystem("Alpha Centauri System", 3, 1, 5.0);

        for (SolarSystem ss : milkyWay.listSolarSystems) {
            ss.displaySolarSystem();
        }

        // Adding planets to Solar System
        for (SolarSystem ss : milkyWay.listSolarSystems) {
            if (ss.name.equals("Solar System")) {
                ss.addPlanet("Earth", 6371, 1.0, true);
                ss.addPlanet("Mars", 3389.5, 1.52, false);
                ss.addPlanet("Jupiter", 69911, 5.2, false);

                for (Planet p : ss.listPlanets) {
                    p.displayPlanet();
                }
            }
        }
    }
}
