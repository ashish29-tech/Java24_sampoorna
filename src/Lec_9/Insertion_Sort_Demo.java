package Lec_9;

import java.util.Iterator;

public class Insertion_Sort_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ek array diya hai jiske sare elements shi hai bss last element galat hai
//		toh last element ki kis tarike se arry m insert kare ki pura array sorted ho jaye
		int [] arr = {1, 2, 7, 8, 9, 11, 4};
		int idx = InsertLastElement(arr, arr.length-1);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(idx); //index bhi nazar ayega....
	}
	public static int InsertLastElement(int[]arr , int i) {
		int j = i-1; // last toh galat hi hai isliye i-1 se start karenge toh yaad kar lete hai j m
		int item = arr[i]; //jise thik karna hai use item m dal diya
		while(j>=0 && arr[j]>item) { //edge case handle kiya wrna -ve m jayega
			arr[j+1] = arr[j]; ///peeche bhej diya j ko 
			arr[j] = item; //j m item dal diya cuz chota hai
			j--;
		}
		return j+1; //taki pta chal jaye finally kon se index
	}

}
