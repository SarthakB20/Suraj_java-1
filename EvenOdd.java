import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		//Scanner traffic = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%5==0 && num%2!=0)
		{
		   System.out.println("hi5");
		}
		if(num%2==0 && num%!=5 )
		{
			System.out.println("hi2");
			
		}
		if(num%2==0 && num%5==0)
		{
			System.out.println("hi2hi5");
		}
	}
}
		