import java.util.*;
public class Vtor
{
public static void main(String args[])
{
Vector<String> v = new Vector<>();
v.add("Apple");
v.add("Orange");
v.add("Strawberry");
v.remove("Apple");
System.out.println("Vector elements:");
Iterator<String> it = v.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}