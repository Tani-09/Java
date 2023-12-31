import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        player.setScoreList(new ArrayList<>() );
        boolean flag = true;

        while (flag){
            System.out.println("\n\n\n1. Add Runs Scored");
            System.out.println("2. Calculate average runs scored");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch(choice){
                case 1: {
                    System.out.println("Enter the runs scored: ");
                    int score = scanner.nextInt();
                    player.addScoreDetails(score);
                    
                    break;
                }

                case 2: {
                    System.out.println("Average runs secured: ");
                    System.out.println(player.getAverageRunScored());
                    break;
                }

                case 3: {
                    System.out.println("\n\n\nThankyou for using the application.\n\n");
                    flag = false;
                    break;
                }
                
            }
          
        }

          scanner.close();
    }
}
