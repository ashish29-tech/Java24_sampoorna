package Lec_7;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arr variable (stack me) → uska reference store karta hai... arr=2k stack memory m
		int [] arr = {10, 20, 30, 4, 7}; //Heap memory me array banta hai → [10, 20, 30, 4, 7]
		System.out.println(arr[0]+ " " +arr[1]);
//		Yaha 3 cheeze pass ho rahi hain: reference (address) of array, index i and index j...2k, 0 and 1 pass hua
		Swap(arr, 0, 1); // 0 and 1 are treated here as an index. Jab bhi swap karna ho toh index chahiye hoga
		System.out.println(arr[0]+ " " +arr[1]);
	}
//	Parameters receive karte hain: arr → array ka reference (same array), i → 0, j → 1
	public static void Swap(int[] arr, int i, int j) { //arr m 2k aa gy and i m 0 and j m 1
		// TODO Auto-generated method stub
		int temp = arr[i]; //arr[0] ja rha hai temp m...means 10 ja rha hai
		arr[i] = arr[j]; // arr of j means 20 ko arr of i m bhej diya
		arr[j] = temp; //temp ko arr of 1 m dal do
	}

}
//	Yaha actual swap hua kyun?
//	Because Humne array ka reference pass kiya, Aur array ke elements directly modify kiye