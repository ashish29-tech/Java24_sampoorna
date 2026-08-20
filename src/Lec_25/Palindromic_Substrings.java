package Lec_25;

public class Palindromic_Substrings {
//	leetcode: https://leetcode.com/problems/palindromic-substrings/
//	isme sare palindromic substrings count karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naan";
		System.out.println(Count_Palindromic(s));
	}
	public static int Count_Palindromic(String s) {
//		odd ka code likhna hai
		int odd = 0;
//		1st loop axis ka 
		for(int axis = 0; axis<s.length(); axis++) {
//			2nd loop orbit ka
//			orbit 0 se start hoga and ye range se bahar gya toh loop nai chalega
			for(int orbit = 0; axis-orbit>=0 && axis + orbit<s.length(); orbit++) {
//				agr character match nai kiya axis-orbit ka axis + orbit se toh inner for loop ko break karo
				if(s.charAt(axis-orbit)!= s.charAt(axis+orbit)) { //agr match nai kiya
					break; //inner for loop ko break kar do
				}
				odd++; //match kar gya toh odd++
			}
		}
//		even
//		ek baar m 2 length ki substring generate karni hai
//		odd jaisa hi code hoga bss initialisation change karna hai hame....o.5 pe axis, then 1.5 then 2.5
		int even = 0;
		for(double axis = 0.5; axis< s.length(); axis++) { //double jaisi value ho gayi
			for(double orbit = 0.5; axis-orbit >= 0 && axis + orbit <s.length(); orbit++) {
				if(s.charAt((int) (axis-orbit))!=s.charAt((int) (axis+orbit))) { //index integer hota hai toh yha typecasting kar denge...dono ke difference ko integer ke form m likhenge
					break;
				}
				even++;
			}
		}
		return odd + even;
	}
}
