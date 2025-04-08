class AutomoephicNumber
{
public static void main(String[] args)
	{
		int num = 9;
		int cnt = 0;
		int div = 1;
		
		for(int i= num;i>0;i/=10)
			cnt++;
		
		for(int i = 1; i<=cnt ; i++)
			div *= 10;
		
		int sqr=num*num;
		int slipt = sqr%div;
		
		if(num==slipt)
		{
			System.out.println(num + "is a Automoephic Number ");
		}
		else
		{
			System.out.println(num + " not a Automoephic Number ");
		}
	}
}
