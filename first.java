public class first{
    public static void main(String[] args){
        String str = "My Very elegant mother just served us noodles";
        getfirstletter(str);
    }

    public static void getfirstletter(String str){
        String[] arr = str.split(" ");

        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            char [] ch = word.toCharArray();
            
                System.out.println(ch[0]);
            }
        }


    }
