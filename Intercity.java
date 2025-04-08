import java.util.*;

class Intercity {

    static String username;
    static Long contact;
    static String password;

    public static void main(String[] args) {
        createCab();
        welcomeModule();
    }

    public static void createCab() {
        // Placeholder for any initial cab setup
    }

    public static void welcomeModule() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("WELCOME TO INTERCITY");
            System.out.println();
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. LOGIN");
            System.out.println();
            System.out.print("Enter option: ");

            int opt = sc.nextInt();
            System.out.println();

            switch (opt) {
                case 1:
                    createPassenger(sc);
                    break;
                case 2:
                    loginPassenger(sc);
                    break;
                default:
                    System.out.println("INVALID OPTION");
            }
        }
    }

    public static void createPassenger(Scanner sc) {
        System.out.println("CREATE ACCOUNT");
        System.out.println();

        sc.nextLine(); // Consume newline left from nextInt()
        System.out.print("Enter your name: ");
        username = sc.nextLine();

        System.out.print("Enter contact number: ");
        contact = sc.nextLong();

        System.out.print("Enter password: ");
        password = sc.next();

        System.out.println();
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
    }

    public static void loginPassenger(Scanner sc) {
        if (username == null) {
            System.out.println("CREATE ACCOUNT FIRST");
            System.out.println();
            return;
        }

        System.out.println("LOGIN MODULE");
        System.out.println();

        sc.nextLine(); // Consume newline left from nextInt()
        System.out.print("Username: ");
        String username1 = sc.nextLine();

        System.out.print("Password: ");
        String password1 = sc.next();

        if (username.equals(username1) && password.equals(password1)) {
            homePage(sc);
        } else {
            System.out.println("INVALID CREDENTIALS");
        }
    }

    public static void homePage(Scanner sc) {
        while (true) {
            System.out.println();
            System.out.println("HOME MODULE");
            System.out.println();
            System.out.println("1. BOOK A CAB");
            System.out.println("2. CANCEL CAB");
            System.out.println("3. PREVIOUS RIDES");
            System.out.println("4. LOGOUT");
            System.out.println();
            System.out.print("Enter an option: ");

            int opt = sc.nextInt();
            System.out.println();

            switch (opt) {
                case 1:
                    bookCab();
                    break;
                case 2:
                    cancelCab();
                    break;
                case 3:
                    previousRides();
                    break;
                case 4:
                    System.out.println("THANK YOU & VISIT AGAIN");
                    System.exit(0);
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
        }
    }

    public static void bookCab() {
        System.out.println("BOOK CAB");
    }

    public static void cancelCab() {
        System.out.println("CANCEL CAB");
    }

    public static void previousRides() {
        System.out.println("PREVIOUS RIDES");
    }
}
