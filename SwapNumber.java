class SwapNumber
{
	public static void main(String[] args)
	{
		int a=21;
		int b=38;
		System.out.println("Before Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		//1 with using 3rd var
		/*int c = a;
		a = b;
		b = c;*/
		
		//2 without using 3rd var
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}
}