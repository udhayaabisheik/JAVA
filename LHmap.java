import java.util.*;
public class LHmap
{
    public static void main(String args[])
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Chaitanya");
        map.put(105, "Derick");
        map.put(111, "Logan");
        map.put(120, "Paul");
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Map.Entry m = (Map.Entry)it.next();
            System.out.println("Key is: " +m.getKey()+ " & Value is: ");
            System.out.println(m.getValue());
        }
    }
}