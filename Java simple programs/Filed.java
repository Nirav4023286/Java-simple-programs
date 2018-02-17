import java.io.*;
import java.lang.*;
import java.util.*;
class Filed
{
public static void main(String args[])throws Exception
{
int choice=0,i=0;
System.out.println("Make out some file operation");
do
{
System.out.println("\n1.Bytes\n2.File\n3.TreeSet\n4.HashSet\n5.exit");
System.out.println("Enter the choice");
Scanner ch = new Scanner(System.in);
 choice=ch.nextInt();
   switch(choice)
{

case 1:System.out.println("Using Bytes function"); 
	String source;
	Scanner s=new Scanner(System.in);
	System.out.println("Wat to do in engg holidays???");
	source=s.next();
	 byte buf[]=source.getBytes();
	FileOutputStream f0=new FileOutputStream("file1.txt");
	  for(i=0;i<buf.length;i+=2)
	  {
	  f0.write(buf[i]);
	  }
	f0.close();
	
	FileOutputStream f1=new FileOutputStream("file2.txt");
	f1.write(buf);
	f1.close();
	
	FileOutputStream f2=new FileOutputStream("file3.txt");
	f2.write(buf,buf.length-buf.length/4,buf.length/4);
	f2.close();
break; 
case 2:System.out.println("Using File function with Help of Input stream");	 
	   File f=new File("F:\\cjavap\\arithmetic.java");
	    System.out.println(f.exists()); 
	    System.out.println(f.canRead()); 
	    System.out.println(f.canWrite()); 

	    File[] files = f.listFiles();
	    if( files!=null )
	    {
		    System.out.println("No of child files are : " + files.length);	

		    for(i=0;i<files.length;i++)



		    {
			System.out.println( files[i].getName() );
		     }
	    }

  	    if( f.isDirectory() )
	    {
		System.out.println( "Cannot read because it's folder");
	     }
	    FileInputStream h=new FileInputStream("F:\\cjavap\\Array1.java");
	    System.out.println("DATA FROM FILE IS:");

	    int sym;
   	    while(  (sym=h.read())!=-1 )
	    {
		System.out.print((char)sym);
	    }
break;

case 3:	 System.out.println("Performing treeset function"); 
	String[] arr={"Lets", "enjoy engg", "holiday"};
	 Set<String>set=new TreeSet<String>();

	for(int j=0;j<arr.length;j++)
	{
	set.add(arr[j]);
	}
	for(Object o:set)System.out.println(o+"");
	Iterator<String>j=set.iterator();
	while(j.hasNext())
	{
	System.out.println(j.next()+"");;
	}	
	break;
case 4:System.out.println("performing Hashset function");
	  String[] ar={"Lets", "enjoy engg", "holiday"};
	 Set<String>get=new HashSet<String>();

	for(int l=0;l<ar.length;l++)
	{
	get.add(ar[l]);
	}
	for(Object o:get)System.out.println(o+"");
	Iterator<String>l=get.iterator();
	while(l.hasNext())
	{
	System.out.println(l.next()+"");;
	}	
	break;
case 5:break;
default:System.out.println("\nInvalid choice");
	}
}while(choice!=5);

	System.out.println("These are result for which you carried out function");
	}
}