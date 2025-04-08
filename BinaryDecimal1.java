class BinaryDecimal1
{
	public static void main(String[] args) 
	{
		int num = 10;
		String s = " ";
		int rem = 0;
		//int sum = 0;
		while(num>0)
		{
			rem = num%2;
			s=rem+s;
			num/=2;
			System.out.println(s+ " ");
			//System.out.println(rem);
			//System.out.println(sum);
		}
	}
}