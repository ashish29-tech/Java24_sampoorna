package Lec_5;

public class Dec_to_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 38;
		int sum = 0;
		int mul = 1; // ye 1... 10^0(10 to the power 0) hai...10^0= 1
		while (n > 0) { // or jab tak n!=0 hai...
			int rem = n % 2;
			sum = sum + rem * mul; // is sum m directly add nahi karna hai...multiply kar ke add karna hai
			mul = mul * 10; // agli baar multiplier ko 10 ke power m badhana hai..
			n = n / 2; // number ko reduce karna hai
		}
		System.out.println(sum);
	}

}
