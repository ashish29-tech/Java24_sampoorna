package Lec_18;

public class Factorial_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}
//	recursion se hame n! chahiye so we'll tell recursion to give us n-1! 
	public static int fact(int n) {
//		Base case
		if(n==0) {
			return 1; 
		}
//		yahi recursion hai ki apne aap ko call kar rahe hai
//		Ye head recursion cuz last statement recursive call ke baad bhi niche kaam ho rha hai toh head recursion
		int fn = fact(n-1); //recursion n-1 factorial lake dede...yahi toh hamari small problem hai...
//		agr lake de dega toh
		return fn*n; //return kar denge multiply n kar ke...
	}

}
