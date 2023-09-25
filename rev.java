//To write a program to reverse string using recursion
public class rev{
    public static void main(String [] args){
        String str = "Sandy";

     System.out.println(reverse(str));
    }

    public static String reverse(String str){

    if(str==null||str.length()<=1){
        return str;
    }



     return reverse(str.substring(1))+str.charAt(0);
       
        
    }
}