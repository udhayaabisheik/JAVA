import java.util.*;
public class Nooperator
{
public static void main(String[] args) 
{
int n1,n2;
Scanner sc = new Scanner(System.in); 
System.out.print("Enter 1st number: ");
n1=sc.nextInt(); 
System.out.print("Enter 2nd number: ");
n2=sc.nextInt(); 
while(n2!=0)
{
int carry=n1&n2;
n1=n1^n2;
n2=carry<<1;
}
System.out.print("Sum = " +n1); 
System.out.print("\n"); 
} 
}