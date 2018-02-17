import java.util.Scanner;
interface Shape
{
void draw();
}
class Circle implements Shape
{
public void draw()
{
}
}
class Square implements Shape
{
public void draw()
{
}
}
class Rect implements Shape
{
public void draw()
{
}
}
class Rundemo1
{
public static void main(String args[])
{
Circle c=new Circle();
Rect r=new Rect();
Square s=new Square();
c.draw();
r.draw();
s.draw();
Shape sh;
sh=c;
sh.draw();
System.out.println("circle is drawn");
sh=r;
sh.draw();
System.out.println("square is drawn");
sh=s;
sh.draw();
System.out.println("rectangle is drawn");
}
}
