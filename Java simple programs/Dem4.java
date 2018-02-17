import java.io.*;
import java.util.Scanner;
   class Dem4
	{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
	    File f=new File("F:\\cjavap\\arithmetic.java");
	    System.out.println(f.exists()); 
	    System.out.println(f.canRead()); 
	    System.out.println(f.canWrite()); 

	    File[] files = f.listFiles();
	    if( files!=null )
	    {
		    System.out.println("No of child files are : " + files.length);	

		    for(int i=0;i<files.length;i++)
		    {
			System.out.println( files[i].getName() );
		     }
	    }

  	    if( f.isDirectory() )
	    {
		System.out.println( "Cannot read because it's folder");
	     }
	    FileInputStream i=new FileInputStream("F:\\cjavap\\arithmetic.java");
	    System.out.println("DATA FROM FILE IS:");

	    int sym;
   	    while(  (sym=i.read())!=-1 )
	    {
		System.out.print((char)sym);
	    }
	}
}