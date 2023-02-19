import java.util.*;
class Manager
{
void assigning()
{
int emps;
String Projname;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of Employees:");
emps = sc.next();
System.out.println("Enter projrct name:");
Projname = sc.next();
if(emps<=100)
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
private void work()
{
String workname;
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
public class Maininherit
{
public static void main(String[]args)
{
Employee obj = new Employee();
obj.assigns();
obj.work();
obj.salary();
}
}