class SumDigits
{
	public static void main(String [] args)
	{
		int num = 123;
		int sum = 0;
		
		/*while(num>0)
		{
			
			int rem=num%10;
			sum+=rem;
			num=num/10;
			
		}
		System.out.println(sum);*/
		
		for(int i = num;i>0;i/=10)
		{
			int rem = i%10;
			sum+=rem;
			
		}
		System.out.println(sum);
			
	}
}