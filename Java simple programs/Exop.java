import java.util.Scanner;
class Engine
{
void start()
{
System.out.println("engine started");
}
void stop()
{
System.out.println("engine stopped");
}
}
class Vehicle
{
void move()
{
System.out.println("vehicle is moving");
}
}
class Exop
{
public static void main(String args[])
{
Engine e=new Engine();
e.start();

Vehicle v=new Vehicle();
v.move();
e.stop();
}
}
