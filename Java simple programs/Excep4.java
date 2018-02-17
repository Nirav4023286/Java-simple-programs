import java.util.Scanner;
	class Accoun
	{
		int acid,dep,with,bal;
		String name;
		void getInfo()
		{
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter name:");
		  name=s.next();
		  System.out.println("enter the balance: ");
		  bal=s.nextInt();
		  System.out.println("enter the Account id: ");
		  acid=s.nextInt();
		}
		void showInfo()
		{
		  System.out.println("Name: "+name);
		  System.out.println("Balance: "+bal);
		  System.out.println("Account id: "+acid);
		}
		void deposit()
		{
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the deposit: ");
		  dep=s.nextInt();
		  try
		  {
			if(dep>500)
			{
			   throw new MyExcep();
			}
			else
			{ 
			   System.out.println("transaction is possible"); 
			}
		  }
		  catch(Exception e)
		  {
			System.out.println("Error: "+e.getMessage());
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
			super("Insufficient Transaction");

	 	    }
		}
	        }
	class Excep4
	{
	  public static void main(String args[])
	  {
		Scanner s=new Scanner(System.in);	
		Accoun a=new Accoun();
		a.getInfo();
		a.showInfo();
		a.deposit();
		a.withdrawl();
	  }
	}	