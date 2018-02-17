import java.util.Scanner;
class Student
{
int rollno;
String name;
int m1,m2,m3,tot;
float avg;
void getInfo()
{
Scanner s = new Scanner(System.in);
System.out.println("enter the rollno");
rollno=s.nextInt();
System.out.println("enter name");
name=s.next();
System.out.println("enter the marks");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
tot=m1+m2+m3;
avg=tot/3.0f;
}
void showInfo()
{
System.out.println("rollno="+rollno);
System.out.println("name: "+name);
System.out.println("m1="+m1);
System.out.println("m2="+m2);
System.out.println("m3="+m3);
System.out.println("tot="+tot);
System.out.println("avg="+avg);
}
}
class Demo
{
public static void main(String args[])
{
Student s=new Student();
s.getInfo();
s.showInfo();
}
}
