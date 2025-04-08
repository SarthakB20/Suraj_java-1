class NearestPrimeNumber
{
	public static void main(String[] args) {
		
		int num = 10;
		int beforePrime=0;

		
		for(int i=num-1; i>=0; i--)
		{
			boolean flag =true;
			for(int j = 2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
				beforePrime=i;

		    if(beforePrime!=0)
				break;
		}

		

		int afterprime=0;

		for(int i = num+1;i>=0;i++)
		{
			boolean flag=true;

			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}

			}
			if(flag)
			afterprime=i;

			if(afterprime!=0)
				break;
		}

		

		if(num-beforePrime> afterprime-num)
			System.out.println(num +" "+afterprime);

		else if(num-beforePrime< afterprime-num)
			System.out.println(num + " "+beforePrime);

		else 
			System.out.println(beforePrime +" "+ num +" " + afterprime);
	}

}