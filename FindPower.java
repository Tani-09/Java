import java.util.*;
public class FindPower {
	
	public static double power(double x, int n) {
        if(n == 0) return 1.0;
        
        double xpnm1 = power(x,n-1); //x power n-1 (xpnm1)

		return x * xpnm1; 
    }
    
    public static double pow(double x, int n) {
        if(n < 0) {
            return 1.0 / power(x,-n);
        }
        
        return power(x,n);
    }
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double x = scn.nextDouble();
		System.out.println("Enter the power: ");
		int n = scn.nextInt();

        System.out.println(pow(x,n));
	}
}
