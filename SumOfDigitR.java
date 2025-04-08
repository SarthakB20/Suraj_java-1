class SumOfDigitR
{
	public static void main(String[] args)
	{
		int num = 123;
		int dup = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			sum = sum + num%10;
			num = num/10;
			
		}
		System.out.println("Sum of digit of " + dup  + " is " + sum);
	}
}

       /* for (int i=num ; i>0;i/=10)
			sum+=(i%10);
		
		System.out.println("Sum of digit of " + dup  + " is " + sum);*/
		
		