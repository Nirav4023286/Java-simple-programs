import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int r,s=0;
Scanner  m= new Scanner(System.in);
System.out.println("Enter  a number");
int n= m.nextInt();
while(n>0)
{
r=n%10;
n=n/10;
s=s+r;
}
System.out.println("the sum is"+s);

}
}