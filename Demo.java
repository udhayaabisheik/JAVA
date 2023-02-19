public class Demo
{
public static void main(String[]args)
{
int a=10;
int b=5;
int x=10;
int y=-10;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);
System.out.println(10*10/5+3-1*4/2);//bodmas
System.out.println(x>>>2);
System.out.println(x>>2);
System.out.println(y>>>2);//return the MSB of the value
System.out.println(y>>2);
System.out.println(x<<2);
System.out.println(y<<2);
int t1=2;
int t2=5;
int a1=2;
int a2=5;
//Ternaryoperator
int min=(t1<t2)?t1:t2;
System.out.println("ternaryoperator output:" +min);
//Assignmentoperator
a1+=4;
a2-=4;
System.out.println("asssignmentoperator output:" +a1);
System.out.println("asssignmentoperator output:" +a2);
}
}