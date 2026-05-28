package Lec_9;

public class Maximum_Subarray {
// https://leetcode.com/problems/maximum-subarray/description/ 
//	Output: 6
//	Here we are using 2 for loop so when we submit this in leetcode it will show TLE.
//	So we will be using Kadane's Algorithm. Which solves in O(n).
	
//	Brute force approach
//	The maximum sum 6 comes from: [4, -1, 2, 1]
//	4 + (-1) + 2 + 1 = 6
//	Time Complexity: Your approach checks all possible subarrays: O(n²) cuz outer loop → n...inner loop → n
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSum(arr));
	}
	public static int MaximumSum(int [] arr) {
		 
		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0; //jab jab i change hoga tab tab i ko ham 0 se start karenge
			for(int j = i; j<arr.length; j++) {
				sum = sum + arr[j]; //sum m add kar diya arr[j]
				ans = Math.max(ans, sum ); //jo max hoga dono ka use ans m dal denge
			}
		}
		return ans;
	}

}
