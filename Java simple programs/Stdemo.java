import java.util.Scanner;
class Student
{
int rollno;
String name,add,contno;
static String schoolName="VN";
void getInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter studs roll: ");
rollno=s.nextInt();
System.out.println("enter name: ");
name=s.next();
System.out.println("enter add: ");
add=s.next();
System.out.println("enter contno: ");
contno=s.next();
}
void showInfo()
{
System.out.println("studs rollno:"+rollno);
System.out.println("name: "+name);
System.out.println("add: "+add);
System.out.println("contno: "+contno);
}
}
class Stdemo
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.getInfo();
s2.getInfo();
s3.getInfo();
s1.showInfo();
s2.showInfo();
s3.showInfo();
s1.rollno=9;
s1.showInfo();
s2.showInfo();
s3.showInfo();
Student.schoolName="DYP";
s1.showInfo();
s2.showInfo();
s3.showInfo();
}
}
