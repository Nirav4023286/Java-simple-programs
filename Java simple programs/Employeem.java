import java.util.Scanner;
class Employeem
{
public static void main(String args[])
{
int i,choice,id,tid,found,salary;
String name;
int[] emp=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("enter the emp");
for(i=0;i<5;i++)
{
emp[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println(emp[i]);
}
System.out.println("Employee record");
do
{
System.out.println("\n1.Add an employee\n2.show an employee\n3.show an employee\n4.exit");
System.out.println("Enter the choice");
Scanner ch = new Scanner(System.in);
 choice=ch.nextInt();
   switch(choice)
{
case 1:System.out.println("\nEmployee record");
	for(i=0;i<5;i++)
	{
	System.out.println("\nenter the name");
	emp[i].name=s.next();
	System.out.println("\nenter id");
	emp[i].id=s.nextInt();
	System.out.println("\nenter the emp salary");
	emp[i].salary=s.nextInt();
	break;
	}
case 2:System.out.println("employee record");
	System.out.println("enter the id");
	emp[i].tid=s.next();
	found=0;
	for(i=0;i<5;i++)
	{
	if(emp[i].id==tid)
	{
	found=1;
	}
	break;
	}
	if(found==0)
	{
	System.out.println("record not found");
	}
	else
	{
	System.out.println("Showing rec"+emp[i].id+emp[i].salary);
	}
	break;
case 3:System.out.println("Show all employee");
	for(i=0;i<5;i++)
	{
	System.out.println("salary"+emp[i].salary);
	System.out.println("id"+emp[i].id);
	System.out.println("name"+emp[i].name);
	}
	break;
case 4:break;
default:System.out.println("invalid choice");
}
}while(choice!=4);
}
}	
