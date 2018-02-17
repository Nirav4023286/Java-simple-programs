import java.util.Scanner;
	class Employee
	{
	   int eid;
	   String name,desig;
	   void getInfo()
	   {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the eid: ");
	    eid=s.nextInt();
	    System.out.println("enter the name");
	    name=s.next();
	    System.out.println("Enter the Designation: ");
	    desig=s.next();
	   }
	   void showInfo()
	   {
	   System.out.println("Eid: "+eid);
	   System.out.println("Name: "+name);
	   System.out.println("Designation: "+desig);
	   }
	}
	class Department
	{
	String dname;
	int i,n;
	Employee[] list;
		void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Department name: ");
		dname=s.next();
		System.out.println("enter value of n: ");
		n=s.nextInt();
		list =new Employee[n];
		System.out.println("enter list: ");
		for(i=0;i<n;i++)
		{
		list[i]=new Employee();
		list[i].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Department name: "+dname);
		for(i=0;i<n;i++)
		{
		list[i].showInfo();
		}
		}
	   }
	  class Branch 
	  {
	  String bname;
	  int j,m;
	  Department[] lis;
	  void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Branch: ");
		bname=s.next();
		System.out.println("enter value of m: ");
		m=s.nextInt();
		lis =new Department[m];
		System.out.println("enter list: ");
		for(j=0;j<m;j++)
		{
		lis[j]=new Department();
		lis[j].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Branch: "+bname);
		for(j=0;j<m;j++)
		{
		lis[j].showInfo();
		}
		}
	  }
	
	 class Company 
	{
	  String cname;
	  int l,k;
	  Branch[] li;
	  void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Company name: ");
		cname=s.next();
		System.out.println("enter value of k: ");
		k=s.nextInt();
		li =new Branch[k];
		System.out.println("enter li: ");
		for(l=0;l<k;l++)
		{
		li[l]=new Branch();
		li[l].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Company Name: "+cname);
		for(l=0;l<k;l++)
		{
		li[l].showInfo();
		}
		}
	  }
	 
	class Hasr
	{
	 public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		Company t=new Company();
		t.getInfo();
		t.showInfo();
		}
	 }