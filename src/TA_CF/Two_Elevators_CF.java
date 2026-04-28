package TA_CF;

import java.util.Scanner;

public class Two_Elevators_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://codeforces.com/problemset/problem/1729/A
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t!=0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			ans(a, b, c);
			t--;
		}
	}
	public static void ans(int a, int b, int c) {
		
//		Math.abs ek function hota hai...isme kuch bhi rakho wo hamesha +ve hi return karega
//		a se 1 tak ka distance nikal raha hai....Ex: a = 5 → |5 - 1| = 4
		int t1= Math.abs(a-1);
		
		int t2 = Math.abs(c-b); //pehle Math.abs nikalo and pehle wo c pe jayega
		
		t2 = t2+Math.abs(c-1); //c se phir 1st floor pe jayega
		
		if(t1<t2) {
			System.out.println(1);
		}
		else if(t2<t1) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}

}
