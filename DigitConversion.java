import java.util.Scanner;

class DigitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String num = Int.toString(number);
        int length = numStr.length();

        System.out.println("Length of the number: " + length);

        System.out.print("Converted digits: ");
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);

            if (length % 2 == 0) {
                if (digit % 2 != 0) { 
                    digit++;
                }
            } else {
                if (digit % 2 == 0) { 
                    digit--;
                }
            }
            System.out.print(digit);
        }
    }
}
