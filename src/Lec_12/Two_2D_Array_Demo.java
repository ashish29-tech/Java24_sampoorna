package Lec_12;

public class Two_2D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int [3][4]; //define karna padega kitne row and column wala bnau. 3 row and 4 column
//		System.out.println(arr[0]); //ye 1D array ayega. Java default me reference (address-like value) print karta hai, not contents
//		System.out.println(arr); //ye 2D array ayega...Ye 2D array ka reference print karega
		System.out.println(arr[0][2]); //0th row 2 column ki value print hogi
		int [][] other = arr; //kya isse koi new 1D array banega ? array wahi hoga dekhne walw 2 honge... Ye 2D array ka reference print karega....arr → bhi same ko point karta hai
//		Address given hai array ka...var arr...row ka length and column ka length kaise nikalenge ?
//		System.out.println(arr.length); // row ka length arr.length kar ke niklega
//		System.out.println(arr[0].length); //column ki length
	}

}










