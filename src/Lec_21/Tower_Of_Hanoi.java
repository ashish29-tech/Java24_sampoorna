package Lec_21;

public class Tower_Of_Hanoi {
//	https://leetcode.com/discuss/post/5272714/tower-of-hanoi-by-satvikmpatil-owd6/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "A";
		String help = "B";
		String des = "C";
		int n = 3;
		TOH(n, src, help, des);

	}

	public static void TOH(int n, String src, String help, String des) { // yha 3rd parameter des hai but
		if(n==0) { //if sara kaam ho gya hai
			return;
		}
		
//		n disc hai toh..staring ke n-1 disc ko recursion ko bolenge ki src se utha and help pe leja 
//		Starting ke n-1 ke liye destination B banega...
//		starting ke n-1 disc ko src se utha and helper pe leke jana hai toh 3rd patameter helper banega...
//		Source src, helper = des, Destination= help ........roles change ho gaye
//		sabse pehle call TOH(2,A,C,B) ye jayegi
		TOH(n - 1, src, des, help); // yha 3rd parameter helper ko bna denge....upar parameter m 3rd pe des hai but yha help ko bna denge
		System.out.println("Move " + n + "th disk from " + src + " to " + des); //hamara kaam last disk ke liye
//		ab src beech wala helper banega...in sabko direct destination pe phochana hai...
//		and src ke sahare sara kaam karna hai
//		ab jo remaining disk bach gya wo helper pe bacha hai
		TOH(n-1, help, src, des);

	}
}
