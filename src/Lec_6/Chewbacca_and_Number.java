package Lec_6;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 long n = sc.nextLong();
		 System.out.println(Chewbacca(n));
	}
	//ek function bna lete hai chewbacca number hai ya nai
//	return type long rakh lete hai...number jo bhi bnayenge return kar denge long
	public static long Chewbacca(long n) {
		long mul = 1;
		long sum = 0; 
		while(n>9) { //jab tak double digit hai tab tak chale...single digit ko alag se handle karenge
			long rem = n % 10;
			if(rem>=5) {
//				9-rem kar ke multiply kar ke sum m add kar denge
				sum = sum + (9-rem)*mul;
			}
			else {
				sum = sum + rem * mul;
			}
				mul = mul*10;
				n = n/10;
		}
//		single digit ke liye...agr number 9 hi bacha ya number 5 se chota tha
		if(n==9 || n<5) {
//			number 9 ho ya 5 se chota ho us case m us no. ko direct add kar denge
			sum = sum + n * mul;
		}
		else {
//			wrna invert kar do
			sum = sum + (9-n) * mul;
		}
		return sum;
	}

}
