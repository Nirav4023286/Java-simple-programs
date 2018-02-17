import java.util.Scanner;
interface Vehicle
{
void start();
void stop();
void move();
void park();
}
class Tw implements Vehicle
{
public void start()
{
}
public void stop()
{
}
public void move()
{
}
public void park()
{
}
}
class Fw implements Vehicle
{
public void start()
{
}
public void stop()
{
}
public void move()
{
}
public void park()
{
}
}
class Truck implements Vehicle
{
public void start()
{
}
public void stop()
{
}
public void move()
{
}
public void park()
{
}
}
class Rundemo
{
public static void main(String args[])
{
Tw t=new Tw();
Fw f=new Fw();
Truck r=new Truck();
t.start();
t.stop();
t.move();
t.park();
f.start();
f.stop();
f.move();
f.park();
r.start();
r.stop();
r.move();
r.park();
Vehicle v;
v=t;
v.start();
System.out.println("two wheeler is started");
v.move();
System.out.println("two wheeler is moving");
v.stop();
System.out.println("two wheeler is stopped");
v.park();
System.out.println("two wheeler parked");
v=f;
v.start();
System.out.println("four wheeler is started");
v.move();
System.out.println("four wheeler is moving");
v.stop();
System.out.println("four wheeler is stopped");
v.park();
System.out.println("four wheeler is parked");
v=r;
v.start();
System.out.println("truck is started");
v.move();
System.out.println("truck is moving");
v.stop();
System.out.println("truck is stopped");
v.park();
System.out.println("truck is parking");
}
}














