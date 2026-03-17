package Lec_6;

import java.util.Scanner;

public class Catch_the_coin_cf {
// 	https://codeforces.com/problemset/problem/1989/A
//	Player speed = 1 step/sec
//	Coin fall speed = 1 step/sec
//	toh player jitna move karega coin utna hi niche girta rahega

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		multiple coordinates/test cases ke liye
		int n = sc.nextInt(); //n = total coins/test cases..means n coordinates input milenge
		while(n>0) { //jab tak n 0 nahi hota, tab tak loop chalega 
//		har coin ke liye...coordinate read ho rha hai
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(y<=-2) { //coin agr kafi niche hai...player use catch nahi kar payega 
			System.out.println("NO"); //coin reachable nahi hai toh No
		}
		else {
			System.out.println("YES"); // coin reachable hai toh Yes
		}
		n--; //Ek test complete toh count reduce
	}
	}
}
