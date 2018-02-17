import java.util.Scanner;
class Hotel2
{
public static void main(String args[])
{
int choice=0,choice1=0,choice2=0,choice3=0,choice4=0,bill=0;
System.out.println("WELCOME TO HOTEL WESTIN");
do
{
System.out.println("\n 1.snacks \n2.veg \n3.non-veg\n4.drinks\n5.exit");
System.out.println("Enter the choice");
Scanner ch = new Scanner(System.in);
 choice=ch.nextInt();
   switch(choice)
{
case 1:
System.out.println("\n snacks");
do
{
System.out.println("\n 1.samosa 50 \n2.vadapav 65 \n3.dosa 140\n4.idli 125\n5.exit");
System.out.println("Enter the choice1");
Scanner ch1 = new Scanner(System.in);
 choice1=ch1.nextInt();
   switch(choice1)
{
case 1: System.out.println("\nwait for samosa");
              bill=bill+50;
              break;
case 2:
	System.out.println("\nwait for  vadapav");
	bill=bill+65;
	break;
case 3:System.out.println("\nwait for dosa");
	bill=bill+140;
	break;
case 4:System.out.println("\nwait for idli");
	bill=bill+125;
	break;
case 5: break;
default:System.out.println("\ninvalid");
}
}while(choice1!=5);
System.out.println("bill"+bill);
break;
case 2:
System.out.println("\n Veg");
do
{
System.out.println("\n 1.paneer masala 150 \n2.butter paneer 155 \n3.palak paneer 150\n4.kaju paneer 185\n5.exit");
System.out.println("Enter the choice2");
Scanner ch2 = new Scanner(System.in);
 choice2=ch2.nextInt();
   switch(choice2)
{
case 1: System.out.println("\npaneer masala");
              bill=bill+150;
              break;
case 2:
	System.out.println("\nbutter paneer");
	bill=bill+155;
	break;
case 3:System.out.println("\npalak paneer");
	bill=bill+150;
	break;
case 4:System.out.println("\nkaju paneer");
	bill=bill+185;
	break;
case 5: break;
default:System.out.println("\ninvalid");
}
}while(choice2!=5);
System.out.println("bill"+bill);
break;
case 3:
System.out.println("\nNon Veg");
do
{
System.out.println("\n 1.chicken tikka 250 \n2.chicken manchurian 265 \n3.chicken curry 240\n4.chicken tandoori 275\n5.exit");
System.out.println("Enter the choice3");
Scanner ch3 = new Scanner(System.in);
 choice3=ch3.nextInt();
   switch(choice3)
{
case 1: System.out.println("\nchicken tikka");
              bill=bill+250;
              break;
case 2:
	System.out.println("\nchicken manchurian");
	bill=bill+265;
	break;
case 3:System.out.println("\nchicken curry");
	bill=bill+240;
	break;
case 4:System.out.println("\nchicken tandoori");
	bill=bill+275;
	break;
case 5: break;
default:System.out.println("\ninvalid");
}
}while(choice3!=5);
System.out.println("bill"+bill);
break;
case 4:
System.out.println("\ncold drinks");
do
{
System.out.println("\n 1.thumbsup 30 \n2.pepsi 35 \n3.cococola 40\n4.jeera masala 25\n5.exit");
System.out.println("Enter the choice4");
Scanner ch4 = new Scanner(System.in);
 choice4=ch4.nextInt();
   switch(choice4)
{
case 1: System.out.println("\nthumbsup");
              bill=bill+30;
              break;
case 2:
	System.out.println("\npepsi");
	bill=bill+35;
	break;
case 3:System.out.println("\ncococola");
	bill=bill+40;
	break;
case 4:System.out.println("\njeera masala");
	bill=bill+25;
	break;
case 5: break;
default:System.out.println("\ninvalid");
}
}while(choice4!=5);
System.out.println("bill"+bill);
break;
case 5:break;
default:System.out.println("\ninvalid");
}
}
while(choice!=5);
System.out.println("Total bill"+bill);
}
}