//to print words with even length in a given sentence string
public class evenl{
    public static void main(String[] args){
        String str = "Hellew Worls we ist";

        for(String s : str.split(" ")){
            if(s.length() %2==0){
                System.out.println(s);
            }
        }
    }
}