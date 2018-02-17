import java.util.*;
class Util
	{
	  public static void main(String args[])
	 {
	  String[] arr={"Lets", "enjoy engg", "holiday"};
	 Set<String>set=new TreeSet<String>();

	for(int i=0;i<arr.length;i++)
	{
	set.add(arr[i]);
	}
	for(Object o:set)System.out.println(o+"");
	Iterator<String>i=set.iterator();
	while(i.hasNext())
	{
	System.out.println(i.next()+"");;
	}	
	}
	}