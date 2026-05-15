package Lec_14;

public class Check_Palindromic {
// Time complexity algorithm ki hoti hai
// ek palindrome...check karna ..kisi bhi string ka toh uski time complexity kya hogi worst case m ?
// Loop adhi baar chalega...n/2 times...toh O(n) bolenge na agr string ki length n hai toh...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
//		Two Pointer approach
		int i = 0; // start m i 0 pe
		int j = s.length()-1; //last m rakh diya j
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) { //string ka ith character and jth character domno mismatch kar gya...
//				toh palindrome nahi hai
				return false;
			}
			i++;
			j--;
		}
		return true; //agr pura loop chal toh mtlb palindrome tha
	}
}
