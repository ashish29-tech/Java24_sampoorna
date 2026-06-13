package Lec_18;

public class Power {
//	a and n are given. a ki power n nikalni hai.
//	ek tarika...loop laga denge...a ko n times multiply kar denge baat ban jayegi...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3 ki power 4 nikalni hai..
		int a = 3;
		int n = 4;
		System.out.println(pow(a,n));
	}
	public static int pow(int a, int n) {
//		base case
		if(n==0) { //if n == 0 tab us case m kya hoti hai uski power...1
			return 1; 
		}
		
//		smaller problem
//		suppose 3^10 nikalni hai and koi 3*9 la ke dede toh toh we'll just multiply by 3 to get 3*10.
//		Ye bhi head recursion cuz recursive call ke baad bhi kaam ho rha hai toh head recursion.
		int power = pow(a, n-1); //recursion bhai a ki power n-1 la ke dede
		return power*a;
	}
}
