import java.util.*;
public class LHashing
{
    public static void main(String args[])
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(2);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
//Display without sorting