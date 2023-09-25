//TO CHECK IF TWO STRING ARE ANAGRAM OR NOT
//TWO STRINGS ARE ANAGRAMS IF THEY CONTAIN SAME CHARACTERS BUT IN DIFFRENT ORDERS

//STEPS:
//Take 2 strings as input, convert into char array, sort both, compare both

import java.util.Arrays;

public class anagram{
    public static void main(String[] args){

     String str1 = "java";
     String str2 = "istrom";
     System.out.println("Both strings are anagrams: " + anagramCheck(str1,str2));
    }

    public static boolean anagramCheck(String str1, String str2){

     char[] charArrayFromString1 = str1.toCharArray();
     char[] charArrayFromString2 = str2.toCharArray();
     Arrays.sort(charArrayFromString1);
     Arrays.sort(charArrayFromString2);
     

     return Arrays.equals(charArrayFromString1, charArrayFromString2);
      
    }
}