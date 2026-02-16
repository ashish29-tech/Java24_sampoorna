package Lec_4;

public class Check_prime_using_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int count = 0;
		for(int i =2; i<n; i++) {
			if(n%i == 0) {
				count++; //yha count ki value badhegi 6%2 hote hi toh niche break laga hai toh sidha niche jayega and print
				break; //count badhte hi break lga denge cuz we don't want it to run further
			}
			
		}
		if(count>=1) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
