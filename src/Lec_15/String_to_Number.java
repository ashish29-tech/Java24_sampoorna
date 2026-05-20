package Lec_15;

public class String_to_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numeric string given hai...ise number m convert karna hai aur ye tab karenge jab string ki length 9 digit ki hogi
		String s = "5657897";
		int n = Integer.parseInt(s); //number wale string ko number m convert karne ke liye
		System.out.println(n);
//		agr string ki length 9 digit se upar hai toh
		String s1 = "565877878797897";
		long l = Long.parseLong(s1); //long m rakhenge
		System.out.println(l);
		System.out.println(Convert_Number(s)); //yha call kar diya....toh convert hoke mil jayeaga
	}
	
	public static int Convert_Number(String s) {
		int ans = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); //example 237. Pehle 2 aya 
//			sabse pehle 0 * 10 + (50-48) cuz 2 ki ASCII value 50 hoti hai.... toh 2 ayeaga...
//			then ans = 2 * 10 + 3(51-48) toh 23 
//			then ans = 23 * 10 + 7
			ans = ans * 10 + (s.charAt(i)-48); //0 ki ASCII value 48 hoti hai
		} 
		return ans;
	}
}
