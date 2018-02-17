import java.util.Scanner;
class Student
{
int rollno;
String name;
Student()
{
rollno=0;
name=" ";
}
Student(int rollno;string name)
{
this.rollno=rollno;
this.name=name;
}
void getInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter rollno");
rollno=s.nextInt();
System.out.println("enter the name");
name=s.next();
}
void showInfo()
{
System.out.println("Rollno"+rollno);
System.out.println("name"+name);
}
}
class Demth
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Student s1=new Student();
s1.showInfo();
s1.getInfo();
s1.showInfo();
Student s2=new Student(11,"Jack");
s2.showInfo();
s2.getInfo();
s2.showInfo();
}
}
