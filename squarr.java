import java.util.Arrays;

public class squarr{
    public static void main(String[] args){
          int [] arr = {-4,-1,1,2,6,7};
          for(int i=0; i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
          }

         Arrays.sort(arr);

          for(int num : arr){
            System.out.println(num + "  ");
          }
    }
}