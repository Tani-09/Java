//to print missing number in series
import java.util.HashSet;
import java.util.Set;

public class missing{
    public static void main(String[] args){
        int[] a = {0, 8, 2, 4, 7, 1, 5};
        missingNum(a);

    }

    public static void missingNum(int a[]){

        int n = a.length + 1;
        HashSet <Integer> s = new HashSet<Integer>();
        for(int num : a){
            
                s.add(num);
            
        }

        for(int i=0; i<n; i++){
            if(!s.contains(i)){
                System.out.println(i);
            }
        }
       

    }
}