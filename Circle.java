import java.util.Scanner;
class Circle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double radius = sc.nextDouble();
		final double pi =3.147;
		double perimeter = 2*pi*radius;
		System.out.println("Perimeter of circle is : "+perimeter+" cm");
		double area = pi *radius *radius;
		System.out.println("Area of circle is : "+area+"cm^2");
		
	}
}