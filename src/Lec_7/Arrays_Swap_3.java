package Lec_7;

public class Arrays_Swap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
//	We want to swap address of both arr...suppose arr bana hai 2k pe and other bna hai 4k pe...toh dono ke address ko swap karna chahte hai....
//		arr stores reference (address) of first array
		int [] arr = {3, 5, 1, 7, 8}; //suppose it's on 2k address
//		other stores reference of second array.
		int [] other = {31, 51, 11, 71, 81}; // it's on 4k address
		System.out.println(arr[0]+	" " + other[0]);
//		Important: Java passes arguments by value. For arrays, the reference value is copied and passed.
		Swap(arr, other);
		System.out.println(arr[0]+	" " + other[0]);
		
	}
	
//	2 reference variable/address m change kiya hai hamne...na ki 2 array ko interchange kar rahe yha
//	Actual change karna ho toh index by index karna hoga....jab tak heap m jake value change nai karenge tab tak nai dikhega
//	Method takes two array references as parameters. These are copies of original references.
	public static void Swap(int [] arr, int [] other) {
		int [] temp = arr;
		arr = other;
		other = temp;
	}
}

// Why actual swap doesn't happen bcoz...Java is pass-by-value.
//The method gets copies of references, not original variables.
//You only swapped local copies inside the method.
//Original arr and other in main() remain unchanged.
//In Java, you can modify the object through a reference, but you cannot change what the original reference points to from a method.



//But you can achieve swapping in a few correct ways.
//Method 1: Return swapped references (best approach)
//You return the swapped arrays and reassign them in main.

//public class Arrays_Swap_3 {
//
//	public static void main(String[] args) {
//
//		int[] arr = {3, 5, 1, 7, 8};
//		int[] other = {31, 51, 11, 71, 81};
//
//		System.out.println(arr[0] + " " + other[0]);
//
////		Passes references of both arrays. Method returns a 2D array (int[][]). result stores that returned value.
////		result[0] → first array reference
////		result[1] → second array reference
//		int[][] result = swap(arr, other);
////		arr now points to what result[0] holds
//		arr = result[0];
////		other now points to what result[1] holds
//		other = result[1];
//
//		System.out.println(arr[0] + " " + other[0]);
//	}
////	Method takes two array references (a and b). Returns a 2D array.
//	public static int[][] swap(int[] a, int[] b) {
////		Creates a new 2D array. Stores: b at index 0, a at index 1
////		So:result[0] = b, result[1] = a
//		return new int[][]{b, a};
//	}
//}












