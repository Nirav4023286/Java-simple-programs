import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int i;
int[] phn=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("enter the value of phn");
for(i=0;i<5;i++)
{
phn[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println(phn[i]);
}
}
}