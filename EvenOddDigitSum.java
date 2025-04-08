class EvenOddDigitSum
{
	public static void main(String[] args)
	{
		int num = 123456789;
		int evensum = 0;
		int oddsum = 0;
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			if(rem%2==0)
				evensum+=rem;
			else
				oddsum+=rem;
		}
		System.out.println("Number is " + num);
		System.out.println("Even sum  is " + evensum);
		System.out.println("Odd sum  is " + oddsum);
		
	}
}

