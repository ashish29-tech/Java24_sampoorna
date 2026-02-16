package Lec_4;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime number: A number that has exactly 2 divisors: 1 and number itself
		//To check prime number: If there is any i exist between 2 to n-1 which
		//completly divide our number n and remainder gives 0... will be called non prime number
		//If there exists any integer i between 2 and n-1 such that n % i == 0, then n is NOT prime (it is composite).
		// n/2 tak bhi check kar sakte hai
		//2 to n-1 ke beech m count ki value 1 ya 1 se jyada aya toh not prime
		
		//while ke liye... int i = 2, while(i<n), i++
		
		//agr n =8 hai and first time m hi 8%2 hua toh 1 factor mil gya means aage not prime ho gya
		//toh jarurat nahi thi aage check karne ki toh jaise hi 1st time condition hit kare toh loop ko rokna hai.
		//iske liye we'll use break statement
		int n = 6;
		int count = 0;
		for(int i =2; i<n; i++) {
//		for(int i =2; i*i<=n; i++) { //this is optimized
			if(n%i == 0) { //6%2 ==0...toh 1 factor milega
				count++;//count ko increase kar denge
			}
		}
		if(count>=1) { //counut ki value greater than or equal to 1 hai toh
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}

}
