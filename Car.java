class Car{
	
	String brand;
	String model;
	double price;
	String color;
	String milage;
	String capacity;

	public void displayCar() {

		System.out.println("CAR DETAILS");
		System.out.println("Brand : " + brand);
		System.out.println(" Model : " + model);
		System.out.println("Price : " + price);
		System.out.println(" Color : " + color);
		System.out.println(" Milage : "+ milage);
		System.out.println(" Capacity :" +capacity);
	}

	public void uses() {

		System.out.println("Driving");
		System.out.println("Travelling");

	}

}
class carDriver{

	public static void main(String[] args) {

		Car obj = new Car();
		System.out.println();

		obj.brand ="Maruti Suzuki";
		obj.model = "Alto K-10";
		obj.price = 500000;
		obj.color = "White";
		obj.milage = "20";
		obj.capacity = "4";

		obj.displayCar();
		
	}
}