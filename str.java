import java.util.TreeMap;
import java.util.Map;

public class str{
    public static void main(String [] args){

       String str = "Happy New Year Is Nearing.";
       str s = new str();
       s.getVowelCount(str);
       s.getFrequency(str);


    }

    private void getVowelCount(String str){
        int wordcount = 0; int vowelcount =0; int uppercasecount = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            switch(c){
                case ' ':
                case '.':
                    wordcount++;
            }

            switch(c){
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' :
                case 'a' :  
                case 'e' :  
                case 'i' :  
                case 'o' :  
                case 'u' :     
                    vowelcount++;       
            }

         if(c>=65 && c<=90){
            uppercasecount++;
         }

        }

        System.out.println("  Wordcount: " + wordcount + "  VowelCount: " + vowelcount + "  uppercase: " + uppercasecount);
    }

    private void getFrequency(String str){

            TreeMap<Character, Integer> map = new TreeMap<>();
            for(int i=0; i<str.length(); i++){
                Integer c = map.get(str.charAt(i));

                if(map.get(str.charAt(i))== null){
                    map.put(str.charAt(i),1);
                }else{
                    map.put(str.charAt(i),++c);
                }
            }

            for(Map.Entry entry:map.entrySet()){
                 System.out.println("Character = " + entry.getKey());
                 System.out.println("Frequency = " + entry.getValue());
                 System.out.println("\n");


            }
      
    }
}