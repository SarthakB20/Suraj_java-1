import java.util.Scanner;

class  Emirp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0, 
		temp = number;
        boolean isPrime = true;

        if (number <= 1) isPrime = false;
        for (int i = 2; i <= number / 2 && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }

            if (reversed != number) {
                for (int i = 2; i <= reversed / 2; i++) {
                    if (reversed % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is an Emirp number.");
        } else {
            System.out.println(number + " is not an Emirp number.");
        }

    }
}
