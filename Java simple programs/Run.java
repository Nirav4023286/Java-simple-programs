	class MyRunnable implements Runnable
	{
	 public void run()
	{
	try
	{
	 for(int i=96;i<=122;i++)
	{ 
	System.out.println("Alphabets: "(char)i);
	Thread.sleep(500);
	}
	}
	catch(Exception e){}
	} 
	}
class MyRun implements Runnable
	{
	public void run()
	{
	 for(int j=1;j<26;j++)
	{ 
	 System.out.println("Number:"+j);
	} 
	}
	catch(Exception E)
	{}
	}
class Run
	{
	public static void main(String args[])
	{
 	 MyRunnable r1=new MyRunnable();
	MyRun r2=new MyRun();
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	}
	}