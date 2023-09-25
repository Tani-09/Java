import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class intersection{
    public static void main(String[] args){
        int [] arr1 = {2,3,4,5,6};
        int [] arr2 = {2,3,7,9,10};

        checkIntersection(arr1,arr2);
    }

    public static void checkIntersection(int [] arr1, int[] arr2){

       Set <Integer> set = new HashSet<Integer> ();

        for(int i=0; i<arr1.length; i++){
              set.add(arr1[i]);
        }

        for(int j =0; j<arr2.length;j++){
            if(set.contains(arr2[j])){
                System.out.println(arr2[j]);
            }
        }
    }
}