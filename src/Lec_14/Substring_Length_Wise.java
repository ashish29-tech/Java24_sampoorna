package Lec_14;

public class Substring_Length_Wise {
// Hum saare possible substrings print kar rahe hain, but length-wise.
//	Matlab pehle length 1 ke saare substrings: c o d i ....
//	Phir length 2: Co od di in .....
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Codingblocks";
		printallsubstring(s);
	}
	public static void printallsubstring(String s) {
//		Outer loop: Ye decide karta hai: Mujhe kitni length ka substring chahiye? ... len = 12
//		Inner loop: Ye same length ke substrings ko different positions par move karta hai.
		for(int len = 1; len <=s.length(); len++) {
//			Ab sabse important: j len se kyu start ho raha hai?
//			Java mein: s.substring(i, j) .... i = starting index and j = ending index and j exclusive hota hai
//			Is code mein j ko substring ka ending point samjho.
			for(int j = len; j <= s.length(); j++) {
//				starting point nikal rahe hain.
//				Formula: start = end - length
				int i = j - len; //sabse pehle j = 1 and len = 1... so 1-1 = 0 toh i = 0 ho gya and niche s.substring(0, 1) toh C aa jayega
				System.out.println(s.substring(i, j));
			}
		}
	}
}
