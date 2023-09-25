public class CurrentAccount extends Account implements MaintainanceCharge{
    public CurrentAccount(String customerName, String accountNumber, double balance ){
        super(accountNumber, accountNumber, balance);
    }

    public float calculateMaintainanceCharge(float noOfYears){
            
            float n = noOfYears;
            float m =100;
            float Mcharge = (m*n)+200;

            return Mcharge;
    }
}
