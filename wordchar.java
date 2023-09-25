import java.util.Arrays;

public class wordchar{
    public static void main(String [] args){
        String str = "My very elegant are used to remember planets";

        String wordArr[] = str.split(" ");
        
        int count=0;
        int characterCount = 0;

        for(int i=0; i<wordArr.length; i++){
            count++;
        }

        for(int i = 0; i<wordArr.length; i++){
            count++;

             String word = wordArr[i];
             char c[]= word.toCharArray();
              for(int j=0; j<c.length; j++){
                characterCount++;
               
            }
            System.out.println("characters in: " + wordArr[i] + " -> "+ characterCount);
            characterCount = 0;

            // char c[]= wordArr[i].toCharArray;
            // for(int j=0; j<c.length; j++){
            //     characterCount++;
            // }

            
        }

        System.out.println("Total Number of words in given sentence are: " +count);

    }
}