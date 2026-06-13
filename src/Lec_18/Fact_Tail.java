package Lec_18;

public class Fact_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
//		System.out.println(fact(n)); ye head recursion ke liye
		System.out.println(fact(n, 1)); // ek aur variable maintain karenge...
	}

	public static int fact(int n, int ans) {

//		if (n == 0) {
//			return 1;
//		}
//		return n * fact(n-1); //pehle recursion layega fact(n-1) tab jake * n hoga toh ye head recursion hoga
//		return fact(n-1) * n; //abhi bhi head recursion hoga...

//		Tail recursion se karna hai...

		if (n == 0) {
			return ans; 
		}
		
		return fact(n - 1, ans * n);//multiply wala kaam andar kar rahe hai...
	}

}
