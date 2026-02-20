package Lec_5;

public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100100;
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n % 10; //division karte hai destination base se
			sum = sum + rem*mul;
			mul = mul * 2; //source se multiply
			n = n / 10; //division karte hai destination base se
		}
		System.out.println(sum);
	}

}
