import java.util.*;
public class Q
{
    public static void main(String args[])
    {
        Queue<Integer> set = new Queue<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(2);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}