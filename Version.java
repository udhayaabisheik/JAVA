import java.util.*;
public class Version
{
public static void main(String[]args)
{
System.out.println("The java version is:" +System.getProperty("java.version"));
System.out.println("The java home path is:" +System.getProperty("java.home"));
System.out.println("The java vendor name is:" +System.getProperty("java.vendor"));
System.out.println("The java vendor url is:" +System.getProperty("java.vendor.url"));
System.out.println("The java class path is:" +System.getProperty("java.class.path"));
}
}