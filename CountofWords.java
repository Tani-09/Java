import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountofWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Atrticle: ");
        String sentence = sc.nextLine().toLowerCase();
        String [] words = sentence.split("[ ,.?:;]");

        Map <String, Integer> map = new TreeMap<>();

        for(String word : words){
            
            if(!word.isEmpty()){
                map.put(word, map.getOrDefault(word,0) + 1);
            }
            
        }

        int count =0;

        for(int i: map.values()){
            count = count +1;
        }

        System.out.println("Number of words : "+ count);
        System.out.println("Words with respective frequencies: ");


        for(Map.Entry<String, Integer> entry : map.entrySet()){
           System.out.println( entry.getKey() + " : " + entry.getValue());
        }

    }

}