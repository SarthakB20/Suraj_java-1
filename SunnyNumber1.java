class SunnyNumber1
{
	public static void main(String[] args) {
		
		int n = 19;
		int dup=n;

		for(int i = n;i>0;i/=10)
		{
			int rem=0;
			//int cnt=0;
			int sum=0;
			rem=n%10;
			//cnt++
			sum+=rem*rem;

			int t=sum+1;

			if(t==dup)
				System.out.println("it is sunny number");
			else 
				System.out.println("It is not the sunny number");




		}
	}
}