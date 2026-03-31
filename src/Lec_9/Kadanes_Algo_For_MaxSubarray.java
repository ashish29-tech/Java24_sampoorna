package Lec_9;

public class Kadanes_Algo_For_MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSum(arr));
	}
	public static int MaximumSum(int[] arr) {
		
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			ans = Math.max(ans, sum); //First store the result
//			Then reset
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
