import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		// 123  1 +2+ 3=6
		//     1 *2 * 3=6
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0;
		int sum1 = 1;

		for (int i = num;num>0 ; num/=10)
		{
			sum += num%10;
			sum1 *= num%10;
			
		}
		if (sum==sum1)
		{
			System.out.println("It,s Spy Number");
		}
		else
		System.out.println("It,s not a Spy Number");
	}
}
