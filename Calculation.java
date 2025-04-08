import java.util.Scanner;
class Calculation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the tip rate : ");
		double tip_rate = sc.nextDouble();
		double subtotal =1000;
		double total = subtotal/100*tip_rate;
		//double perimeter = 2*pi*radius;
		System.out.println("Total bill is : "+total);
		
		
	}
}