import java.io.*;
import java.util.Scanner;
class Dem6
  {
      public static void main(String args[])throws Exception
     {
	 String source;
	Scanner s=new Scanner(System.in);
	System.out.println("Wat to do in engg holidays???");
	source=s.next();
	 byte buf[]=source.getBytes();
	FileOutputStream f0=new FileOutputStream("file1.txt");
	  for(int i=0;i<buf.length;i+=2)
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
      }
   }