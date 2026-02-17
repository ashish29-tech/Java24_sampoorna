package Lec_4;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 60;
		int divisor = 36;
//		while(dividend % divisor != 0) {
//			int rem = dividend % divisor; //remainder nikala
//			dividend = divisor ; //dividend update....
//			divisor = rem;
//		}
		for(; dividend % divisor != 0;) {
			int rem = dividend % divisor; //remainder nikala
			dividend = divisor ; //dividend update....
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
