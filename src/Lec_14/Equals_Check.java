package Lec_14;

public class Equals_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Hello");
//		System.out.println(s1==s2);
//		Dono string ka content compare ho...
//		System.out.println(s1.equals(s2)); //we'll use equals method..to compate strings ke content ko
		System.out.println(isequal(s1,s2));
	}
//	interview m they can ask khud ka method likh ke check karo ki 2 strings equal hai ya nahi
	public static boolean isequal(String s1, String s2) {
//		complexity kam rahe aur check bhi ho jaye iske liye ham loop avoid kar rahe hai
//		dono string ka agr address same hai toh string bhi same hoga
		if(s1 == s2) { //address check kiya. Iski time complexity O(1)
			return true;
		}
//		agr length alag-alag hui 2 strings ki toh content kabhi same nahi hoga
		if(s1.length()!=s2.length()) { //length check. Iski time complexity O(1)
			return false;
		}
//		address alag-alag hai and length same hai...toh kisi bhi string pe loop laga do...
		for(int i = 0; i < s1.length(); i++) { //iski time complexity...O(n)
//			har character ko match kar ke check karenge...0 pe 0...1 ko 1 se etc
//			agr mismatch kar gya
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false; 
			}
		}
//		agr upar loop chal gya toh mtlb sara charavter match kar gya toh true return
		return true;
	}
}
