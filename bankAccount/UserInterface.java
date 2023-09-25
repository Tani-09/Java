import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        



        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("Enter Your Choice");

        int choice = scanner.nextInt();


        System.out.println("Enter the Account Number: ");
        String accountNumber = scanner.next();

        System.out.println("Enter the Customer Name: ");
        String customerName = scanner.next();

        System.out.println("Enter the Balance amount: ");
        double balance = scanner.nextDouble();
         

        System.out.println("Enter the Number of years ");
        int noOfYears = scanner.nextInt(); 

        scanner.close();


        System.out.println("Customer Name "+ customerName);
        System.out.println("Account Number "+ accountNumber);
        System.out.println("Account Balance "  + decimalFormat.format(balance));

        switch(choice){
            case 1 :
             {
                   

                 SavingsAccount savingsAccount = new SavingsAccount( accountNumber,  customerName,  balance);
                System.out.println("Maintainance Charge for savings Account is Rs " + decimalFormat.format(savingsAccount.calculateMaintainanceCharge(noOfYears)) );
            }


            case 2 :
             {
                 CurrentAccount currentAccount = new CurrentAccount(customerName, accountNumber, balance);
                 System.out.println("Maintainance charge for current account is Rs " + decimalFormat.format(currentAccount.calculateMaintainanceCharge(noOfYears)));
            }
        }
    }
        
    


}
