import java.util.*;
class Manager
{
void assigns()
{
int emp;
String Projname;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of Employees:");
emp = sc.nextInt();
System.out.println("Enter projrct name:");
Projname = sc.next();
if(emp<=100)
{
System.out.println("You can't add anymore employee.");
System.out.println(Projname);
}
}
void salary()
{
int sal=5000;
System.out.println(sal);
}
}
class TL extends Manager
{
void work()
{
String workname;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the work name:");
workname = sc.next();
System.out.println(workname);
}
}
class Employee extends TL
{
void emp()
{
String name="Sam";
System.out.println(name);
}
}
public class Inherit
{
public static void main(String[]args)
{
Employee obj = new Employee();
obj.assigns();
obj.work();
obj.salary();
obj.emp();
}
}