class ThreadDemo extends Thread
{
  private Thread t;
  private String th;
  ThreadDemo(String name)
	{
	th=name;
	System.out.println("Creating  "+th);
	}
  public void run()
  {
	System.out.println("Running: "+th);
	try
	{
	for(int i=4;i>0;i--)
	{
	System.out.println("Thread: "+th+ ","+i);
	Thread.sleep(50);
	}
	}
	catch(Exception e)
	{
	System.out.println("Thread" + th +"interrupted");
	}
	System.out.println("Thread" + th + "existing");
	}
 public void start()
	{
	System.out.println("Starting " + th);
	if(t==null)
	{
	t=new Thread(this,th);
	t.start();
	}
	}
     }
public class TestThread
	{
	 public static void main(String args[])
	{
 	 ThreadDemo t1=new ThreadDemo("Thread-1"); 
	 t1.start();
	 ThreadDemo t2=new ThreadDemo("Thread-2");	
	 t2.start();
	}
	}