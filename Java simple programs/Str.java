
import java.util.*;
class Str
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner( System.in );
		int n1,n2,r;

		try
		{
			System.out.println("Enter two numbers: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();

			r = n1 / n2;

			System.out.println("Addition = " + r);
		}
		catch(Exception e)
		{
			System.out.println("Ooppsss!!!: " + e.getMessage() );
		}
		finally
		{
			System.out.println("This is rajnikant block");
		}
	}
}