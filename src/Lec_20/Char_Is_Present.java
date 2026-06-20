package Lec_20;

public class Char_Is_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		suppose is string m 4th index ke aage se a present hai ya nahi ye btana hai...hai toh true else false
		String s = "abababababsahjdsakhjakhja"; 
		System.out.println(Is_Present(s, 'a', 4)); //yha call kiya char ke naam pe and idx ke naam pe 4 bhej diya
	}
	public static boolean Is_Present(String s, char ch, int idx) {
//		4th index ke aage se loop laga denge...toh 5th index se 
		for(int i = idx+1; i<s.length(); i++) {
//			Agr present hai toh true
			if(s.charAt(i)==ch) {
				return true;
			}
		}
		return false;
	}
}
