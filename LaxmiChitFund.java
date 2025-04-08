import java.util.*;

class LaxmiChitFund {

    static String username;
    static String phone;
    static String pin;
    static long adhar;
    static String pan;
    static double bal = 0.0;
    static final String ifsc = "LCF00001";
    static final long accountNo = 12345678911L;
    static ArrayList<String> tran = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int attempt = 3;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWELCOME");
            System.out.println("*** LAXMI CHIT FUND ***");
            System.out.println("1. Existing User");
            System.out.println("2. Create Account");
            System.out.print("Enter an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("INVALID OPTION");
            }
        }
    }

    public static void login() {
        if (username != null) {
            System.out.println("\n*** LOGIN ***");
            sc.nextLine(); // Clear buffer
            System.out.print("Username/Phone: ");
            String cred1 = sc.nextLine();
            System.out.print("Password: ");
            String cred2 = sc.next();

            if ((cred1.equals(username) || cred1.equals(phone)) && cred2.equals(pin)) {
                homePage();
            } else {
                attempt--;
                System.out.println("\nWRONG CREDENTIALS ENTERED");
                System.out.println("Attempts left: " + attempt);
                if (attempt == 0) {
                    System.exit(0);
                }
                login();
            }
        } else {
            System.out.println("CREATE YOUR ACCOUNT FIRST");
        }
    }

    public static void createAccount() {
        System.out.println("\n*** ACCOUNT CREATION ***");
        sc.nextLine(); // Clear buffer
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("Phone number: ");
        phone = sc.next();
        System.out.print("Pin: ");
        pin = sc.next();
        System.out.print("Aadhar Number: ");
        adhar = sc.nextLong();
        System.out.print("PAN Number: ");
        pan = sc.next();
        System.out.print("Amount to be deposited: ");
        bal = sc.nextDouble();
        tran.add("Deposit: " + bal + "rs");
        System.out.println("\nACCOUNT CREATED SUCCESSFULLY\n");
        login();
    }

    public static void homePage() {
        while (true) {
            System.out.println("\n** HOME PAGE **");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Statement");
            System.out.println("5. Edit User");
            System.out.println("6. Loan");
            System.out.println("7. Logout");
            System.out.print("Enter an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    depositAmount();
                    break;
                case 2:
                    withdrawAmount();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    statement();
                    break;
                case 5:
                    editUser();
                    break;
                case 6:
                    loan();
                    break;
                case 7:
                    System.out.println("THANK YOU. VISIT AGAIN!");
                    System.exit(0);
                default:
                    System.out.println("WRONG OPTION");
            }
        }
    }

    public static void depositAmount() {
        System.out.println("\n*** DEPOSIT AMOUNT ***");
        System.out.print("Enter the amount: ");
        double depositAmt = sc.nextDouble();
        bal += depositAmt;
        tran.add("Deposit: " + depositAmt + "rs");
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
    }

    public static void withdrawAmount() {
        System.out.println("\n*** WITHDRAW AMOUNT ***");
        System.out.print("Amount: ");
        double withAmt = sc.nextDouble();
        System.out.print("Pin: ");
        String userPin = sc.next();

        if (userPin.equals(pin)) {
            if (withAmt <= bal) {
                bal -= withAmt;
                tran.add("Withdraw: " + withAmt + "rs");
                System.out.println("AMOUNT DEBITED SUCCESSFULLY");
            } else {
                System.out.println("INSUFFICIENT FUNDS");
            }
        } else {
            System.out.println("INCORRECT PIN");
        }
    }

    public static void checkBalance() {
        System.out.println("\n*** CHECK BALANCE ***");
        System.out.print("Pin: ");
        String userPin = sc.next();

        if (userPin.equals(pin)) {
            System.out.println(username + ", your account balance is: " + bal + "rs");
        } else {
            System.out.println("INCORRECT PIN");
        }
    }

    public static void statement() {
        System.out.println("\n*** STATEMENT ***");
        for (String i : tran) {
            System.out.println(i);
        }
    }

    public static void editUser() {
        System.out.println("\n*** EDIT USER ***");
        sc.nextLine(); // Clear buffer
        System.out.print("Enter new username: ");
        username = sc.nextLine();
        System.out.print("Enter new phone number: ");
        phone = sc.next();
        System.out.print("Enter new pin: ");
        pin = sc.next();
        System.out.println("USER DETAILS UPDATED SUCCESSFULLY");
    }

    public static void loan() {
        System.out.println("\n*** LOAN ***");
        System.out.println("1. HOME LOAN");
        System.out.println("2. PERSONAL LOAN");
        System.out.println("3. GOLD LOAN");
        System.out.println("4. CAR LOAN");
        System.out.println("5. EDUCATION LOAN");
        System.out.print("Enter the option for loan type: ");
        int opt = sc.nextInt();
        System.out.print("Principal Amount: ");
        double amt = sc.nextDouble();
        System.out.print("Tenure (months): ");
        int ten = sc.nextInt();

        double roi = 0;
        String type = "";

        switch (opt) {
            case 1 -> {
                roi = 7.5;
                type = "HOME";
            }
            case 2 -> {
                roi = 9.5;
                type = "PERSONAL";
            }
            case 3 -> {
                roi = 3.5;
                type = "GOLD";
            }
            case 4 -> {
                roi = 8.5;
                type = "CAR";
            }
            case 5 -> {
                roi = 7.7;
                type = "EDUCATION";
            }
            default -> {
                System.out.println("WRONG OPTION ENTERED");
                return;
            }
        }

        double interest = (amt * roi / 100) * (ten / 12.0);
        System.out.println("LOAN TYPE: " + type + " LOAN");
        System.out.println("Principal: " + amt);
        System.out.println("ROI: " + roi + "%");
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + (amt + interest));
        System.out.println("Monthly EMI: " + (float) ((amt + interest) / ten));
    }
}
