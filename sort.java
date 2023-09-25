//TO SORT CHARACTERS IN A STRING

import java.util.Arrays;

public class sort{
    public static void main(String[] args){
        String str = "taniyasawlani";

        char[] newArr = str.toCharArray();
        Arrays.sort(newArr);

      
        
        Arrays.sort(newArr);
       
        
        String sorted = new String(newArr);

        System.out.println(sorted);
    }
}