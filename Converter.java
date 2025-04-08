import java.util.Scanner;
class Converter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the feet : ");
		double feet = sc.nextDouble();
		
		double meter   = feet * 0.3 ;
		System.out.print("Converted value is :"+meter);
		
	    
		
		
	}
}