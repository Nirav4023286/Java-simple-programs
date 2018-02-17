import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers: ");
int i,j,c=1;
char k;
int n=s.nextInt();
for(i=0;i<=n;i++)
{
for(j=0;j<=n;j++)
{
if(i>=j)
{
k=(char)(c+(96));
c++;
System.out.println(k);
}
else
{
System.out.println(" ");
}
}
System.out.println("\n");
}
}
}