class Pa3
{
	static int currentNum = 10;  
	static int i = 1;  /
	static int j = 1;  

	public static void main(String[] args) {
		outerLoop();
	}

	public static void outerLoop()
	{
		innerLoop();
		if(i++ == 4)  
			return;
		System.out.println();
		outerLoop();
	}

	public static void innerLoop()
	{
		System.out.print(currentNum + " ");
		currentNum--; 
		if(j++ == (5 - i))  
		{
			j = 1; 
			return;
		}
		innerLoop();
	}
}
