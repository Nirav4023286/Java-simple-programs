import java.util.Scanner;
class Engineer
{
	int qualif;
	String name;
	void getInfo()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter name:");
	name=s.next();
	}
	void check()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter qualification:");
	qualif=s.nextInt();
	try
	{
		if(qualif>=4)
		{
		System.out.println("Engineer appointed for job");
		}
		else	
		{
		throw new MyExcep();
		}
	}
	catch(Exception e)
	{
		System.out.println("Error: "+e.getMessage());
	}
	}
	void showInfo()
	{
	System.out.println("name: "+name);
	System.out.println("qualif: "+qualif);
	}
}
	class MyExcep extends Exception
	{
	MyExcep()
	{
		super("Not Qualified");
	}
	}
class Excep3
{
	public static void main(String args[])
	{
		int i,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=s.nextInt();
		Engineer[] en=new Engineer[n];
		System.out.println("enter the info of engineer");
		for(i=0;i<n;i++)
		{
		  en[i]=new Engineer();
		  en[i].getInfo();
		}
		for(i=0;i<n;i++)
		{
		  en[i].check();
		}
		for(i=0;i<n;i++)
		{
		 en[i].showInfo();
		 }
	}
}