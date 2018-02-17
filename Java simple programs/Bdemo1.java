import java.util.Scanner;
class Bank
{
	static int count = 0;
	int actno;
String name,acty,mobno,add;
static String bankN="HDFC";
Bank()
{
   count++;
   actno=count;
 
}

void getInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name");
name=s.next();
System.out.println("enter acty");
acty=s.next();
System.out.println("enter mobno");
mobno=s.next();
System.out.println("enter address");
add=s.next();
}
void showInfo()
{
System.out.println("acno"+actno);
System.out.println("name"+name);
System.out.println("acty"+acty);
System.out.println("mobno"+mobno);
System.out.println("address"+add);
}
}
class Bdemo1						
{
public static void main(String args[])
{
Bank s1=new Bank();
Bank s2=new Bank();
Bank s3=new Bank();
s1.getInfo();
s2.getInfo();
s3.getInfo();
s1.showInfo();
s2.showInfo();
s3.showInfo();
s1.name="niraj";
s1.showInfo();
s2.showInfo();
s3.showInfo();
Bank.bankN="AXIS";
s1.showInfo();
s2.showInfo();
s3.showInfo();
}
}