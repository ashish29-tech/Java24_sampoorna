package Lec_14;

public class String_Lexicographic_Order {
//	Time complexity O(n)...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2 string compare karna hai...lexicographically kon si string badi hai..or kon si choti hai
		String s1 = "komal";
		String s2 = "kunal";
//		dictionary m komal pehle ata hai toh komal choti string hai...kunal badi string hai... toh -ve ayegi
//		k and k dono m same hai toh...toh character 'o' - character 'u' inki ASCII value ka difference -6
//		System.out.println(s1.compareTo(s2)); // +ve hai toh s1>s2 and if -ve hai toh s1<s2 and if 0 then s1==s2
		
		String s3 = "raj";
		String s4 = "rajesh";
//		System.out.println(s4.compareTo(s3)); //jab ek string dusre string ke andar hoga toh s4 ki length - s3 ki length ayegi
//		System.out.println(s3.compareTo(s4)); //s4 ki length 6 and s3 ki length 3 toh -3 ayega
		
		System.out.println(compareTo(s1, s2));
		System.out.println(compareTo(s3, s4));
		System.out.println(compareTo(s4, s3));
	}
//		instead of using compareTo we'll make our own function to compare
//		+ve hai toh s1>s2 and if -ve hai toh s1<s2 and if 0 then s1==s2
//		if their are two strings suppose "Ankit" and "Ankita" ek ki length 5 hai and dusre ki 6....toh loop 5 wali pe lagayenge...
//		agr 5 wali ka pura character match kar gya..toh length ka difference...and agr match nahi kiya toh...difference pta chal jayega..kon si badi hai kon si choti..
		public static int compareTo(String s1, String s2) {
//			dono ki length mikalenge...sabse chota kon sa hai
			int n = Math.min(s1.length(), s2.length() ); //ankit and ankita m 5 and 6 length m se 5 aya..toh niche 5 pe loop chalega
//			ankit and ankita m upar difference 5 aya toh n m 5 hai toh loop 5 pe chalega...
			for(int i = 0; i< n; i++) { //s1 and s2 ka jo minimum length hai uspe loop chalega
//				ankit and ankita ke case m...a(0) match karega a(0) se...then 1 ko 1..2 ko 2 se..3 ko 3 se..4 ko 4 se...uske baad ye loop nahi chalega
				if(s1.charAt(i)!=s2.charAt(i)) { //s1 ka charAt(i) agr mismatch kar gya s2 ke charAt(i) se 
					return s1.charAt(i) - s2.charAt(i); //komal ka o - kunal ka u character ka difference return kar denge yahi se
					
				}
			}
//			loop se bhr ate hi...dono ke length ka difference
			return s1.length()-s2.length(); //ankit and ankita m 5 - 6.... -1 ayega...means ankit length choti hai...
		}
}
