 import java.util.*;
public class digits {

    public static double power(double x,int n) {
		if(n == 0) return 1.0;

        double xpm = power(x, n-1);

        return x * xpm;


	}

    public static double pow(double x, int n){
        if(n < 0){

            return 1.0 / power(x,-n);

        }

        return power(x,n);
    }

	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number x: ");
        double x = scn.nextDouble();
        System.out.println("Enter power n: ");
        int n = scn.nextInt(); //input the number
		System.out.println(pow(x,n));
	}
} 
