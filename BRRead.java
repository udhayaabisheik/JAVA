import java.io.*;
public class BRRead
{
public static void main(String args[])
{
char c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter character 'q' to quit");
try
{
do{
c = (char) br.read();
System.out.println(c);
}while(c!='q');
}
catch(Exception e)
{
e.printStackTrace();
}
}
}