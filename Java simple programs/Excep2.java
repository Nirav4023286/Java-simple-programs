import java.util.Scanner;
	class Account
	{
	int acid,dep,with;
	String name;
	void getInfo()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter id: ");
	acid=s.nextInt();
	System.out.println("enter name");
	name=s.next();
	}
	void showInfo()
	{
	System.out.println("Acid= "+acid);
	System.out.println("Name= "+name);
	}

	void deposit
        {
	System.out.println("enter deposit");
	dep=s.nextInt();
	try
	{
		if(dep<1000)
		{
		System.out.println("dep is not possible: ");
		}
		else
		{
		throw new Exception("Invalid deposit");
		}
	}
	catch(Exception e)
	{
		System.out.println("Error: "+e.getMessage());
	}
}
void withdrawl
{
	System.out.println("enter withdrawl");
	with=s.nextInt();
	try
	{
		if(bal>amt)
		{
		  System.out.println("withdrawl is possible");
		}
		else
		{
		   throw new Exception("Invalid transaction");
		}
	}
	catch
	{
		System.out.println("Error: "+e.getMessage());
	}
}
}
class Excep2
{
	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   Account a=new Account();
	   a.getInfo();
	   a.showInfo();
	   a.deposit();
	   a.withdrawl();
	}
}