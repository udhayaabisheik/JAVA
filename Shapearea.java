import java.util.*;
interface Area
{
public void square();
public void circle();
public void rectangle();
public void triangle();
}
interface Circumference
{
public static void square()
{
double a=12.20;
System.out.println("Circumference of the square is " +4*a);
}
}
public class Shapearea implements Area,Circumference
{
public void circle()
{
Scanner kb = new Scanner(System.in);
System.out.println("Enter the radius of the circle:");
double r = kb.nextInt();
System.out.println("Area of the circle is " +(3.142*r*r));
}
public void square()
{
Scanner kb2 = new Scanner(System.in);
System.out.println("Enter the length of the side of the square:");
double s = kb2.nextInt();
System.out.println("Area of the square is " +s*s);
}

public void rectangle()
{
Scanner kb3 = new Scanner(System.in);
System.out.println("Enter the length of the Rectangle:");
double l=kb3.nextInt();
System.out.println("Enter the breadth of the Rectangle:");
double b=kb3.nextInt();
System.out.println("Area of the Rectangle is " +l*b);
}
public void triangle()
{
Scanner kb4 = new Scanner(System.in);
System.out.println("Enter the length of the Triangle:");
double base=kb4.nextInt();
System.out.println("Enter the breadth of the Triangle:");
double h=kb4.nextInt();
System.out.println("Area of the Triangle is " +(0.5*base*h));
}
public static void main(String[]args)
{
Shapearea geometry = new Shapearea();
geometry.circle();
geometry.square();
geometry.rectangle();
geometry.triangle();
Circumference.square();
}
}