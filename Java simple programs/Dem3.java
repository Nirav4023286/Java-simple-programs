import java.util.Scanner;
	class Student
	{
	int rollno;
	String name,add;
		void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter rollno: ");
		rollno=s.nextInt();
		System.out.println("enter stud name: ");
		name=s.next();
		System.out.println("enter studs add: ");
		add=s.next();
		}
		void showInfo()
		{
		System.out.println("rollno: "+rollno);
		System.out.println("name: "+name);
		System.out.println("add: "+add);
		}
	}
	class Batch
	{
	String bname;
	int i,n;
	Student[] list;
		void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter batchname: ");
		bname=s.next();
		System.out.println("enter value of n: ");
		n=s.nextInt();
		list =new Student[n];
		System.out.println("enter list: ");
		for(i=0;i<n;i++)
		{
		list[i]=new Student();
		list[i].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Batchname: "+bname);
		for(i=0;i<n;i++)
		{
		list[i].showInfo();
		}
		}
	}
	class Dem3
	{
	 public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		Batch b=new Batch();
		b.getInfo();
		b.showInfo();
		}
	}