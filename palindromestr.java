//TO CHECK IF GIVEN STRING IS PALINDROME

import java.util.Scanner;

public class palindromestr{
    public static void main(String[] args){
        String reverse = "";
        
        System.out.println("Give the string: ");
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();

        for(int i= original.length()-1;i>=0; i--){
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
             System.out.println("Not a Palindrome");
        }
    }



  
}