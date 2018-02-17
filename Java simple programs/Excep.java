import java.util.Scanner;
class Driver
{
	int age;
	String name;
	void getInfo()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter name: ");
	name=s.next();
	}
		void check()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter age: ");
	age=s.nextInt();
	try
	{
	if(age>28 && age<=50)
	{
	System.out.println("driver is appointed");
	}
	else
	{
	throw new MyExcep();
	}
	}
	catch(Exception e)
	{
	System.out.println("error: "+e.getMessage());
	}
}
	void showInfo()
	{
	System.out.println("name: "+name);
	System.out.println("age: "+age);
	}
}
	class MyExcep extends Exception 
	{
	MyExcep()
	{
	 super("invalid age");
	}
	}
	class Excep
	{
		public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		Driver d=new Driver();
		d.getInfo();
		d.check();
		d.showInfo();
		}
	}