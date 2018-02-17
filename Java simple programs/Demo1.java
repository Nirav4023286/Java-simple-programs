import java.util.Scanner;
class Employee
{
int id;
String name,dept,design;
float salary;
void getInfo()
{
Scanner s = new Scanner(System.in);
System.out.println("enter emp id");
id=s.nextInt();
System.out.println("enter emp name");
name=s.next();
System.out.println("enter emp dept");
dept=s.next();
System.out.println("enter emp designation");
design=s.next();
System.out.println("enter salary");
salary=s.nextFloat();
}
void showInfo()
{
System.out.println("id="+id);
System.out.println("name: "+name);
System.out.println("dept="+dept);
System.out.println("designation="+design);
System.out.println("salary="+salary);
}
}
class Demo1
{
public static void main(String args[])
{
Employee s=new Employee();
s.getInfo();
s.showInfo();
}
}
