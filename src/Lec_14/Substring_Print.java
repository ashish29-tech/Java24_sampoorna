package Lec_14;

public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		iske sare substring print karne hai
//		next question is...wo print karo jo sirf palindrom ho...ye question khud karna hai.
		String s = "hello"; 
		PrintSubstring(s);
	}
	public static void PrintSubstring(String s) { //hello ko yha PrintSubstring m bheja
		for(int i = 0; i<s.length(); i++) { //i = substring ka starting index
			for(int j = i+1; j<=s.length(); j++) { //j = substring ka ending point
//				System.out.println(s.substring(i,j)); 
//				agr sirf jo palindrom hai wo chahiye hota toh
				String str = s.substring(i,j); //Yaad rakho substring(i,j) mein j exclusive hota hai.
//				check lagayenge... if str palindrom hai toh print ho wrna na ho..
				if(isPalindrome(str)) {
					System.out.println(str); //single character bhi palindrom hota hai toh h,e,l,ll,l,0..print hoga..
				}
			}
		}
	}
	
//	2 pointer technique use kar rahe hai palindrome check karne ke liye
//	Ye method decide karta hai:"Kya given string palindrome hai?"
	public static boolean isPalindrome(String str) {
//		"hello" ke case m left bhi 0 and right bhi 0 hoga...
		int left = 0;
//		Toh -1 kab lagate hain? Jab tumhe index chahiye aur tumhare paas length hai.
		int right = str.length() - 1; //right mein string ke last character ka index store karo. int right = 5 - 1;

		
		while(left<right) { //  
			
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true; //
	}

}
