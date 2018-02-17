import java.util.*;
class Student
{
 int rollno;
 String name,add;
 void getInfo()
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter rollno: ");
	rollno=s.nextInt();
	System.out.println("enter the studs name");	
	name=s.next();
	System.out.println("enter the Studs Add: ");
	add=s.next();
}
void showInfo()
{
	System.out.println("ROLLNO: "+rollno);
	System.out.println("NAME: "+name);
	System.out.println("ADDRESS: "+add);
}
int getrollno()
	{
	return rollno;
	}
}
class Datab
{
	public static void main(String args[])
	{
	int i,n=0,m,ch;
	Scanner s=new Scanner(System.in);
	
	Student[] list=new Student[50];
	do
	{
	 System.out.println("\n1.Add a record\n2.SHow a record\n3.show all records\n4.exit");
	 System.out.println("enter the choice: ");
	 ch=s.nextInt();
	switch(ch)
	{
case 1:System.out.println("Adding a record");
		list[n]=new Student();
		list[n].getInfo();
	 	n++;
	break;
case 2:System.out.println("Showing Record");
	  if(n!=0)
	System.out.println("enter the trollno");
	m=s.nextInt();
	for(i=0;i<n;i++)
	{
	if(list[i].getrollno()==m)
	{
	list[i].showInfo();
	break;
	}
	}
	if(i==n)
	{
	System.out.println("Record not found");	
	}
	break;
case 3:System.out.println("Showing All The Record");
	if(n!=0)
	{
	  	for(i=0;i<n;i++)
		{
		list[i].showInfo();
		}
	}
		break;
case 4:break;
default:System.out.println("INVALID CHOICE");
	}
	}while(ch!=4);
	}
} 	