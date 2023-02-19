import java.util.*;
public class Feach
{
public static void main(String[]args)
{
Scanner obj = new Scanner(System.in);
int a[] = new int[5];
for(int i=0; i<a.length;i++)
{
System.out.print("Enter he values of " + "a["+ i +"]:");
a[i]= obj.nextInt();
}
for(int x:a)
{
System.out.println(x);
}
}
}