import java.util.Map;
import java.util.HashMap;



public class majority {
    public static void main(String args[]){
        int[] arr = {3,1,2,3,3,4,3,3,4,3};
        int ans = majority(arr);
        System.out.println(ans);
    }
    static int majority(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count ++;
                    if(count>=arr.length/2){
                        return arr[i];
                        
                    }
                }
            }
        }
        
    return -1;
    }
}







// public class majority{
//     public static void main(String[] args){
//         int [] arr = {1,2,3,2,9,2,2};
//         int result = findmajority(arr,7);
//         System.out.println(result);
//     }

//     public static void findmajority(int[] arr, int size){

        

//         Map<Integer, Integer> map = new HashMap<Integer, Integer>();

//         for(int num : arr){
//             int val = map.get(num);
//             if(val == null){
//                 map.put(num, 1);
//             }else{
//                 map.put(num, val++);
//             }
//         }

//         for(Map.Entry<Integer,Integer> entry :  map.entryset()){
//             if(entry.getValue()>size/2){
//                 return entry.getKey(); 
//             }
//         }

//         return -1;
       
//     }
// }