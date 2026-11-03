package Lec_6;

import java.util.Scanner;

public class simple_input {
//	Jab tak sum negative nahi hota, tab tak input leta rahega aur number print karta rahega.
//	Sirf x negative hone se loop nahi rukega.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://hack.codingblocks.com/app/contests/6498/206/problem
		Scanner sc = new Scanner(System.in);
		int sum = 0;
//		ek infinite loop laagte hai 
		while(true) {
//		ek number input liya
		int x = sc.nextInt();
		sum = sum + x; // input number ko running sum mein add karta hai.
//		if sum is negative
		if(sum<0) {
			break;
		}
		System.out.println(x);
		}
	}

}
