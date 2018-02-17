import java.util.Scanner;
class swap
{
public static void main(String args[])
{
int c;
Scanner s = new Scanner(System.in);
System.out.println("Enter two numbers");
int a= s.nextInt();
int b= s.nextInt();
c=b;
b=a;
a=c;
System.out.println("Swapped nos are"+a+b);

}
}