import java.util.*;
public class TryEx
{
public static void main(String args[])
{
try
{
int a[]={1,2,3,4,5};
a[10]=5;
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println("Value exceeds space");
}
}
}