import java.util.*;
public class Secondlarger
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the limit:");
int limit=sc.nextInt();
int a[] = new int[limit];
for(int i=0;i<limit;i++)
{
System.out.println("Enter the " +i+ " value:");
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println("Second Largest number is : " + a[a.length-2]);
}
}