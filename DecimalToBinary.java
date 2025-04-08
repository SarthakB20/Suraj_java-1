
class DecimalToBinary
{
	public static void main(String [] args)
	{
		
		int num= 17;
		String binary = "";
		int rem = num%2;
		binary = rem+binary;
		num = num/2;
		rem = num%2;
		binary = rem+binary;
		num = num/2;
		rem = num%2;
		binary = rem+binary;
		num = num/2;
		rem = num%2;
		binary = rem+binary;
		num = num/2;
		rem = num%2;
		binary = rem+binary;
		num = num/2;
		rem = num%2;
		binary = rem + binary;
		System.out.println(binary);
	}
	
}

		
		