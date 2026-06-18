package Lec_20;

import java.util.*;
public class Generate_Parentheses {
//	https://leetcode.com/problems/generate-parentheses/description/
//	Jab bhi bola jaye array ko print na kar ke list m bhar ke dijiye...toh yahi approach karna hai ki ArrayList bna lo...
//	bss left hand side m ArrayList ki jgah List likhna and jha variable capture karna hoga List naam ke variable m capture karna...baki sara arrayList
//	wala hi function chalana...ye kyo kar rahe hai iske bare m oops m padhenge...
//	Suppose ArrayList kahi 2k location m bna tha...first time ans bna string m toh arrayList m yaad kar liya gya...jab stack se uda toh
//	hamare paas arrayList ka address tha hi...toh jo add hua toh print kar ke dekh lenge
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
//		ArrayList ki jagah List likh ke chor denge...
		List<String> ll = new ArrayList<>(); //we'll read about it in oops but for now do this...
//		1D list m bharne ko bola hai question m toh ll ko yha pass kar denge...
		Parentheses(n,0,0,"", ll);
		System.out.println(ll);
	}
//	ek n ka track, ek open ka ek close ka and ek String chahiye ans bnane ke liye
	public static void Parentheses(int n, int open, int close, String ans, List<String>ll) { //yha capture bhi karna hoga ll ko
		if(open ==n && close==n) {
//			System.out.print(ans + " ");
//			add kar denge...add method hota hai arryList m add karne ke liye
			ll.add(ans); //
			return;
		}
//		jha count invalid generate ho rha hoga...
		if(open>n || close>open) { //open n se jyada nahi hona chahiye or close open se jyada nahi hona chahiye...
			return; //agr hai toh return kar ja
		}
		Parentheses(n, open+1, close, ans+"(", ll); //pehle open ka call lagaya toh..open ka count +1 and ans m open bracket
		Parentheses(n, open, close+1, ans+")", ll); // agr close ka kiya toh close m +1 and ans m close
		
		
		
		
//		ya toh function call pe condition dal denge ya phir ek step baad check kar lenge
	}
}
