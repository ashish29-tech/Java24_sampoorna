package Lec_9;

import java.util.Scanner;

public class Three_Brothers_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	https://codeforces.com/problemset/problem/2010/B
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ans(a,b);
	}
	public static void ans(int a, int b) {
		int sum = a+b;
		System.out.println(6-sum);
	}

}
