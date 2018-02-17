import java.util.Scanner;
class Staticdemo
{
static
{
System.out.println("ASB1");
}
int ns;
static int s;
void nsM1()
{
System.out.println("nsM1"+ns);
System.out.println("nsM2"+s);
nsM2();
//nsM1();               //recursion for nsM1
//sM1();
//sM2();
}
void nsM2()
{
System.out.println("nsM2"+ns);
System.out.println("nsM2"+s);
nsM1();
//sM1();
//sM2();
}
static void sM1()
{
//System.out.println("sM1"+ns);
System.out.println("sM1"+s);
//nsM1();
//nsM2();
//sM1();
sM2();                //only static members or class variables accessible
}
static void sM2()
{
System.out.println("sM2"+s);
//System.out.println("sM2"+ns);
//nsM1();
//nsM2();
sM1();
//sM2();
}
static                  //in ASB we never declare object name
{
System.out.println("ASB2");         //annonymous static block
}
}
class Sdemo
{
public static void main(String args[])
{
Staticdemo d=new Staticdemo();
d.ns=10;
d.nsM1();
d.sM1();
d.sM2();
}
}
