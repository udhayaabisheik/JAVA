import java.util.*;
public class Hashing
{
    public static void main(String args[])
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
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