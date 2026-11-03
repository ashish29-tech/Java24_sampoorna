package Lec_6;

import java.util.Scanner;

public class Inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Inverse(n)); //jo bhi sum aya use yha print kar lenge
	}
	//Ek method bnayenge...iska return type...int, void kuch bhi rakh do fark nai padega
	public static int Inverse(int n) {
		int sum = 0; //sum = 0 — yahan hum inverse number banayenge.
		int pos = 1; //pos = 1 — original number ki positions ko right side se count karna shuru karenge.
		while(n>0) { //jab tak number 0 na ho tab tak 
//			suppose n = 2143
//			% 10 se last digit milta hai
//			2143 % 10 = 3 ..... so rem = 3
			int rem = n % 10; //sabse pehle remiander nikal lenge
			//upar remainder nikalne ke baad aage ki 2 lines ko kaise bhi aage-piche kar ke likh sakte hai but pos++ wali change nai hogi
			//ab jo bhi sum tha us sum m 
			// sum + position * 10 to the power remainder -1
//			sum = (int) (0 + 1 * Math.pow(10, 3-1));
//			sum = (int) (0 + 1 * Math.pow(10, 2));
//			sum = (int) (0 + 1 * 100.0);
//			sum = 100;
			sum = (int) (sum + pos * Math.pow(10, rem-1)); //typecasting karna padega cuz power double type ka hota hai
			n = n/10; //2143/10 = 214. And now n = 214
			pos++;
		}
		return sum; //jo bhi aya use return kar denge
	}

}
