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
		int sum = 0;
		int pos = 1;
		while(n>0) { //jab tak number 0 na ho tab tak 
			int rem = n % 10; //sabse pehle remiander nikal lenge
			//upar remainder nikalne ke baad aage ki 2 lines ko kaise bhi aage-piche kar ke likh sakte hai but pos++ wali change nai hogi
			//ab jo bhi sum tha us sum m 
			// sum + position * 10 to the power remainder -1
			sum = (int) (sum + pos * Math.pow(10, rem-1)); //typecasting karna padega cuz power double type ka hota hai
			n = n/10;
			pos++;
		}
		return sum; //jo bhi aya use return kar denge
	}

}
