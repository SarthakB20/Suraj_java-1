import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nu :");
		int num = sc.nextInt();
		int fact= 1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
			
		}
		System.out.prinln(fact);
	}
}
/*  USING THE WHILE LOOP 

        int fact1=1;
		while(num>0)
		{
			fact1 *=num;
			num--;
		}
		System.out.println(fact1);  */
		
		