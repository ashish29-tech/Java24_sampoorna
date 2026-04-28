package Lec_4;

public class Prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		int i = 2; //divisor. Why 2 ? bcoz 2 is the smallest prime number.
//		while(n>1) {
		while(i<=n) {
			if(n%i == 0) { //Is i a factor of n ? if n%i==o then i is a factor
				System.out.println(i); //378%2 = 0 so 2 is a facor and we'll print 2
				n = n / i; //378/2 = 189....reduce the number
			}
			else {
				i++; //if i is not a factor then we try the next number.
			}
		}
	}

}
