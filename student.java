import java.util.ArrayList;
public class Student
{
static int sid =123456;
private String id;
private String name;
private String email;
private int pin;

public void setAddress(String address)
{
this.address=address;
}
public String getId()
{
return id;
}

private long contact;
private String address;
private ArrayList<Education> listEdu = new ArrayList<>();
private ArrayList<Mock> listMock = new ArrayList<>();
private ArrayList<Requirement> listReq = new ArrayList<>();

public Student(int pin,String name,String email,long contact,String address)
{
super();
this.id="QSP"+sid++;
this.pin=pin;
this.name=name;
this.email=email;
this.contact=contact;
this.address=address;
this.listEdu=addEducationDetails();
}

public int getPin()
{
return pin ;
}
public int setPin(int pin)
{
this.pin=pin;
}
public String getName()
{
return name;

}
public void setName(String name)
{
this.name=name;
}
public String getEmail()
{
return email;

}
public void setEmail(String email)
{
this.email=email;
}

public String getContact()
{
return contact;

}
public void setContact(long contact)
{
this.contact=contact;
}

public String getAddress()
{
return address;
}

private ArrayList<Education> addEducationDetails()
{
ArrayList<Education> list =new ArrayList<Education>();
for (; ; )
{
System.out.println();
System.out.println("Add Education Details");
System.out.println("Course  :");
String course = new Scanner (System.in).nextLine();
System.out.println("YOP  :");
int yop = new Scanner(System.in).nextInt();
System.out.println("University  : ");
String uni = new Scanner (System.in).nextLine();
System.out.println("Marks  : ");
double marks = new Scanner(System.in).nextDouble();
System.out.println();
Education edu = new Education(course,yop,uni,marks);
list.add(edu);

System.out.println("Education Details for : "+ course + "Submitted");
System.out.println();


System.out.println("Do you Want to Add more Eduactional info ?");
@SuppressWarnings("resourse")

String resp=new Scanner(System.in).next();

if(resp.equalsIgnoreCase("yes"))
{
continue;
}
else {
break;
}

}
return list;
}

public void displayStudent()
{
System.out.println();
System.out.println("Student infoo");
System.out.println("Id "+id);
System.out.println("Name "+name);
System.out.println("Email "+email);
System.out.println("Contact "+contact);
System.out.println("Address "+address);
displayAllEducationalDetails();
}

public void displayAllEducationalDetails()
{
for(Education ele : listEdu)
{
ele.displayEducation();
}
}



}