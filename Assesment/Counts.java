import java.util.*;

public class Counts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharCount = 0;
        int wordCount = 0;
        int sentenceCount = 0;

        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(Character.isLetter(c)){
                charCount++;
                if (isVowel(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }else if(Character.isWhitespace(c)){
                wordCount++;
            }else {
                specialCharCount++;
            }
            if(c == '.' || c == '?' || c == '!'){
                sentenceCount++;
            }
        }
        
        wordCount++;
        System.out.println("Character count: " + charCount);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("Special character count: " + specialCharCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
    }

    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
