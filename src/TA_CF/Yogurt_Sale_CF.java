package TA_CF;

import java.util.Scanner;

public class Yogurt_Sale_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://codeforces.com/problemset/problem/1955/A
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) { //Jab tak t zero nahi hota, loop chalta rahega...Matlab: t baar loop chalega
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			ans(n, a, b);
		}
	}
	public static void ans(int n, int a, int b) {
//		sare yogurt ki a price pe lo
		int sum1 = n*a; //jab direct a (original price) se item kharide jaye
		
//		kitne pair bna sakte hai
		int pair = n/2;
		
//		jo 1 bach gya
		int remain = n%2; //jo bach gaye hai
		
		int sum2 = pair*b; //pair ko b price pe buy
		
		sum2 = sum2 + remain*a; //jo bach gaye unhe a se kharid liya
		
//		dono m se minimum le liya
		System.out.println(Math.min(sum1, sum2));
	}

}
