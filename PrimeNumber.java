import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num :");
		int num = sc.nextInt();
		
		boolean flag = true;
		if(num<2)
			flag = false;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
				flag = false;
			    break;
				
			
		
	    }
		System.out.println(flag?num+" is prime ":num+" is not a prime");
	}	
}

