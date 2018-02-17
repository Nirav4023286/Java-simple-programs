import java.util.Scanner;
class Bank
{
String name,acty,mobno,add;
static String bankN="HDFC";
void getInfo()
{
Scanner s=new Scanner(System.in);
System.out.print("enter name");
name=s.next();
System.out.print("enter acty");
acty=s.next();
System.out.print("enter mobno");
mobno=s.next();
System.out.print("enter address");
add=s.next();
}
void showInfo()
{
System.out.print("name"+name);
System.out.print("acty"+acty);
System.out.print("mobno"+mobno);
System.out.print("address"+add);
}
}
class Bdemo
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