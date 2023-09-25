import java.util.*;
import java.util.Map;
import java.util.HashMap;
// import java.util.StringBuilder;

public class compress{
    public static void main(String[] args){
        String s="aabbbcdddd";
        System.out.println(compressed(s));
        
    }

    public static String compressed(String s){

        Map <Character, Integer> map = new HashMap <>();
        StringBuilder result = new StringBuilder();

        char [] ch = s.toCharArray();

        for(char num : ch){
            
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                int value = map.get(num);
                map.put(num, value+1);
            }
            
        }

        System.out.println("The abbreviated string is: ");

       for(Map.Entry<Character,Integer> entry : map.entrySet()){
             result.append(entry.getKey()).append(entry.getValue());
       }

       return result.toString();

    }

}