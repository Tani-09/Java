

public class vow{
    public static void main(String[] args){
        String s = "alphabetically";
        getAll(s);
    }

    public static void getAll(String s){
     

     for(int i=0; i<s.length();i++){
        if(isVowel(s.charAt(i))){

            System.out.println(s.charAt(i));
        }else if(!isVowel(s.charAt(i))){
            System.out.println("Conso: "+s.charAt(i));
        }
     }
         
        
      }

      public static boolean isVowel(char c){
        c = Character.toUpperCase(c);
        return (c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
      }



    
}