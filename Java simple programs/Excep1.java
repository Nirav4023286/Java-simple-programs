import java.util.Scanner;
class Excep1
{
public static void main(String args[])
{
try
{
int age;
String name;
Scanner s=new Scanner(System.in);
System.out.println("enter name");
name=s.next();
System.out.println("enter age");
age=s.nextInt();
if(age>28 && age<50)
{
System.out.println("Supported to criteria");
}
else
{
throw new Exception("Invalid age");
}
}
catch(Exception e)
{
System.out.println("Error: "+e.getMessage());
}
}
}