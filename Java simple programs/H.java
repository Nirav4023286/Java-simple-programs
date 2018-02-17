class N extends Thread
	{
	String name;
	public void run()
	{
	int count=0;
	while(count<=3)
	{
	System.out.println(Thread.activeCount());
	name=Thread.currentThread().getName();
	count++;
	System.out.println(name);
	if(name.equals("Threado"))
	System.out.println("Yeah");
	else
	System.out.println("Noooo");
	}	
	}
}
class H
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