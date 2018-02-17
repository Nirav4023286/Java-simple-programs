class NewThread implements Runnable
{
	String name;
	Thread t;
	
	NewThread(String threadname)
	{
	 name=threadname;
	 t=new Thread(this,name);	
	 System.out.println("NewThread : "+ t);
 	 t.start();
	}
	public void run()
	{
	 try
	 {
	  for(int i=15;i>0;i--)
	  {
	   System.out.println(name + " : " +i);
	   Thread.sleep(2000);
	  }
	 }
	  catch(InterruptedException e)
 	  {
	   System.out.println(name + "Interrupted");
	  }
	System.out.println(name + "Existing");
	}
}
class SuspendResume
{
	public static void main(String args[])throws InterruptedException
	{
	NewThread ob1 = new NewThread("one");
	NewThread ob2 = new NewThread("two");
	try
	{
 	  Thread.sleep(2000);
	  ob1.t.suspend();
	  System.out.println("Suspending Thread one");
	  Thread.sleep(2000);
	  ob1.t.resume();
	  System.out.println("Resuming thread one");
	  ob2.t.suspend();
	  System.out.println("Suspending Thread one");
	  Thread.sleep(2000);
	  ob2.t.resume();
	  System.out.println("Resuming thread one");
	}
	catch(InterruptedException e)
	{
 	 System.out.println("MAin Thread Interrupted");
	}
	try
	{
	 System.out.println("Waiting for Thread to finish");
	 ob1.t.join();
	 ob2.t.join();
	}
	catch(InterruptedException e)
	{
	 System.out.println("MAin thread interrupted");
	}
	System.out.println("Main Thread existing");
	}
}