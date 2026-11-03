package Lec_6;

import java.util.Scanner;
// https://codeskiller.codingblocks.com/problems/132
//Thinking rule: Har digit ke liye original aur inverted value compare karo. Jo chhoti ho, use rakho. 
//Lekin first digit ko 0 nahi bana sakte.
//Interview mein approach kaise explain karoge?
//1. Har digit ka inverted form 9 - digit hai.
//2. Agar inverted digit chhota hai, toh use choose karenge.
//3. Digits right-to-left process karne ke liye % 10 aur / 10 use karenge.
//4. mul se har transformed digit ko correct place value par add karenge.
//5. Leading digit ko alag handle karenge, taaki number zero se start na ho.
public class Chewbacca_and_Number {
// 997878, 4545 ye input dal ke check karna hai console m
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 long n = sc.nextLong(); //long n mein input number store hota hai.
		 System.out.println(Chewbacca(n));
	}
	//ek function bna lete hai chewbacca number hai ya nai
//	return type long rakh lete hai...number jo bhi bnayenge return kar denge long
	public static long Chewbacca(long n) {
//		mul batata hai ki transformed digit ko kis place value par rakhna hai: ones, tens, hundreds, etc.
		long mul = 1; 
//		sum final transformed number banata hai.
		long sum = 0; 
		while(n>9) { //jab tak double digit hai tab tak chale...single digit ko alag se handle karenge
			long rem = n % 10; //n % 10 → last digit nikalta hai.
			if(rem>=5) { //Agar digit 5 ya usse badi hai, toh 9 - rem choose karte hain.
//				9-rem kar ke multiply kar ke sum m add kar denge
				sum = sum + (9-rem)*mul; 
			}
			else { //Otherwise original digit choose karte hain.
				sum = sum + rem * mul;
			}
				mul = mul*10; //first time ke liye multiplier 10 ho jayega and later 10 ki power increase hoti rahegi
				n = n/10; //n = n / 10 → last digit hata dete hain.
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
