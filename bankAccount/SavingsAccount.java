public class SavingsAccount extends Account implements MaintainanceCharge {
    public SavingsAccount(String customerName, String accountNumber, double balance){
        super(accountNumber, customerName, balance);
    }

    public float calculateMaintainanceCharge(float noOfYears){
            
        float n = noOfYears;
        float m =50;
        float Mcharge = (m*n)+50;

        return Mcharge;
}
}
