class N extends Thread
	{
	String name;
	public void run()
	{
	for(int count=0;count<=3;count++)
	{
	System.out.println(Thread.activeCount());
	name=Thread.currentThread().getName();
	System.out.println(name);
	}
	if(name.equals("Threadophadu1"))
	System.out.println("GO Go Gp");
	else
	System.out.println("YO YO Ye");
	}	
	}
class H1
{
public static void main(String args[])
{
N a=new N();
a.setName("Nahi NO Way");
System.out.println(Thread.currentThread().isAlive());
System.out.println(a.isAlive());
a.start();
System.out.println(Thread.currentThread().isAlive());
System.out.println(a.isAlive());
}
}