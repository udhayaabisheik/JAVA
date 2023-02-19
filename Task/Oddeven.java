import java.util.*;
public class Oddeven
{
public static void main(String[]args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number:");
int a = obj.nextInt();
if(a%2==0)
{
System.out.println("The given number is Even.");
}
else
{
System.out.println("The given number is Odd.");
}
}
}