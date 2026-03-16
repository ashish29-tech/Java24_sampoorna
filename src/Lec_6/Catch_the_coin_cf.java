package Lec_6;

import java.util.Scanner;

public class Catch_the_coin_cf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		multiple coordinates/test cases ke liye
		int n = sc.nextInt();
		while(n>0) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(y<=-2) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		n--;
	}
	}
}
