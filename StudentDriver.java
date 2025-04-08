class Education{
	String course;
	int yop;
	double marks;
	String uni;


	Education(String course,int yop,double marks,String uni){

		super();
		this.course=course;
		this.yop=yop;
		this.marks=marks;
		this.uni=uni;

	}
	void displayEducation(){

		System.out.println("Education details");
		System.out.println("Course :" + course);
		System.out.println("Yop :" + yop);
		System.out.println("Marks :" + marks);
		System.out.println("University :" + uni);
		System.out.println();

	}
}
class Address{
	String area;
	String city;
	String state;
	int pincode;

	Address(String area,String city,String state,int pincode){

		this.area=area;
		this.city=city;
		this.state=state;
		this.pincode=pincode;

	}
	public void displayAddres(){

		System.out.println("Address Details");
		System.out.println("Area :" + area);
		System.out.println("City :" + city);
		System.out.println("State :" + state);
		System.out.println("Pincode :" + pincode);

	}
}
class Student
{
	String name;
	long contact;
	String dob;
	String email;
	Address address;
	Education edu;

	Student(String name,long contact,String dob,String email,Address address,Education edu)
	{
		this.name=name;
		this.contact=contact;
		this.dob=dob;
		this.email=email;
		this.address=address;
		this.edu=edu;

	}

	//copy constructor

	Student(Student old){

		this.name=old.name;
		this.contact=old.contact;
		this.email=old.email;
		this.dob=old.dob;
		this.edu=old.edu;
		this.address=old.address;

	}
	public void displayStudent(){

		System.out.println("Student Details");
		System.out.println("Name :" + name);
		System.out.println("Contact :" + contact);
		System.out.println("Email :" + email);
		System.out.println("Dob :" +dob);
		System.out.println();

		address.displayAddres();
		System.out.println();
		edu.displayEducation();
	}


	

}

class StudentDriver{

	public static void main(String[] args) {
		
		
		Address address = new Address("Deccan","Pune","Maharastra",411052);
		
	    Education edu = new Education("CSE",2026,9.2,"SPPU");

	    Student old = new Student("Ramesh Kumar",9878898,
	    	                     "ramesh123@gmail.com","01/02/03",address,edu);

	    old.displayStudent();
	    System.out.println("-------------------------------");
	    System.out.println();
	    System.out.println("Copy below");
	    System.out.println();

	    Student copy = new Student(old);
	    edu.displayEducation();

	    System.out.println("---------------------------------");

	    System.out.println("Copy after change");
	    copy.name="Suresh Kumar";
	    copy.displayStudent();

	    System.out.println("---------------------------------");

	    System.out.println("Original object after change in the copy object");
	    System.out.println();
	    old.displayStudent();




	}
}