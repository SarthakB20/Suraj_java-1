class PrimeNU
{
	public static void main(String[] args)
	{
		boolean flag=true;
		int num=10;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
				flag=false;
			break;
			
			if(flag)
			System.out.println(prime);
			else
				System.out.println(not a prime);
		}
	}
}

