import java.util.Scanner;

public class Posibility{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words: ");
        String word = scanner.nextLine();
        if(word.length() <= 20){
            if(word.contains("egg") || word.contains("EGG")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("String is greater than 20.");
        }
    }
}
