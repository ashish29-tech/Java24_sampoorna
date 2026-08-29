package Lec_26;

public class Randomized_Quick_Sort {
// Quick Sort ka worst case tab hota hai jab partition har baar extremely unbalanced ho
//	— ek side n-1, doosri side 0.
// Isliye random element uthao har baar so that array ke distribution hone ke chances badh jaye and that's why iski tc average case m n log n.
	
//	sara code copy paste kiya hai quick sort wala lec-25 se....
	
//	Tumhare normal Quick Sort mein last element pivot tha.
//	Randomized version mein hum pehle random element ko last position par laate hain,
//	phir same old partition code chala dete hain.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);

	}

	public static int Partition(int[] arr, int si, int ei) {
//		ek random variable bnayenge
		Random rn = new Random();
//		ek random index generate karenge
//		isme bounce set karenge....ei-si+1 karte the but nahi karenge cuz hame si and ei-1 tak ke beech ka nikalna hai
//		cuz ei-1-si-1 karenge toh -1 apas m cut jayega...toh sirf ei-si likhenge and isme apna start add kar denge
//		rn.nextInt(x)..random integer deta hai: 0 se x-1. For example: rn.nextInt(5)...possible values:0, 1, 2, 3, 4.... 5 nahi aa sakta.

		int ii = rn.nextInt(ei-si)+si; //
//		last wale index se swap kar denge
		int t = arr[ei];
		arr[ei]= arr[ii];
		arr[ii] = t;
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;

	}

}
