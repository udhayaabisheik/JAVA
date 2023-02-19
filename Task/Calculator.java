import java.util.*;
class Calculation
{
Scanner sc1 = new Scanner(System.in);
public void add()
{
System.out.println("Enter the value of a:");
int a=sc1.nextInt();
System.out.println("Enter the value of b:");
int b=sc1.nextInt();
System.out.println("The result is: "+(a+b));
}
public void sub()
{
System.out.println("Enter the value of a:");
int a=sc1.nextInt();
System.out.println("Enter the value of b:");
int b=sc1.nextInt();
System.out.println("The result is: "+(a-b));
}
public void mul()
{
System.out.println("Enter the value of a:");
int a=sc1.nextInt();
System.out.println("Enter the value of b:");
int b=sc1.nextInt();
System.out.println("The result is: "+(a+b));
}
public void mod()
{
System.out.println("Enter the value of a:");
int a=sc1.nextInt();
System.out.println("Enter the value of b:");
int b=sc1.nextInt();
System.out.println("The result is: "+(a%b));
}
public void div()
{
System.out.println("Enter the value of a:");
int a=sc1.nextInt();
System.out.println("Enter the value of b:");
int b=sc1.nextInt();
System.out.println("The result is: "+(a/b));
}
}
public class Calculator
{
public static void main(String args[])
{
Calculation obj = new Calculation();
Scanner sc = new Scanner(System.in);
System.out.println("Select the operation:\n1.Addition\n2.Subraction\n3.Multiplication\n4.Modules\n5.Division");
int i=sc.nextInt();
switch(i)
{
case 1:obj.add();
break;
case 2:obj.sub();
break;
case 3:obj.mul();
break;
case 4:obj.mod();
break;
case 5:obj.div();
break;
default:System.out.println("Number does not match");
break;
}
}
}