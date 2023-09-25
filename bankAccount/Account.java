public class Account{
    private String accountNumber;
    private String customerName;
    private double balance;

    //public getters and setters
    public String getaccountNumber(){
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getcustomerName(){
        return customerName;
    }

    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }


    //constructor created
    public Account(  String accountNumber, String customerName, double balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }


}