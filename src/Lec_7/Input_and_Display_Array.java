package Lec_7;

import java.util.Scanner;

public class Input_and_Display_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // array ka size input liyaa
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) { // har ek bucket pe user se input leke rakha
			arr[i] = sc.nextInt(); //har ek index pe user se input lake rakh do
		}
		Display(arr);
	}
	public static void Display(int [] arr) { //int arr pass kar diya
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
