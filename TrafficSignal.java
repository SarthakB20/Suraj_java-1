import java.util.Scanner;
class TrafficSignal
{
	public static void main(String[] args)
	{
		Scanner traffic = new Scanner(System.in);
		
		System.out.print("Signal kya hai");
		char signal=traffic.next().charAt(0);
		
		String result = (signal=='r'||signal=='R')?("Rider stopped"):(signal=='o'||signal=='O')?("Rider go"):(signal=='g'||signal=='G')?("Go"):("Invalid input provided");
		
		System.out.println(result);
		}
		
}