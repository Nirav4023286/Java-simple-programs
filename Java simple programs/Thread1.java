	class Thread1
 	 {
	  public static void main(String args[])
	  {
	   Thread t=Thread.currentThread();
	   System.out.println("Name="+t.getName());
	   System.out.println("Priority= "+t.getPriority());
	   
 	   t.setName("NIRAJ");
	   t.setPriority(Thread.MAX_PRIORITY);
	   System.out.println("Name= "+t.getName());
	   System.out.println("Priority= "+t.getPriority());
	   Thread t1=new Thread();
	   System.out.println("Name="+t1.getName());
	   System.out.println("Priority= "+t1.getPriority());
	   t1.setPriority(Thread.MIN_PRIORITY);
           System.out.println("Priority= "+t1.getPriority());
	   }
   	}