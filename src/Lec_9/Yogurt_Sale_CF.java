package Lec_9;

import java.util.Scanner;

public class Yogurt_Sale_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://codeforces.com/problemset/problem/1955/A
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t!=0) {
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			ans(n, a, b);
			t--;
		}
	}
	public static void ans(int n, int a, int b) {
		
		int sum1 = n*a; //jab direct a (original price) se item kharide jaye
		
		int pair = n/2;
		
		int remain = n%2; //jo bach gaye hai
		
		int sum2 = pair*b;
		
		sum2 = sum2 + remain*a; //jo bach gaye unhe a se kharid liya
		
		System.out.println(Math.min(sum1, sum2));
	}

}
