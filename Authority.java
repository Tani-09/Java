import java.util.*;

public class Authority {

    public static boolean isAlpha(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isSpaceChar(c) && !Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter Inmate's Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine() + ' ';
        System.out.println("Enter Father's Name: ");
        String father = sc.nextLine();

        if (isAlpha(name) && isAlpha(father)) {
            System.out.println("\n" + name.concat(father));
        } else {
            System.out.print("Write names using letters only!");
        }
    }
}


