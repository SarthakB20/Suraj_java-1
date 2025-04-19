class Mobile
{
	String brand;
	String model;
	String color;
	int ram;
	double price;
	int camera;
	String battery;
	Processor pro;
	Sim sim;
	Charger charger;
	PowerBank bank;
	Headphone head;

	Mobile(){

	}

	public Mobile( String brand,String model,String color,int ram,double price,int  camera,String battery,Processor pro)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.ram=ram;
		this.price=price;
		this.camera=camera;
		this.battery=battery;
		this.pro=pro;
	}
	void displayMobile()
	{
		System.out.println("Mobile Infor :");
		System.out.println();
		System.out.println("Brand : "+brand);
		System.out.println("color  : "+color);
		System.out.println("Model:"+model);
		System.out.println("Ram : "+ram);
		System.out.println("Price :"+price);
		System.out.println("Camera : "+camera);
		System.out.println("Battery : "+battery);
	}
	public void addSim(String serviceProvider,long number,String simType,String networkType )
	{
		sim=new Sim(serviceProvider,number,simType,networkType);
	}
	public void addHeadphone(String brand,String name,String type,double price,String color,double drivermm)
	{
		head=new Headphone(brand,name,type,price,color,drivermm);
	}
	public void addCharger(String type,double power,double watt,double price)
	{
		charger=new Charger(type,power,watt,price);
	}
	public void addPowerbank(double mah,int ports,double price,String brand,String type,String color)
	{
		bank=new PowerBank(mah,ports,price,brand,type,color);
	}
}
class Processor
{
	OperatingSystem os;
	int ports;
	double clockSpeed;
	String name;

	Processor()
	{

	}

	public Processor(int ports,double clockSpeed,String name,OperatingSystem os)
	{
		super();
		this.os=os;
		this.ports=ports;
		this.clockSpeed=clockSpeed;
		this.name=name;

	}
	void displayProcessor()
	{
		System.out.println("Processor Information : ");
		System.out.println();
		System.out.println("OS : "+os);
		System.out.println("Ports : "+ports);
		System.out.println("Clock Speed : "+clockSpeed);
		System.out.println("Name : "+name);
	}
}
class OperatingSystem
{
	String version;
	String name;
	String type;
	String releaseDate;

	OperatingSystem(String name,String version, String releaseDate,String type)
	{
		super();
		this.version=version;
		this.name=name;
		this.type=type;
		this.releaseDate=releaseDate;
	}
	void displayOS()
	{
		System.out.println("OS INFO :");
		System.out.println();
		System.out.println("Version : "+version);
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
		System.out.println("Release Date : "+releaseDate);
	}
}
class Charger
{
	String type;
	double power;
	double watt;
	double price;

	Charger(){

	}

	Charger(String type,double power,double watt,double price )
	{
		super();
		this.type=type;
		this.power=power;
		this.watt=watt;
		this.price=price;
	}

	void displayCharger()
	{
		System.out.println("Charger Infoo ;");
		System.out.println();
		System.out.println("Type : "+type);
		System.out.println("Power : "+power);
		System.out.println("Watt : "+watt);
		System.out.println("Price : "+price);
	}
}
class Headphone 
{
	String brand;
	String name;
	String type;
    double price;
	String color;
	double drivermm;

	Headphone()
	{

	}

	public Headphone(String brand , String name,String type,double price,String color,double drivermm)
	{
		super();
		this.name=name;
		this.type=type;
		this.price=price;
		this.color=color;
		this.drivermm=drivermm;
		this.brand=brand;

	}
	public void displayHeadphone()
	{
		System.out.println("Headphone Deatails :");
		System.out.println();
		System.out.println("name : "+name);
		System.out.println("brand : "+brand);
		System.out.println("Type :"+type);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);
		System.out.println("drivermm: "+drivermm);
	}
}
class PowerBank
{
	double mah; 
	int ports;
	double price;
	String brand;
	String type;
	String color;

	PowerBank(){

	}
	public PowerBank(double mah,int ports,double price,String brand,String type,String color)
	{
		super();
		this.mah=mah;
		this.ports=ports;
		this.price=price;
		this.brand=brand;
		this.type=type;
		this.color=color;
	}

	public void displayPowerBank()
	{
		System.out.println("Power bank Details : ");
		System.out.println();
		System.out.println("mah : "+mah);
		System.out.println("Ports : "+ports);
		System.out.println("Price : "+price);
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Color :"+color);
	}


}
class Sim
{
	String serviceProvider;
	long number;
	String simType;
	String networkType;

	Sim(){

	}
	public Sim(String serviceProvider,
				long number,String simType,
						String networkType)
	{
		super();
		this.serviceProvider=serviceProvider;
		this.number=number;
		this.simType=simType;
		this.networkType=networkType;
	}

	public void displaySim()
	{
		System.out.println("Sim Information: ");
		System.out.println("Service Provider : "+serviceProvider);
		System.out.println("Number : "+number );
		System.out.println("Sim Type : "+simType);
		System.out.println("Network Type : "+networkType );
	}

}

class MobileDriverCombineAggrCom
{
	public static void main(String[] args) 
	{
		OperatingSystem os = new OperatingSystem("Oxygen ","1.5.1","10/05/25","Android ");

		Processor pro= new Processor(4,4.5,"SnapDragon",os);

		Mobile mobile = new Mobile("Samsung","S24","Black ",16,100000,200,"6000",pro);

		mobile.displayMobile();
		mobile.pro.displayProcessor();
		mobile.pro.os.displayOS();

		mobile.addSim("VI ",9876543210l,"prepaid ","6g");
		mobile.sim.displaySim();

		mobile.addHeadphone("sony ","kuchbhi ","wireless",4000,"black ",25);
		mobile.head.displayHeadphone();

		mobile.addCharger("c",20,65,3000);
		mobile.charger.displayCharger();

		mobile.addPowerbank(10000,4,3000,"apple","LITHIUM","GREY");
		mobile.bank.displayPowerBank();

	}
}