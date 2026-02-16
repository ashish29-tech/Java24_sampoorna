package Lec_4;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//starting ke 2 terms pta hone chahiye...0 and 1
		//aage ke series peeche ke dono nums ko plus kar ke
		// 0 and 1...then 0 1 1 2 3 5 8 13 21 34 55 89 ......
		//har fib no. ki indexing ki gai hai
		//if n = 10 diya kisine toh we need to print 55
		//Yha hame nth fib number print karna hai
		//0th index pe a hai and 1st index pe b hai and we need to shift a and b
		//0 1 1 2 3 5 8 13 21 34 55 89.... 0th a hai, 1st b hai, 2nd c hai..
		//c = a + b nikal lenge...
		//
		
		int n = 6;
		int a = 0;
		int b = 1;
		for(int i = 1; i<=n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println(a);
	}

}
