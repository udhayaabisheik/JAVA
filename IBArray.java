import java.util.*;
class IBArray
{
public static void main(String args[])
{
ArrayList<String> arrList = new ArrayList<>();
arrList.add("Hockey");
arrList.add("Cricket");
arrList.add(0,"Football");
System.out.println("ArrayList Elements:");
for(String str:arrList)
System.out.println(str);
}
}