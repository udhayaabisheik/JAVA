import java.util.*;
public class For
{
public static void main(String[]args)
{
Scanner obj = new Scanner(System.in);
int a[] = new int[5];
for(int i=0; i<a.length;i++)
{
System.out.println("Enter he values of" + "a["+ i +"]");
a[i]= obj.nextInt();
}
for(int i=0; i<a.length;i++)
{
System.out.println("The values of" + "a["+ i +"]" +"is" +a[i]);
}
}
}