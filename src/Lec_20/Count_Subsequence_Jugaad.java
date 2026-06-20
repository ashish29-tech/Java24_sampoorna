package Lec_20;

public class Count_Subsequence_Jugaad {
// count karna hai subsequence
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Print(s, "");
//		jitni baar base case hit kiya hoga utni baar static variable badha hoga...count ko print kar do.
//		8 baar base case hit karega toh 8 baar static variable badhega...
		System.out.println("\n" + count); // forward slash n se line change hua uske baad print hua..."\n" + karne se 8 niche line m aa jayega...Sysoln se better hai ye
	}
//	count karne ka jugaad...
//	static variable le lete hai...ye global variable hota hai..sare function m cover karta hai..
	static int count = 0;
	public static void Print(String ques, String ans) {
//		count karne ka jugaad...jitni baar base case hit utni hi baar ans banega...base case 8 baar hit kiya toh 8 baar ans banega...
		if(ques.length()==0) {
			System.out.print(ans + " "); //sare ans ek hi line m print ho iske liye + " " and ln hta diya
//			jitna baar base case hit karega utni baar static variable ki help se count++
			count++;
			return;
		}
		char ch = ques.charAt(0);
		Print(ques.substring(1), ans);
		Print(ques.substring(1), ans + ch);
	}

}
