public class TryCatchEx
{
public static void main(String args[])
{
System.out.println("11");
System.out.println("Before divisible");
try
{
int x=1/0;
System.out.println("After divide");
}
catch(ArithmeticException e)
{
System.out.println("A number cannot be divided by zero");
}
finally
{
System.out.println("Final statement");
}
}
}