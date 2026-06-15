package Lec_19;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fib(n));
	}	
	public static int fib(int n) {
//		Base case
		if(n==0 || n==1) {
			return n; //if 0 hai toh 0 hoga ans and 1 hai toh 1 hoga ans
		}
		
//		Recursion hame n-1 and n-2 lake dede toh we'll just add these two to get nth fibo.
//		Recursive tree bnayenge...jitni choice utne calls. Yha 2 choice hai n-1 and n-2 ke liye..
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		return f1+f2;
	}
}
