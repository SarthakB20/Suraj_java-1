class Pa2
{
	
	static char currentChar = 'a'; 
	static int i = 1; 
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
		System.out.print(currentChar + " ");
		currentChar++; 
		if(j++ == i) 
		{
			j = 1; 
			return;
		}
		innerLoop();
	}
}

