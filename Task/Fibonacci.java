import java.util.*;
public class Fibonacci
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n,n1=0,n2=1,temp;
System.out.print("Enter number of fibonacci series : ");
n=sc.nextInt();
System.out.print(n1 + " " + n2 + " ");
for(int i=3;i<=n;i++)
{
temp=n1+n2;
System.out.print(temp + " ");
n1=n2;
n2=temp;
}
} 
}