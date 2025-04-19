class Heart {
    double weight;
    int beatPerMinute;
    String type;

    Heart(double weight, int beatPerMinute, String type) {
        this.weight = weight;
        this.beatPerMinute = beatPerMinute;
        this.type = type;
    }

    void displayHeart() {
        System.out.println();
        System.out.println("HEART DETAILS");
        System.out.println("Weight (gms): " + weight);
        System.out.println("BPM         : " + beatPerMinute);
        System.out.println("Type        : " + type);
    }
}

class Human {
    String name;
    int age;
    double height;
    double weight;
    Heart heart;

    Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.heart = new Heart(300, 72, "Biological"); // Method1
    }

    void displayHuman() {
        System.out.println();
        System.out.println("HUMAN DETAILS");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}

class HumanDriver {
    public static void main(String[] args) {
        Human h = new Human("Suraj", 21, 5.9, 65.0);
        h.displayHuman();
        h.heart.displayHeart();
    }
}
