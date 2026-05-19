package Lec_14;

import java.util.Arrays;

public class Reverse_Words_in_a_String {
//	Leetcode...https://leetcode.com/problems/reverse-words-in-a-string/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Aage piche ka space kaise hataye...and phir sentence 
//		ko reverse karna hai and beech ka extra space bhi hatana hai
		String s = "    the sky    is blue   ";
		System.out.println(Reverse_Words(s));
	}
//	return type string hi rakhte hai
	public static String Reverse_Words(String s) {
//		Sabse pehle aage-piche ka space hatana hai toh uske liye java m trim method hota hai
		s = s.trim(); // aage piche ka space hata dega
//		We have split method in java which converts sentence into array...string array m
		String [] arr = s.split(" +"); // space ke basis pe split karna hai. 1 ya 1 se jyada ke basis pe slplit karna ho toh... + lga denge
//		System.out.println(Arrays.toString(arr)); //arrays ko print karne ka ek aur tarika hota hai...
//		ek string wala answer bna lenge...
		String ans = "";
//		array m piche se loop laga denge
		for(int i = arr.length-1; i>=0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans;
	}
}
