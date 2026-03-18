package Lec_7;

import java.util.Scanner;

public class Input_and_Display_Array {
//	Display(arr) → address pass karta hai
//	Display(int[] arr) → us address ko receive karta hai
//	Dono variables alag hain but same array ko refer karte hain

	public static void main(String[] args) { //this is the starting point...JVM starts execution from here...
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Creates an object sc of Scanner class.
		int n = sc.nextInt(); // array ka size input liyaa and Stores it in variable n
//		Creates an integer array of size n. Memory is allocated in heap. All elements are initially 0 (default value).
		int[] arr = new int[n];
//		Loop runs from 0 to n-1
		for (int i = 0; i < arr.length; i++) { // har ek bucket pe user se input leke rakha
//			first time m arr[0] pe input lo aur rakh do....ye heap memomry m jayega
//			Takes input from user. Stores it in arr[i]....
			arr[i] = sc.nextInt(); //har ek index pe user se input lake rakh do
		}
		Display(arr); //Passes the array arr as argument. Yaha array ka reference (address) pass hota hai, not the actual array copy.
	}
//	A method that takes an integer array as input.
//	Yaha ek naya variable arr banta hai (Display method me)...Ye bhi same address store karta hai
	public static void Display(int [] arr) { //int arr pass kar diya
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
