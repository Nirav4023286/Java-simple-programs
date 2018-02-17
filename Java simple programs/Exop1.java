import java.util.Scanner;
class Person
{
int age;
String name;
void getPInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the pers age");
age=s.nextInt();
System.out.println("enter name");
name=s.next();
}
void showPInfo()
{
System.out.println("age: "+age);
System.out.println("name: "+name);
}
}
class Student extends Person
{
int rollno;
String add,contno;
static String schoolName="VN";
void getSInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter studs roll: ");
rollno=s.nextInt();
System.out.println("enter add: ");
add=s.next();
System.out.println("enter contno: ");
contno=s.next();
}
void showSInfo()
{
System.out.println("studs rollno:"+rollno);
System.out.println("add: "+add);
System.out.println("contno: "+contno);
}
}
class Exop1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Student s=new Student();
s.getPInfo();
s.getSInfo();
s.showPInfo();
s.showSInfo();
}
}
