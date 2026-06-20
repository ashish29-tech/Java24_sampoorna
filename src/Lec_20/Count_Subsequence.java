package Lec_20;

public class Count_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println("\n" + CountSubsequence(s, ""));
	}
//	int kar denge
	public static int CountSubsequence(String ques, String ans) { //ques/s m abc and ans hai blank
		if(ques.length()==0) {
			System.out.print(ans + " ");
			return 1; //jab jab base case hit hua hoga toh..ek subsequence bna hoga...toh return 1 kar denge....
		}
		char ch = ques.charAt(0); //isse sabse pehle a nikleag 
//		recursion bhai apna bta de...tere paas kya count aya...int x m aa jayega
		int x = CountSubsequence(ques.substring(1), ans);
//		int y m recursion bta de tere paas kitna count aya...
		int y = CountSubsequence(ques.substring(1), ans + ch);
		return x + y; //dono ka count add kar lenge...toh total count pta chal jayega
	}

}
