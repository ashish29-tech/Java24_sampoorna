package Lec_4;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nomber wale questions m prefer while loop instead of for loop...cuz it's easy
		int dividend = 60;
		int divisor = 36;
		while(dividend % divisor != 0) { //jab tak 60 % 36... 0 nahi hota tab tak chale ye loop
			int rem = dividend % divisor; //remainder nikala.... 60 % 36 = 24
			dividend = divisor ; //dividend update....now 36 joki divisor tha ab dividend ban gya
			divisor = rem; // remainder 60 % 36 m...24 aya wo divisor ban gya
			//next time ke liye dividend 36 and divisor 24....then next time ke liye 24 and 12...ab remainder 0 aa jayega and divisor..joki hamara hcf hoga wo print ho jayega
		}
		//using for loop
//		for(; dividend % divisor != 0;) {
//			int rem = dividend % divisor; //remainder nikala
//			dividend = divisor ; //dividend update....
//			divisor = rem;
//		}
		System.out.println(divisor);
	}

}
