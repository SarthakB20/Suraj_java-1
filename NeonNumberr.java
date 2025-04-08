class NeonNumberr
{
	public static void main(String[] args) 
	{
		int num = 9;
		int sqr = num*num;
		int sum = 0;
		for (int i = sqr;i>0 ;i/=10 )
		{
			sum+=i%10;
		}
		if (num==sum)
		System.out.println(num+ " is a Neon Number");
		else
		System.out.println(num+ " is not a Neon Number");
	}
}
