class DecimalToBinary1
{
	public static void main(String [] args)
	{
		int num = 10;
		String sum = " ";
		
		/*for(int i=num;i>0;i++)
		{
			int r = 0;
			
			 r=num%2;
			sum =  sum + r ;
			num/=2;
			
			
			
		
		}  */
		
		while(num>0)
		{
			int r =n%2;
			sum = r+sum;
			
			num/=2;
		}
			
		System.out.println(sum+ " " );
		
		
		
	}
}