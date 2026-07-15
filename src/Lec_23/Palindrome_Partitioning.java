package Lec_23;

import java.util.*;
// https://leetcode.com/problems/palindrome-partitioning/description/
public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
//		2D list m convert karna hai toh...1D list integer ya string kiska banayenge ? String ka
		List<List<String>> ans = new ArrayList<>();
		List<String> ll = new ArrayList<String>();
//		Partitioning(ques, ""); //Partitioning("nitin", "") ye call kiya 
		Partitioning(ques, ll, ans);
		System.out.println(ans);
	}
	public static void Partitioning(String ques, List<String> ll, List<List<String>> ans) {
		if(ques.length() == 0) {
//			System.out.println(ans);
			ans.add(new ArrayList<>(ll));
			return;
		}
//		why did we start for loop with i = 1 and not i = 0 ? 
//		The reason is that i represents the length of the first partition, and a partition of length 0 doesn't make sense.
		for(int i = 1; i<=ques.length(); i++) {
//   		substring(0,1) ---> "n"  ............ substring(1) --->  "itin"
//  		Result: n | itin
//			Partitioning(ques.substring(i), ans + ques.substring(0,i) + "|"); //ye | bar isliye laga diya taki dikh jaye partition jo kar rahe hai
//			wo partition print karna hai jisme har part palindrome hai...
//			n|i|t|i|n| ye hoga, n|i|t|in| ye nahi hoga cuz in palindrome nahi hai, n|iti|n| ye hoga, nitin| ye hoga...
			String s = ques.substring(0, i); //ye ans wala part ko bahar kar liya
//			Agr s palindrome nahi hai toh iska call nahi jane dena chahiye tha...mtlb jo chiz ans m add kar rahe hai and wo chiz palindrome nahi hai toh uska call nahi jana chahiye tha
			if(isPalindrome(s) == true) { //check laga diya..agr ye string palindrome hai tabhi call jaye
//				Partitioning(ques.substring(i), ans + s + "|");
				ll.add(s);
				Partitioning(ques.substring(i), ll, ans);
				ll.remove(ll.size()-1); //backtrack
			}
		}
	}
// 	2 pointer aproach se palindrome ka code likh lenge...
		public static boolean isPalindrome(String s) {
			int i = 0;
			int j = s.length()-1; //j last index pe le liye
//			character match karayenge
			while(i<j) {
				if(s.charAt(i)!=s.charAt(j)){
					return false;
				}
				i++;
				j--;
			}
			return true; //andar false nahi hai toh yha true hoga means palindrome 
		}
}
