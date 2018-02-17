import java.util.Scanner;
class Book
{
public static void main(String args[])
{
int choice,choice1,choice2,bill=0;
System.out.println("Shop for books");
do
{
System.out.println("\n1.mathematics\n2.ciruits book\n3.exit");
System.out.println("Enter the choice");
Scanner ch = new Scanner(System.in);
 choice=ch.nextInt();
   switch(choice)
{
case 1:System.out.println("mathematics");
do
{
System.out.println("\n1.mathematics1 320\n2.mathematics2 340\nmathematics3 410\n4.exit");
System.out.println("enter the choice 1");
Scanner ch1=new Scanner(System.in);
choice1=ch1.nextInt();
switch(choice1)
{
case 1:System.out.println("mathematics1 320");
	bill=bill+320;
	break;
case 2:System.out.println("mathematics2 340");
	bill=bill+340;
	break;
case 3:System.out.println("mathematics3 410");
	bill=bill+410;
	break;
case 4:break;
default:System.out.println("invalid choice");
}
}while(choice1!=4);
case 2:System.out.println("circuit book");
do
{
System.out.println("\n1.linear ciruits 270\n2.PST 315\n3.TSC 450\n4.exit");
System.out.println("enter the choice2");
Scanner ch2=new Scanner(System.in);
choice2=ch2.nextInt();
switch(choice2)
{
case 1:System.out.println("linear circuits 270");
	bill=bill+270;
	break;
case 2:System.out.println("PST 315");
	bill=bill+315;
	break;
case 3:System.out.println("TSC 450");
	bill=bill+450;
	break;
case 4:break;
default:System.out.println("invalid choice");
}
}while(choice2!=4);
System.out.println("bill: "+bill);
}
}while(choice!=4);
}
}

