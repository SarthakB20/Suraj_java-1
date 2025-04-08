class Amstrong
{
	public static void main(String[] args) {
		

		int num =152;
		int dup=num;
		int cnt=0;
		int sum=0;

		for(int i=num;i>0;i/=10)
		{
			cnt++;

		}
		while(num>0){
			int rem=num%10;
			int power=1;

			for(int i=1;i<=cnt;i++)
				power*=rem;

			sum+=power;

			num/=10;
		}
		if(dup==sum)
			System.out.println("It is a Amstrong number");

		else 
			System.out.println("It is not a Amstrong number");


	}
}