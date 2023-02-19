import java.util.*;
public class Lifo
{
    public static void main(String args[])
    {
        Stack<String> s = new Stack<>();
        s.push("Chaitanya");
        s.push("Ajeet");
        s.push("Hari");
        s.pop();
        s.push("Steve");
        s.push("Arun");
        s.pop();
    System.out.println("Stack elements:");
    for(String str: s)
    {
        System.out.println(str);
    }
    System.out.println("Last inserted value:" +s.peek());
    }
}