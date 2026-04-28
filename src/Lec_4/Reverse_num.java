package Lec_4;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int rev = 0;
		
		while(n>0) {
			int rem = n % 10; //123 % 10 = 3
			rev = rev * 10 + rem; // 0 * 10 + 3 = 3
			n = n / 10;
		}
		System.out.println(rev);
	}

}
