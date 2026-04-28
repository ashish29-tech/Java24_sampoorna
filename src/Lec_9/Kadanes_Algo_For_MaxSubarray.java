package Lec_9;

public class Kadanes_Algo_For_MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSum(arr));
	}
//	Declares a method that takes an integer array and returns an integer (the maximum subarray sum).
	public static int MaximumSum(int[] arr) {
//		Initialized to smallest possible integer to handle all-negative arrays.
		int ans = Integer.MIN_VALUE; //ans -> stores the maximum sum found so far
		int sum = 0; //stores the current subarray sum
		for(int i = 0; i < arr.length; i++) { //Traverse each element of the array.
//			i = 0....// 0 + (-2) = -2....then i = 1....sum = 0 + 1 = 1
			sum = sum + arr[i]; //Add current element to the running sum (current subarray).
			ans = Math.max(ans, sum); //First store the result...now compare...ans = max(-2147483648, -2) = -2....ans = max(-2, 1) = 1
//			Then reset...sum negative hai → reset:
			if(sum<0) { //if overall sum negative ho gya toh uske aage subarray ka start point...
//				jab-jab subarray ka start point change hoga tab tab sum ko 0 
				sum = 0;
				
			}
		}
		return ans; 
	}

}
// At every index, you ask:
//“Should I extend the previous subarray, or start fresh from here?”
// If your current sum becomes negative, it will only hurt future sums...❌ So you drop it
//If it's positive, it can help future elements...✔️ So you continue
// Kadane formula: currSum = max(num, currSum + num)
// Your version: 
//	sum += arr[i];
//	if(sum < 0) sum = 0;
