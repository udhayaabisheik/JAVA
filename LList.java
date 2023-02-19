import java.util.*;
public class LList
{
public static void main(String args[])
{
LinkedList<String> list = new LinkedList<>();
list.add("Apple");
list.add("Orange");
list.add(0,"Banana");
System.out.println("LinkedList elements:");
Iterator<String> it = list.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}