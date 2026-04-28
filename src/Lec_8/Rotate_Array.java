package Lec_8;

public class Rotate_Array {
// 	Time complexity...Outer loop(while) = k times....Inner(for) loop = n times...Total: n × k.....Final Answer: O(n × k)
//	Tumhare Case me Intuition...Har rotation me poora array shift ho raha hai...Aur ye k baar ho raha hai
//	Isliye: O(n × k)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3; //Number of rotations (right shift by 3 steps).
		Rotate(arr, k); //calls the function
//		isse first rotation ayega... Prints the rotated array.
//		Iska kaam sirf array print karna ha
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); //1st rotation ayega
		}
	}
	public static void Rotate(int[] arr, int k) {
		//sabse pehle array ka length nikal lete hai
//		arr.length = 7 so...n = 7......Baar-baar arr.length likhne se acha ek variable use kar rahe hai
		int n = arr.length; //Stores the size of the array.
//		If k = 10 and n = 7...k = 10 % 7 = 3...
//		3 % 7 = 3 ✔️......Agar k chhota hai → same rahega...Agar k bada hai → reduce ho jayega
		k = k%n; //cycle remove ke liye ......If k is larger than array size, we reduce unnecessary rotations.
//		kth rotation ke liye
		while(k>0) { //Each iteration = rotate array by 1 step (right)
		
		//sabse pehle 1st rotation ki baat karte hai
//			Store last element (because it will be overwritten)
//			n = 7 → n-1 = 6.......Last index = 6
//			arr[n - 1] = arr[6] = 7.......item = 7......6 index hai....7 value hai
		int item = arr[n-1]; //yaad kar liya.... last index n-1 hai
//		n-2 se loop chal denge
//		Move each element one step to the right. Start from second-last index.
		for(int i = n-2; i>=0; i--) { //n =7 hai toh loop n-2 means 5...Loop chalega: i = 5, 4, 3, 2, 1, 0
//			Iteration 1 m: i = 5...arr[6] = arr[5]...→ 7 ki jagah 6 aa gaya....[1 2 3 4 5 6 6]
			arr[i+1] = arr[i]; //arr of i+1 pe i rakh denge...
			
		}
		arr[0] = item; //Put last element at front. 
		k--;
	}
}

}
