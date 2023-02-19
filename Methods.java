import java.util.*;
public class Methods
{
int Multi()
{
int a1=2,b1=4;
int c1=a1*b1;
System.out.println(c1);
return c1;
}
char Add()
{
char a2='I';
char c2=a2;
System.out.println(c2);
return c2;
}
float Sub()
{
float a3=4.5f,b3=2.0f;
float c3=a3-b3;
System.out.println(c3);
return c3;
}
String Adding()
{
String a4="Hi",b4="Hello";
String c4=a4+b4;
System.out.println(c4);
return c4;
}
public static void main(String[]args)
{
Methods obj = new Methods();
obj.Multi();
obj.Add();
obj.Sub();
obj.Adding();
}
}