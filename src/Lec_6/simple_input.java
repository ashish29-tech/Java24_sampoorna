package Lec_6;

import java.util.Scanner;

public class simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://hack.codingblocks.com/app/contests/6498/206/problem
		Scanner sc = new Scanner(System.in);
		int sum = 0;
//		ek infinite loop laagte hai 
		while(true) {
//		ek number input liya
		int x = sc.nextInt();
		sum = sum + x;
//		if sum is negative
		if(sum<0) {
			break;
		}
		System.out.println(x);
		}
	}

}
