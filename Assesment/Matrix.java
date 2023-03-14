import java.util.Scanner;

public class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[14];
        System.out.println("Enter 14 integers:");

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Matrix Format:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if((i+1) % 3 == 0){
                System.out.println();
                if((i+1) % 15 == 0){
                    break;
                }
            }
        }
    }
}