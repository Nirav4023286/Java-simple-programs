import java.util.Scanner;
class Channel
{
int chno;
String name,chlang;
Channel()
{
chno=0;name=" ";
chlang=" ";
}
Channel(int chno,String name,String chlang)
{
this.chno=chno;
this.name=name;
this.chlang=chlang;
}
void getInfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter chno");
chno=s.nextInt();
System.out.println("enter the name");
name=s.next();
System.out.println("enter chlang");
chlang=s.next();
}
void showInfo()
{
System.out.println("Chno"+chno);
System.out.println("name"+name);
System.out.println("chlang"+chlang);
}
}
class Demth1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Channel s1=new Channel();
s1.showInfo();
s1.getInfo();
s1.showInfo();
Channel s2=new Channel(11,"foodfood","hindi");
s2.showInfo();
s2.getInfo();
s2.showInfo();
}
}