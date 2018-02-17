	class Alpha extends Thread
	{
	 public void run()
	 {
	  try
 	  {
	  for(int i=97;i<=122;i++)
	  {
 	   System.out.println((char)i);
	  Thread.sleep(100);
	  }
	  }catch(Exception E){}
	 }
	}
	class Beta extends Thread
	{
  	 public void run()
 	 {
	 try
	 {
	  for(int j=1;j<=26;j++)
	  { 
	   System.out.println("Beta: "+j);
	   Thread.sleep(300);
	  }
	  }catch(Exception E){
		System.out.println("Error: "+E.getMessage());}
 	  }
	}
 class Th
	{
	 public static void main(String args[])
	 {
   	 Alpha a=new Alpha();
	 Beta b=new Beta();
	 a.start();
	 b.start();
  	 }
 	}