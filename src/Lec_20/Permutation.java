package Lec_20;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc"; //abc ka permutation nikalna hai
		Print(ques, "");
	}

	public static void Print(String ques, String ans) { //ques m abc and ans m blank
		if(ques.length() == 0) {
			System.out.println(ans);
			return; 
		}
//		jitni ques ki length utni choice
		for(int i = 0; i<ques.length(); i++) { //first time ye i = 0 ke liye chalega
			char ch = ques.charAt(i); //character nikal liya...and ans m aa jayega a
//			string s1 
			String s1 = ques.substring(0,i); //sabse pehle 0,0
			String s2 = ques.substring(i+1); //1 se leke entire tak mtlb....bc
			Print(s1+s2, ans + ch); //ans m character ko call kar denge
		}
		
	}
}
