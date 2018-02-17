import java.util.Scanner;
	class Student
	{
	   int rollno;
	   String name,add;
	   void getInfo()
	   {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the rollno: ");
	    rollno=s.nextInt();
	    System.out.println("enter the name");
	    name=s.next();
	    System.out.println("Enter the add: ");
	    add=s.next();
	   }
	   void showInfo()
	   {
	   System.out.println("ROllno: "+rollno);
	   System.out.println("Name: "+name);
	   System.out.println("Address: "+add);
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
	  class Center
	  {
	  String cname;
	  int j,m;
	  Batch[] lis;
	  void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter centername: ");
		cname=s.next();
		System.out.println("enter value of m: ");
		m=s.nextInt();
		lis =new Batch[m];
		System.out.println("enter list: ");
		for(j=0;j<m;j++)
		{
		lis[j]=new Batch();
		lis[j].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Centername: "+cname);
		for(j=0;j<m;j++)
		{
		lis[j].showInfo();
		}
		}
	  }
	
	 class Zone
	{
	  String zname;
	  int l,k;
	  Center[] li;
	  void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter zone name: ");
		zname=s.next();
		System.out.println("enter value of k: ");
		k=s.nextInt();
		li =new Center[k];
		System.out.println("enter li: ");
		for(l=0;l<k;l++)
		{
		li[l]=new Center();
		li[l].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Zone Name: "+zname);
		for(l=0;l<k;l++)
		{
		li[l].showInfo();
		}
		}
	  }
	 class Institute
	{
	  String iname;
	  int o,p;
	  Zone[] listt;
	  void getInfo()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Institute name: ");
		iname=s.next();
		System.out.println("enter value of p: ");
		p=s.nextInt();
		listt =new Zone[p];
		System.out.println("enter listt: ");
		for(o=0;o<p;o++)
		{
		listt[o]=new Zone();
		listt[o].getInfo();
		}
		}
		void showInfo()
		{
		System.out.println("Institute Name: "+iname);
		for(o=0;o<p;o++)
		{
		listt[o].showInfo();
		}
		}
	  }

	class Dem9
	{
	 public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		Institute t=new Institute();
		t.getInfo();
		t.showInfo();
		}
	 }