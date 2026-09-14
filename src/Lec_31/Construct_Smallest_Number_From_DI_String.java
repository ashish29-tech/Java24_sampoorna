package Lec_31;
import java.util.*;

public class Construct_Smallest_Number_From_DI_String {
// https://leetcode.com/problems/construct-smallest-number-from-di-string/description/
//	String ke form m no. ko return karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Smallest_Number_From_DI(s));
	}
//	return type string
//	pehle array bna lete hai baad m concatinate kar ke bhej denge string ke format m
	public static String Smallest_Number_From_DI(String s) {
//		ek array bna lete hai jitni string ki length hai
		int [] arr = new int[s.length() + 1]; //plus 1
//		Ex: IDDI hai toh last wale I se pehle hame DD dekhna hai toh...Last In First Out ka nature hame dikh rha hai isliye Stack lag gya yha
		Stack<Integer> st = new Stack<>(); //Ek Stack banaya. Isme hum D ke indices temporarily store karenge.
		int c = 1; //counter maintain kar liya numbers generate karne ke liye
//		loop string ke length tak lagega cuz string ke length tak jana hai
		for(int i = 0; i<= s.length(); i++) {
//			ab I ya D hai uske liye kaam karna padega
//			hame no. tabhi fill karna tha jab i length ke barabar hai...ya character uska I hai
//			yha deliberately ham stacks ka use karenge else ham ArrayList m data yaad, ya fir I ke baad 
//			reverse loop laga denge jab tak D mile tab tak kaam karna hai, ya stacks m index yaad kar lo..
//			reverse loop laga ke bhi kaam kar sakte the but stacks se kar rahe hai ham yha
			if(i == s.length() || s.charAt(i)=='I') {
				arr[i] = c; //current position par current smallest number dal diya
				c++;
//				agr koi D bacha hai toh uske liye kaam karna hai
//				Jab tak Stack empty nahi hai, uske elements nikaalte raho.
				
				while(!st.isEmpty()) { //isEmpty ne true diya and ! laga hai toh false de dega and vice versa
//					tab tak nikalo
					arr[st.pop()] = c; //stack se pop karenge toh index milega uske corresponding c ko rakho
					c++; //c ki value 1 se badhate chalo
				}
			}
			else {
//				D ka index Stack mein save kar diya.
				st.push(i); //3rd index pe D hai toh yaad kar lenge stack m
			}
		}
		String ans = ""; //empty string bnaya
//		Ek-ek element String mein add hoga
		for(int i = 0; i <arr.length; i++) {
			ans = ans + arr[i];
		}
		return ans; //123549876
	}
}
