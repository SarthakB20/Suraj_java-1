import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
		reversed = 0;
		toAdd = 0;
        boolean isPrime = true;

        if (number <= 1 || (number != 2 && number % 2 == 0));
		isPrime = false;
		
        for (int i = 3; i <= number / 2 && isPrime; i += 2) {
            if (number % i == 0) isPrime = false;
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            while (true) {
                toAdd++;
                int candidate = number + toAdd;
                boolean isCandidatePrime = true;
                for (int i = 2; i <= candidate / 2; i++) {
                    if (candidate % i == 0) {
                        isCandidatePrime = false;
                        break;
                    }
                }
                if (isCandidatePrime) {
                    System.out.println(number + " is not a prime number. Add " + toAdd + " to make it prime.");
                    System.out.println("The resulting prime number is: " + candidate);
                    break;
                }
            }
        }

    }
}
