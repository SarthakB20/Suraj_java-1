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