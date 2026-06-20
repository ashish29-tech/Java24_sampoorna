package Lec_20;

public class Permutation_2_Duplica {
//	Toh duplicate m ham karte hai ki jib bhi cell m hai uske aage agr same chiz hai toh uske aage ka call na jame de...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		isme duplicate aa rahe hai...duplicate rokna hai hame...
		String ques = "abca"; 
		Print(ques, "");
	}

	public static void Print(String ques, String ans) { //ques m abc and ans m blank
		if(ques.length() == 0) {
			System.out.println(ans);
			return; 
		}
//		jitni ques ki length utni choice
		for(int i = 0; i<ques.length(); i++) { //first time ye i = 0 ke liye chalega
//			har level pe jiska call laga rahe hai us index ke aage ke...i+1 se leke...pure string m same character nahi hona chahiye...tab call jaye
			char ch = ques.charAt(i); //character nikal liya...and ans m aa jayega a
//			tabhi chale jab..ques m jake..is character ko i se dhhundega....agr ye false aya tabhi chale wrna na chale
//			false ayega tabhi ye call lagega....
//			i bheja hai nice ye Is_Present function i+1 se check karega
//			If ham ith index pe hai toh...i+1 se entire string m agr wo character mile toh use rok do
			if(Is_Present(ques, ch, i) == false) { //false aye tabhi ye line chale
//			string s1 
			String s1 = ques.substring(0,i); //sabse pehle 0,0
			String s2 = ques.substring(i+1); //1 se leke entire tak mtlb....bc
			Print(s1+s2, ans + ch); //ans m character ko call kar denge
			}
		}
	}
	public static boolean Is_Present(String s, char ch, int idx) {
		for(int i = idx+1; i < s.length(); i++) { //i+1 se check karega...
		  if(s.charAt(i) == ch) {
			  return true;
		  }	
		}
	return false;
	}
}
