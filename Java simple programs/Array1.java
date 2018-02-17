import java.util.Scanner;
class Array1
{
public static void main(String args[])
{
int i,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n: ");
n=s.nextInt();
int[] phn=new int[n];
System.out.println("enter the value of phn");
for(i=0;i<n;i++)
{
phn[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println(phn[i]);
}
}
}