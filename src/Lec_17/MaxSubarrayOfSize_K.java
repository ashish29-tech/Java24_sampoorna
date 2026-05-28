package Lec_17;

public class MaxSubarrayOfSize_K {
//	This solution is privided by ChatGPT.
//	Brute force approach
//	k size ke subarray ka sum nikalna hai jo maximum ho.
//	17....Maximum subarray of size 3 is: [4,6,7]
//	Time Complexity: Outer loop runs ≈ n times...Inner loop runs k times
//	so overall: O(n * k)
//	This can be optimized to O(n) using Sliding Window.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = {2,3,1,4,5,4,6,7,2,1,3};
		int k = 3;

		System.out.println(MaxSum(arr, k));
	}

	public static int MaxSum(int[] arr, int k) {

		int ans = Integer.MIN_VALUE;

		// starting point of subarray
		for(int i = 0; i <= arr.length - k; i++) {

			int sum = 0;

			// exactly k elements add karenge
			for(int j = i; j < i + k; j++) {

				sum = sum + arr[j];
			}

			ans = Math.max(ans, sum);
		}

		return ans;
	}

}
