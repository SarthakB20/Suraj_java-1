class ForLoop
{
	public static void main(String[] args)
	{
		for(char i= 'A';i<='Z';i++)
		{
			System.out.print(i+ " "+(i+0);
		}
	}
}





 forloopassignment
{
	public static void main(String[] args) 
	{
		for(int i = 1;i<=10;i++)        //1-10
			System.out.print(i+" ");
		
		for(int i = 10;i<=20;i++)		//10-20
			System.out.print(i+" ");

		for(int i = 30;i>=0;i--)		//30-0
			System.out.print(i+" ");

		for(char i = 'A';i<='Z';i++)	//A-Z
			System.out.print(i+" ");

		for(char i = 'a';i<='z';i++)	//a-z
			System.out.print(i+" ");

		for(char i = 'z';i>='a';i--)	//z-a
			System.out.print(i+" ");

		for(char i = 'Z';i>='A';i--)	//Z-A
			System.out.print(i+" ");

		for(char i = 'A';i>='Z';i+=2)	//A C E G...
			System.out.print(i+" ");


		int incre = 1;					   // A C F J O ...
		for(char i = 'A';i<='Z';i+=incre) 
		{
			System.out.print(i+" ");
			incre++;
		}

		
		for(int i = 2;i<=14;i+=2)			// 2 4 6 8 10 12 14
			System.out.print(i+" ");


		for(int i = 1;i<=100;i+=2)			// 1-100 ODD NUMBERS
			System.out.print(i+" "); 

		for(int i = 2;i<=100;i+=2)  		//1-100 EVEN NUMBERS
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
		}

		for(char i = 'A';i<='Z';i++)			// A:65 B:66  .....
		{
			System.out.print(i+":"+(i+0));
		}
		

		
		for(char i = 'a';i<='z';i++)			// a:97 b:98  .....
		{
			System.out.print(i+":"+(i+0)+" ");
		}
		

		for(char i = '0';i<='9';i++)			// 0:48 1:49 2:50 ..........9:57
		{
			System.out.print(i+":"+(i+0)+" ");
		}
	}
}













//PRINT ASCII VALUE

/*class ForLoop
{
	public static void main(String[] args)
	{
		for(char i= 'A';i<='Z';i++
		{
			System.out.print(i+ " "+(i+0);
		}
	}
}*/