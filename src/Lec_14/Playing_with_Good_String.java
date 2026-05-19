package Lec_14;

import java.util.Scanner;

public class Playing_with_Good_String {
//	https://codeskiller.codingblocks.com/problems/549

//	Is code ki complexity o(n) linear time hoga cuz sara kaam constant ho rha hai...each vowel check karna bhi toh constant kaam hai...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		string imput kaise lete hai
		String s = sc.next();
		System.out.println(length_Good_String(s));
	}
	
	public static int length_Good_String(String s) {
//		yha logic similar to kadane's algo lagega...
//		Kadane’s Algorithm is used to find: Maximum Sum Subarray in o(n) time complexity
//		aisi subarray ka sum jo max ho...yha aise continuous subarray jiska sara character vowel ho...
		
//		"pbaeipmblpradsdaaioukmaa" we get the intuition that string pe loop lagega...
		int ans = 0;
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i); //character nikal lenge
//			if tabhi chalta hai...jab condition likhi hui isme true hoti hai...
			if(isvowels(ch)) { // if(isvowels(ch) == true) { aise bhi likh sakte the
				count++; //count ko ++
			}
			else {
				ans = Math.max(ans,count); //purane wala answer and abhi wala count inka max
				count = 0;
			}
		}
//		yha last m ek baar aur check kar lenge cuz ho sakta hai last m kafi baar lagatar koi vowel aa gya ho and else chala hi na ho...
		ans = Math.max(ans, count);
		return ans; 
		
	}
//	vowel and consonant check karne ka function
	public static boolean isvowels(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true; //character a,e,i,o,u m se match kar gya toh vowel hai 
		}
		return false; //wrna false means consonant hai...
	}

}
