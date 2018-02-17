import java.util.Scanner;
class Student
{
int rollno;
String name,add,contno;
static String schoolName="VN";
void getInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter studs roll: ");
rollno=s.nextInt();
System.out.println("enter name: ");
name=s.next();
System.out.println("enter add: ");
add=s.next();
System.out.println("enter contno: ");
contno=s.next();
}
void showInfo()
{
System.out.println("studs rollno:"+rollno);
System.out.println("name: "+name);
System.out.println("add: "+add);
System.out.println("contno: "+contno);
}
}
class Array3
{
public static void main(String args[])
{
int i,n,m;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n: ");
n=s.nextInt();
Student[] phn=new Student[n];
System.out.println("enter the value of phn");
for(i=0;i<n;i++)
{
phn[i]=new Student();
phn[i].getInfo();
}
for(i=0;i<n;i++)
{
phn[i].showInfo();
}
}
}