import java.util.Scanner;
class Hotel
{
public static void main(String args[])
{
int choice,bill=0,a=0,b=0,c=0,d=0;
System.out.println("WELCOME TO HOTEL WESTIN");
do
{
System.out.println("\n 1.tea 30\n2.coffee 70\n3.sandwitch 150\n4.pavbhaji 210\n5.exit");
System.out.println("Enter the choice");
Scanner ch = new Scanner(System.in);
 choice=ch.nextInt();
   switch(choice)
{
case 1:
System.out.println("\nwait for tea");
bill=bill+30;
a++;
break;
case 2:
System.out.println("\nwait for coffee");
bill=bill+70;
b++;
break;
case 3:System.out.println("\nwait for sandwitch");
bill=bill+150;
c++;
break;
case 4:System.out.println("\nwait for pavbhaji");
bill=bill+210;
d++;
break;
case 5: break;
default:System.out.println("\n invalid");
}
}
while(choice!=5);
{
System.out.println("\n thank you");
System.out.println("\n tea 30 x"+a+"="+a*30);
System.out.println("\n coffee 70 x "+b+"="+b*70);
System.out.println("\n sandwitch 150 x "+c+"="+c*150);
System.out.println("\n pavbhaji 210 x "+d+"="+d*210);
System.out.println("\nbill: "+bill);
}
}
}
