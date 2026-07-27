package Lec_24;

public class Prime_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		System.out.println(isPrime(n));
	}
	public static boolean isPrime(int n) {
		int i = 2;
		while(i*i<=n) { //sqrt ka loop chala lete hai...jab bhi sqrt ka loop chalana hoga toh loop aise hi likhenge
			if(n%i==0) { //mod 0 ho gya toh prime no. nahi hai
				return false; //toh false
			}
			
			i++;
		}
//		loop se bahar nikal ke kahenge 
		return true;//If no divisor is found, return true.
	}
}
