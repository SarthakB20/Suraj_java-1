class SunnyNUmber
{
	public static void main(String[] args)
	{
		int n=80;
		int num = n+1;
	    boolean flag = false;
		
		for(int i=1;i*i<=num;i++)
		{
			if(i*i==num){
				flag=true;
				break;
				

			}
		}
		if(flag)
			System.out.println(num+" is  a sunny number");
		else
			System.out.println(num+" not  a sunny number");
			
			
		/*for(int i=1;i*i;i++)
		{
			if(i==num){
			System.out.println(num+" is  a sunny number");
			break;
			}
			else{
				System.out.println(num+" is not a sunny number");
			}
			
		}
			*/
		
		
	}
}