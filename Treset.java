import java.util.*;
public class Treset
{
    public static void main(String args[])
    {
        TreeSet<Integer> set = new TreeSet<>();
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
//Displays by sorting,compared to Hash Tree is slower