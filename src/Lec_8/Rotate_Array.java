package Lec_8;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		Rotate(arr, k);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); //1st rotation ayega
		}
	}
	public static void Rotate(int[]arr, int k) {
		//sabse pehle array ka length nikal lete hai
		int n = arr.length;
		k = k%n; //cycle remove ke liye ......
//		kth rotation ke liye
		while(k>0) {
		
		//sabse pehle 1st rotation ki baat karte hai
		int item = arr[n-1];
//		n-2 se loop chal denge
		for(int i = n-2; i>=0; i--) { //
			arr[i+1] = arr[i]; //i+1 pe i rakh denge...
			
		}
		arr[0] = item;
		k--;
	}
}

}
