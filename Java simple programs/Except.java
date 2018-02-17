import java.util.Scanner;
	class Atm
	{
		int pin,dep,with,bal;
		String name;
		void getInfo()
		{
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter name:");
		  name=s.next();
		  System.out.println("enter the balance: ");
		  bal=s.nextInt();
		  System.out.println("enter the Debit card pin: ");
		  pin=s.nextInt();
		}
		void showInfo()
		{
		  System.out.println("Name: "+name);
		  System.out.println("Balance: "+bal);
		  System.out.println("Debit card pin: XXXX");
		}
		void deposit()
		{
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the deposit: ");
		  dep=s.nextInt();
		  try
		  {
			if(dep<500)
			{
			   throw new MyExce();
			}
			else
			{ 
			   System.out.println("transaction Successfully Completed"); 
			}
		  }
		  catch(Exception f)
		  {
			System.out.println("Error: "+f.getMessage());
		  }
		}
		void withdrawl()
		{
		  Scanner s=new Scanner(System.in);		
		  System.out.println("enter withdrawl amt: ");
		  with=s.nextInt();
		  try
		  {
			if(with<bal)
			{
			  System.out.println("amount is withdrawn");
			}
			else
			{
			  throw new MyExcep();
			}
		  }
		  catch(Exception e)
		  {
			System.out.println("Error1: "+e.getMessage());
		  }
		}
		class MyExcep extends Exception
		{
		    MyExcep()
		    {
			super("Insufficient Balance");

	 	    }
		}
		class MyExce extends Exception
		{	
		    MyExce()
		    {
			super("Transaction Not Possible");
		    }
		}
	        }
	class Except
	{
	  public static void main(String args[])
	  {
		int i,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=s.nextInt();
		Atm[] atm=new Atm[n];
		System.out.println("enter the info of Customer");
		for(i=0;i<n;i++)
		{
		  atm[i]=new Atm();
		  atm[i].getInfo();
		}
		for(i=0;i<n;i++)
		{
		  atm[i].showInfo();
		}
		for(i=0;i<n;i++)
		{
		  atm[i].deposit();
		}
		for(i=0;i<n;i++)
		{
		 atm[i].withdrawl();
		 }

	  }
	}	