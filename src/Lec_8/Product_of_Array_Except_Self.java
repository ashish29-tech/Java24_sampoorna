package Lec_8;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
//		System.out.println(Product(arr)); //ye address print karega
//		return type array hai
		int[] a = Product(arr); //is address ko capture kar liye a variable m
//		now address pe loop laga diya
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
//	array return karna hai...integer ka 1D array return kar rahe hai
	public static int [] Product(int [] arr) {
		int n = arr.length; // arr ka length nikal liya
		int [] left = new int[n];
		int [] right = new int[n];
		left[0] = 1; //left ke 0th index pe 1 rakh diya
//		left build kar rahe
		for(int i = 1; i<n; i++) {
			left[i] = left[i-1] * arr[i-1]; //
		}
		right[n-1] = 1;
//		n-2 se chalega loop
		for(int i = n-2; i>=0; i--) {
			right[i] = right [i+1] * arr[i+1];
		}
//		left and right build ho gya now kisi bhi left, right, ya main array m update kar sakte hai
//		Here we are updating in left array
		for(int i = 0; i<n; i++) {
			left[i] = left[i] * right[i];
			
		}
		return left; //left array return karna hai cuz left m changes kiya hai hamne
	}

}
