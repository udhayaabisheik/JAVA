import java.util.*;
public class Replace
{
public static void main(String[]args)
{
int a[] = {1,2,3,4,6,7,8,9,10};
Scanner obj = new Scanner(System.in);
System.out.println("Array values are : " +Arrays.toString(a)); 
System.out.println("Enter the position:");
int position = obj.nextInt();
System.out.println("Enter the new value:");
int newValue = obj.nextInt();
for(int i=a.length-1; i>position;i--)
{
a[i]=a[i-1];
}
a[position]=newValue;
System.out.println("New Array: "+Arrays.toString(a));
}
}