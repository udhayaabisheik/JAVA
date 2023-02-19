import java.util.*;
public class Prime
{
public static void main(String[] args) {
for(int i=1;i<=10;i++)
{
int p=0;
for(int j=2;j<=i/2;j++) 
{
if(i%j==0) 
{
p++;
break;
}
}
if(p==0) 
{
System.out.println(i);
}
}
}
}