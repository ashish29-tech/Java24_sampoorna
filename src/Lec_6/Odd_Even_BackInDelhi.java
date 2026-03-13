package Lec_6;

import java.util.Scanner;

public class Odd_Even_BackInDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //2 yha aa jayga
//		n no. of cars ke liye karna hai toh..
		while(n>0) { //neeche n-- kiya toh yha 1 aya and 2nd input ke liye calulate hoga answer then dobar n-- hoga toh n 0 ho jayega and loop nahi chalega
//			pehle 1 input ayeaga
			int car_no = sc.nextInt(); //har baar car number input lenge.
//			then 1 input ke liye answer calculate hoga
			Odd_and_Even(car_no);
			n--; //n-- kiya toh n ki value 1 ho jayegi t
		}
		
		
	}
//	function ka return type void bna diya yahi return kar denge
	public static void Odd_and_Even(int n) {
		int oddsum = 0;
		int evensum = 0;
//		pehle reminder nikalenge and check karenge ki odd hai ya even hai
		while(n>0) {
			int rem = n%10;
			if(rem%2==0) {
				evensum+=rem; //rem 0 hai toh even sum m add kar do
			}
			else {
				oddsum+=rem; //else odd m add
			}
			n=n/10;
		}
		if(evensum%4==0 || oddsum%3==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
