import java.io.*;
import java.lang.*;
import java.util.*;
public class Htd
{	
	public static void main(String args[])
	{
	String st;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	st=s.next();
	int decin=Integer.parseInt(st,16);
	System.out.println("Hexadecimal number converted to decimal number");
	System.out.println("Decimal number: "+decin);
	}
}	