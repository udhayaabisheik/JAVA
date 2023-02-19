import java.util.*;
class Student13
{
void display()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name:");
String name = sc.next();
switch(name)
{
case "Arun":System.out.println("Name:Arun,Age:28");
break;
default:System.out.println("Name does not match");
break;
}
}
}
class Fullstack extends Student13
{
void jobrole()
{
String job="Developer";
System.out.println(job);
}
}
class Webdevelopement extends Fullstack
{
void salary()
{
int sal=10000;
System.out.println(sal);
}
}
public class Result
{
public static void main(String[]args)
{
Webdevelopement obj = new Webdevelopement();
obj.display();
obj.jobrole();
obj.salary();
}
}