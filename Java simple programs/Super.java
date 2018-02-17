import java.util.Scanner;
class A
{
A()
{
System.out.println("D of A");
}
A(int i)
{
System.out.println("P of A");
}
}
class B extends A
{
B()
{
super(24);
System.out.println("D of B");
}
B(int i)
{

System.out.println("P of B");
}
}
class Super
{
public static void main(String args[])
{
B b=new B();
}
}