public class Education
{
private String course;
private int yop;
private String uni;
private double marks;

public Education(String course,int yop,String uni,double marks)
{
super();
this.course=course;
this.yop=yop;
this.uni=uni;
this.marks=marks;
}
public void displayEducation()
{
System.out.println();
System.out.println("Education Details");
System.out.println("Course : "+course);
System.out.println("University : "+ uni);
System.out.println("marks : "+marks);
System.out.println("yop : "+yop);
}
}

-----------------------------------------------------------------------------------------------
public class Mock
{
private String trainerName;
private String sub;
private String date;
private String rating;

public Mock(String trainerName,String sub,String date,String rating)
{
super();
this.trainerName=trainerName;
this.sub=sub;
this.date=date;
this.rating=rating;
}

public String getTrainerName()
{
return trainerName;
}
public void setTrainerName(String trainerName)
{
this.trainerName= trainerName;
}

public String getSub()
{
return sub;
}
}
--------------------------------------------------------------------------------------------------------
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
============================================================
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagement
{
static Student student;
static ArrayList<Mock> listMock = new ArrayList<Mock>();

public static void start()
{
Scanner scanner = new Scanner(System.in);
for (; ; )
{
System.out.println(System.out.println("welcome");
System.out.println();
System.out.println("1.Student");
System.out.println("2.HR");
System.out.println();
System.out.println("Enter an option");
int option=scanner.nextInt();
switch(option)
{
case 1:
{
studentHomePage();
break;

}
case 2:
{
hrHomePage();
break;

}
default:
{
System.out.println("invalid option ");
}
}

}
private static void hrHomePage()
{
if(student==null)
{
System.out.println("Student data is not present ");
}

for (; ; )
{
System.out.println("HR module");
System.out.println();
System.out.println("1.View All Students");
System.out.println("2.Mock Rating ");
System.out.println("3.Requirements");
System.out.println("4.logout");
System.out.println();
System.out.println("Enter an option  ");
int opt =new Scanner (System.in).nextInt();

switch(opt)
{
case 1:
{
viewAllStudents();
break;
}
case 2:
{
mockRatings();
break;
}
case 3:
{
requirements();
break;
}
case 4:
{
return:
}
default:
System.out.println("Invalid option ");


}
}
}

private static void requirements()
{

}
private static void mockRatings()
{
for (; ; )
{
System.out.println("mock module ");
System.out.println();
System.out.println("1.Add mock");
System.out.println("2.view All Mock");
System.out.println("3.exit");
System.out.println("Enter an option");

int opt = new Scanner(System.in).nextInt();
switch (opt)
{
case 1:
{
addMock();
break;
}

case 2:
{
viewAllMock();
break;
}

case 3:
{
return;
}
default :
{
System.out.println("invalid option");
}



}

}
private static void viewAllMock()
{
System.out.println();
System.out.println("All mock");
for(Mock ele:listMock)
{
ele.displayMock();
}
}

private static void addMock()
{
System.out.println();
System.out.println("Add mock Module");
System.out.println();
System.out.println("Date :");
String date = new Scanner (System.in).next();
System.out.println("Trainer name : ");
String trainerName = new Scanner(System.in).next();
System.out.println("Subject :");
String sub= new Scanner(System.in).next();
System.out.println("Ratings : ");
String rating= new Scanner (System.in).next();
Mock mock = new Mock (trainerName,sub,date,rating);
listMock.add(mock);
}
private static void viewAllStudents{
student.displayStudent();
}
private static void studentHomePage()
{
for (; ; )
{
System.out.println();
System.out.println("Student Module ");
System.out.println();
System.out.println("1.Create profile ");
System.out.println("2.Profile");
System.out.println("3.mock ratings");
System.out.println("4.Requirements");
System.out.println("5.logout");
System.out.println();
System.out.println("Enter an option ");

int opt=  new Scanner(System.in).nextInt();

switch (opt)
{
case 1:
{
createProfile();
break;

}
case 2:
{
viewProfile();
break;

}
case 4:
{
viewRequirements() ;
break;

}
case 3:
{
viewMockRating();
break;

}
default:
System.out.println("Invalid option ");
}



}
}

private static void viewRequirements()
{

}

private static void viewMockRating()
{
if(student==null)
{
System.out.println("Create Your acc first");
return:
}
System.out.println("All mock Ratings");;
for(Mock ele : listMock)
{
ele.displayMock();
}
}

private static void viewProfile()
{
if(student==null)
{
System.out.println("Create your acc first");
return:
}
System.out.println("Student Profile Module");
System.out.println(student.displayStudent());

System.out.println();

System.out.println("Do u want to edit something :");
@SuppressWarnings("resource")

String res= new Scanner(System.in.).next();
if(resp.equalsIgnoreCase("YES"))
{
editStudentProfile();
}
}

private static void editStudentProfile()
{
for (; ; )
{
System.out.println();
System.out.println("Edit student info");
System.out.println("1.Namw");
System.out.println("2.email");
System.out.println("3.contact");
System.out.println("4.address");
System.out.println("5.change pin");
System.out.println("6.Exit");

System.out.println();
System.out.println("Enter an option ");
System.out.println();
int opt=new Scanner(System.in).nextInt();

switch (opt)
{
case 1:
{
System.out.println("New name :");
String newName=new Scanner(System.in).nextLine();
System.out.println("pin:");
int userPin=new Scanner(System.in).nextInt();
if(userPin==student.getPin())
{
student.setName(newName);
}
else {
System.out.println("invalid pin ");
}break;

}
case 2:
{
System.out.println("New email :");
String newEmail=new Scanner(System.in).nextLine();
System.out.println("pin:");
int userPin=new Scanner(System.in).nextInt();
if(userPin==student.getPin())
{
student.setEmail(newEmail);
}
else {
System.out.println("invalid pin ");
}
break;

}
case 3:
{
System.out.println("New con :");
String newContact=new Scanner(System.in).nextLine();
System.out.println("pin:");
int userPin=new Scanner(System.in).nextInt();
if(userPin==student.getPin())
{
student.setContact(newContact);
}
else {
System.out.println("invalid pin ");
}
break;
}

case 4:
{
System.out.println("New address :");
String newAdd=new Scanner(System.in).nextLine();
System.out.println("pin:");
int userPin=new Scanner(System.in).nextInt();
if(userPin==student.getPin())
{
student.setAddress(newAdd);
}
else {
System.out.println("invalid pin ");
}
break;
}

case 5:
{
System.out.println("New Pin :");
String newPin=new Scanner(System.in).nextLine();
System.out.println("pin:");
int userPin=new Scanner(System.in).nextInt();
if(userPin==student.getPin())
{
student.setName(newpin);
}
else {
System.out.println("invalid pin ");
}
break;
}

case 6:{
System.out.println();
return;
}




}
}

}
private static void createProfile()
{
System.out.println("Create profile Module");
System.out.println();
System.out.println("pin : ");

int pin = new Scanner(System.in).nextInt();
System.out.println("NAme : ");
String name = new Scanner(System.in).nextLine();

System.out.println("Email ");
String email= new Scanner(System.in).next();

System.out.println("Con :");
long contact = new Scanner( System.in).nextLong();

System.out.println("Address :");
String address = new Scanner(System.in).nextLine();

student=new Student(pin,name,email,contact,address);
}
}
} 
