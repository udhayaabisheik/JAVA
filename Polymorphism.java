import java.util.*;
class Cal
{
public void add(int a,int b)
{
System.out.println("The Addition of two numbers is: "+(a+b));
}
public void add(int a,int b,int c)
{
System.out.println("The Addition of three numbers is: "+(a+b+c));
}
public void sub(int a,int b)
{
System.out.println("The Subraction of two numbers is: "+(a-b));
}
public void sub(int a,int b,int c)
{
System.out.println("The Subraction of three numbers is: "+(a-b-c));
}
public void mul(int a,int b)
{
System.out.println("The Multiplication of two numbers is: "+(a*b));
}
public void mul(int a,int b,int c)
{
System.out.println("The Multiplication of three numbers is: "+(a*b*c));
}
}
class Cal1 extends Cal
{
public void add(int a,int b)
{
System.out.println("Addition of two numbers:" +(a+b));
}
}
public class Polymorphism
{
public static void main(String args[])
{
Cal obj = new Cal();
obj.add(4,2);
obj.add(4,2,2);
obj.sub(4,2);
obj.sub(8,4,2);
obj.mul(4,2);
obj.mul(4,2,2);
Cal1 obj1 = new Cal1();
obj1.add(4,2);
}
}