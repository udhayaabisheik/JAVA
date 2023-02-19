import java.util.*;
class Fullstack
{
int num;
String name;
Fullstack()
{
System.out.println("Constructor called");
}
}
class RS
{
public static void main(String[]args)
{
Fullstack obj = new Fullstack();
System.out.println(obj.name);
System.out.println(obj.num);
}
}