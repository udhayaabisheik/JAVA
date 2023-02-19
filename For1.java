import java.util.*;
public class For1
{
public static void main(String[]args)
{
int x[] = new int [100];
int a;
for(int i=0;i<x.length;++i)
{
x[i]=i;
}
for(int i=0;i<x.length;++i)
{
a=i%2;
if(a==0)
{
System.out.println(x[i]);
}
}
}
}