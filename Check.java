import java.util.*;
public class Check
{
public static void main(String[]args)
{
Scanner obj = new Scanner(System.in);
System.out.println("\nEnter the height:");
int height = obj.nextInt();
System.out.println("\nEnter the weight:");
int weight = obj.nextInt();
if(height >= 160 && weight >= 60)
{
System.out.println("The person falls under the selected category.");
}
else
{
System.out.println("The person does not falls under the selected category.");
}
}
}