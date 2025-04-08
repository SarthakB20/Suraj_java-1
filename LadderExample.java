import java.util.Scanner;
class LadderExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What are the marks :");
		float marks = sc.nextFloat();
		if(marks>=0 && marks<=500)
		{
			float per = (marks/500)*100;
			if(per>=90)
			{
				System.out.println("You have got "+per+" % Outstanding");
				
			}
			else if(per>=75)
			{
				
				System.out.println("You have got "+per+" % pass with distinction");
				

			}
			else if(per>=60)
			{
				System.out.println("You have got "+per+" % pass with first class");
				

			}
			else if(per>=50)
			{
				System.out.println("You have got "+per+" % pass with second class");
			}
			else if(per>=35)
			{
				System.out.println("You have got "+per+" % you are just pass");
			}
			else
			System.out.println("You are fail");
		}
		
	}
}
