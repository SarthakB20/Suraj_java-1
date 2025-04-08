import java.util.Scanner;
class Largest1
{
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1 : ");
		int num1 = sc.nextInt(); //1
		System.out.print("Enter num 2 : ");
		int num2 = sc.nextInt(); // 2
		
		
		int max = (num1>num2)?(num1):(num2);
		System.out.println("Largest number among "+num1","+num2", is: "+max);
		
	}
}