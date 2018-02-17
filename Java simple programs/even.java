import java.util.Scanner;
class even
{
public static void main(String args[])
{
int i;
Scanner s = new Scanner(System.in);
System.out.println("Enter  range r1 & r2");
int r1= s.nextInt();
int r2= s.nextInt();
for(i=r1;i<=r2;i++)
{
if((i%2)==0)
System.out.println("The even numbers in the range are"+i);
}
}
}