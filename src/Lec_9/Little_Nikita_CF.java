package Lec_9;

import java.util.Scanner;

public class Little_Nikita_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// https://codeforces.com/problemset/problem/1977/A
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		while(t!=0) { //Loop runs as long as t is not 0
			int n = sc.nextInt(); //Takes input n
			int m = sc.nextInt(); //Takes input m
			
			ans(n,m); //calls function
			t--; //Decreases t manually at the end of loop
		}
//		Another and better way of writing while loop
//		while(t-- > 0) {   // better way
//	    int n = sc.nextInt();
//	    int m = sc.nextInt();
//
//	    ans(n, m);
//	}
	}
	
//	public static void ans(int n, int m) {
//		
////		n = 5 and m = 8 then kam moves se tower banana possible nahi hai
//		if(n<m) {
//			System.out.println("No");
//		}
////		n = 9 and m = 5 then 9>5 toh aage badhenge
//		else if(n>m) {
//			
////			if n = 9 and m = 5 then 9-5 = 4...toh 4 moves ke liye check kar lenge
//			int remmov = n-m;
//			
////			4%2 === 0 hoga toh mtlb... 1 baar cube dalna and 1 baar nikalna pe barabar ho jayega and last m tower ban jayega
//			if(remmov%2==0) {
//				System.out.println("Yes");
//			}
////			4%2 agr 0 ke equal nahi hua mtlb odd no. hua toh remaining walo se last m add and remove ke baad bhi nahi ban payega tower
//			else {
//				System.out.println("No");
//			}
//		}
//		else {
//			System.out.println("Yes");
//		}
//	}
	
//	Better way suggested by chatGPT
	public static void ans(int n, int m) {
	    if(n >= m && (n - m) % 2 == 0) {
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
	    }
	}

}
