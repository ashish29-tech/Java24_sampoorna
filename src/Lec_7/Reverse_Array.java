package Lec_7;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Is array ko Reverse karna hai means original array m change karna hai...
//		Array given hai isme change karna hai taki wo reverse ho jaye
//		EK line hai use ulta karna hai...dusri line nahi bnani hai...
//		Ek tarik ho sakta tha ki new array le lete and ek-ek kar ke peeche se data isme dal dete..but ye nai karna
		
//		first ko last element se swap...2nd ko 2nd last se...this is called two pointer approach
//		i and j ko first and last element pe rakh denge respectively and then swap and move i forward and j ko backward and jha i and j mil gaye waha ruk jayenge
//		loop tab tak chalayenge jab tak i<j...i chota hai j se...and jaise hi cross kar jaye ya ek hi jgah aa jaye toh chor denge cuz ek hi element bacha hai use swap nai karenge
		int[] arr = {10, 20, 30, 4, 7};
		Reverse(arr); //reverse method call
//		upar reverse method call ke baad print kara toh reverse print ho
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Reverse(int [] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
//			2 index ki value swap ke liye 3rd variable chah9 
			int temp = arr[i]; //i ko temp m yaad kar liya
			arr[i] = arr[j];
			arr[j] = temp;
			i++; //i ko aage badhayenge
			j--;
		}
	}

}
