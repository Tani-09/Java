//TO FIND THE FIRST NON REPEATING CHARACTER IN GIVEN STRING
//we will convert string into char array and linked hashmap to store 
//characters as key and value as their frequencies.
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
// import java.util.String;


public class nonrep{
    public static void main(String[] args){
        char c = getFirstNonRepeatedChar("aabbdeef");
        System.out.println("First Non Repeated char is: " + c);
    

    }

    public static char getFirstNonRepeatedChar(String str){
        Map <Character, Integer> countMap = new LinkedHashMap <Character, Integer>();
        for(char ch : str.toCharArray()){
            countMap.put(ch, countMap.containsKey(ch)?countMap.get(ch)+1:1);
        }

        for(Entry <Character, Integer> entry : countMap.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn,t find any non-repeated character");
    }
}