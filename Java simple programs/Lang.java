import java.lang.*;
import java.util.Scanner;
public class Lang
{
	public static void main(String args[])throws Exception
	{
	int choice;
	System.out.println("PERFORMING JAVA.LANG OPERATION");
	do
	{
	System.out.println("\n 1.rint function\n2.random function\n3.exit");
	System.out.println("Enter the choice");
	Scanner s = new Scanner(System.in);
	 choice=s.nextInt();
	   switch(choice)
	{
	case 1:System.out.println("Performed Rint function");
	double x=1654.86;
	double y=5632.23;
	
	System.out.println("Math.rint("+x+")="+Math.rint(x));
	System.out.println("Math.rint("+y+")="+Math.rint(y));
	break;
	case 2:System.out.println("Performed Random Number");
 	  double i=Math.random();
	  double j=Math.random();
	
	  System.out.println("Random Number 1: "+i);
	  System.out.println("Random Number 2:"+j);
	  System.out.println("Highest Number: " +Math.max(i,j));
	break;
	case 3:break;
	default:System.out.println("Invalid Choice");	
	                  }
	}while(choice!=3);
	
	}
}