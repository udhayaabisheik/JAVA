import java.util.*;
public class Scan
{
public static void main(String[]args)
{
System.out.println("Welcome!");
Scanner sc = new Scanner(System.in);
System.out.println("Enter X value:");
int x = sc.nextInt();
System.out.println("Enter Y value:");
int y = sc.nextInt();
System.out.println("Multiplied value of the given numbers is:" + (x*y));
}
}