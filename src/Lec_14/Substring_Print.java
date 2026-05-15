package Lec_14;

public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		iske sare substring print karne hai
//		next question is...wo print karo jo sirf palindrom ho...ye question khud karna hai.
		String s = "hello"; 
		PrintSubstring(s);
	}
	public static void PrintSubstring(String s) {
		for(int i = 0; i<s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
//				System.out.println(s.substring(i,j)); 
//				agr sirf jo palindrom hai wo chahiye hota toh
				String str = s.substring(i,j);
//				check lagayenge... if str palindrom hai toh print ho wrna na ho..
				if(isPalindrome(str)) {
					System.out.println(str); //single character bhi palindrom hota hai toh h,e,l,ll,l,0..print hoga..
				}
			}
		}
	}
	
//	2 pointer technique use kar rahe hai palindrome check karne ke liye
	public static boolean isPalindrome(String str) {
//		"hello" ke case m left bhi 0 and right bhi 0 hoga...
		int left = 0;
		int right = str.length() - 1;
		
		while(left<right) { //  in case of "hello"...0<0 false hoga toh loop nahi chalega...toh niche true 
			
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true; //
	}

}
