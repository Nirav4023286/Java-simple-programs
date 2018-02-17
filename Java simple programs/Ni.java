
	class Nir implements Runnable
	{
	String name;
	public void run()
	{
	int count=0;
	 while(count<3)
	 {
	 name=Thread.currentThread().getName();
	 System.out.println(name);
	 count++;
	 } 
	}
	}
public  class Ni
	{
	 public static void main(String args[])
	 {
 	  Nir n=new Nir();
	  Thread t1=new Thread(n);
	  t1.start();
	 }
 	}