class Engine
{
	double bhp,cc;
	int piston,gears;
	String type;
	Engine(double bhp,int piston,int gears,String type,double cc)
	{
		super();
		this.bhp=bhp;
		this.piston=piston;
		this.gears=gears;
		this.type=type;
		this.cc=cc;
	}
	void displayEngine(){

		System.out.println();
		System.out.println("ENGINE DETAILS");
		System.out.println("Bhp :"+bhp);
		System.out.println("Piston :"+piston);
		System.out.println("Gears :"+gears);
		System.out.println("Type :"+type);
		System.out.println("CC :"+cc);

	}
}
class Car{

	String brand;
	String model;
	String type;
	String color;
	int seatcap;
	double price;
	Engine engine;
	//method1&&mehtod3
	//
	//

	Car(String brand,String model,String type,String color,int seatcap,double price){

		super();
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.color=color;
		this.seatcap=seatcap;
		this.price=price;
		//method1
		//this.engine = new Engine(34,2,5,"SI",800);

	}
	void displayCar()
	{
		System.out.println();
		System.out.println("Car Detail");
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Type :"+type);
		System.out.println("Color :"+color);
		System.out.println("SeatCap :"+seatcap);
		System.out.println("Price :"+price);

}




class carDriver{

	public static void main(String[] args) {

		Car car= new Car("Maruti","Ominii","Van","White",10,350000);
		car.displayCar();
		car.engine.displayEngine();
		
	}
}
}