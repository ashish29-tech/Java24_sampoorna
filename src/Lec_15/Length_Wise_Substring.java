package Lec_15;

public class Length_Wise_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		PrintSubstring(s);
	}
	public static void PrintSubstring(String s) {
		for(int len = 1; len<=s.length(); len++) {
			for(int j = len; j<=s.length(); j++) {
				int i = j-len;
				System.out.println(s.substring(i,j));
			}
		}
	}

}
