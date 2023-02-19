import java.util.*;
public class Array
{
public static void main(String[]args)
{
int x[]={10,11,12,15,13,14,16,17,18};
try
{
x[20]=5;
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println("Value exceeds space");
}
System.out.println("Value in x[2] is:" +x[2]);
System.out.println("Value in mean is:" +(x[2]+x[1])/2);
System.out.println("Top="+x[5]);
}
}
