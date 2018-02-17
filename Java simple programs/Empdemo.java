import java.util.Scanner;
class Employee
{
	int id,salary;
	String name, department,designation;
	
	Employee()
	{
		
		id=0;
		
		name="no name";
		
		department="no department";
		
		designation="no designetion";
		
		salary=0;
		
	}
         Employee(int i)
	{
		
		id=i;
		
		name="no name";
		
		department="no department";
		
		designation="no designetion";
		
		salary=1;
		
	}
	Employee(int i, String n)
	{
		
		id=i;
		
		name=n;
		
		department="no department";
		
		designation="no designetion";
		
		salary=i;
		
	}
	void showInfo()
	{
		System.out.print("\nID="+id+"\nName="+name+"\nDepartment="+department+"\nDesignation="+designation+"\nSalary="+salary);
	}
		
}
class EmpDemo
{
 public static void main(String args[])
  {
  
  Employee s=new Employee(9);
  s.showInfo();
  Employee s1=new Employee(9,"harsh");
  s1.showInfo();
  }
}