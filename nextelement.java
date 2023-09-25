import java.util.Arrays;

public class nextelement {
    public static void main(String[] args) {
        int [] first = {2,3,1,17,19,14};
        int target = 14;
        greater(first, target);
    }

    public static void greater(int [] first, int target){

        
         Arrays.sort(first);

        for(int i = 0; i<first.length; i++){
            if(first[i]>target){
                System.out.println(first[i]);
                break;
            }
        }
    }

    
}
