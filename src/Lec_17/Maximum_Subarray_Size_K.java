package Lec_17;

public class Maximum_Subarray_Size_K {
//	Sliding Window Algo/technique
//	Is this question of sliding window ?
//	Input m array and k given hai, output m subarrray ka sum andusme conditon hai ki wo max. hona chahiye,
//	Now y e fixed hai ya variable size ? subarray ka size fixed ha. Toh this will be called fixed size window.
//	If Sliding window is fixed then 1 hi tarika follow karna hai..
//	1st step: 1st window ka kaam, 2nd step: grow, shrink, ans calculate
	
//	Purana sum reuse karte hain. Instead of: 3+4+1
//	dubara calculate karne ke, hum bas: new element add karte hain, old element remove karte hain
//	Isliye complexity: O(n) ban jati hai instead of: O(n*k)
//	2 loop chal rahe hai upar wala k time and niche wala n--k time at the end linear time mana jayega
//	upar wala k time and niche wala (n - k) times toh... k + (n-k)... k + (n-k) = n so time complexity o(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 3, 4, 1, 2, 3, 7, 6, 8, 2, 3};
		int k = 3;
		System.out.println(MaximumSum(arr, k));
	}
	public static int MaximumSum(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
//		sabse pehle first window ka kaam karenge
//		starting ke K elements ka sum nikalna.... 2,3,4 = 9
//		k times chal rha ye loop
		for(int i = 0; i<k; i++) {
			sum+= arr[i]; //sum = sum + arr[i];
		} 
		ans = sum; //yahi sum ans ho jayega...abhi ke liye yahi ans hoga
//		ab remaining ke liye kaam karna hai
//		ye (n - k) times chal rha
		for(int i = k; i<arr.length; i++) { //k se start karna hai...k = 3...i = k toh i = 3
//			grow 
//			2nd time ke liye... i = 4, toh arr[4] m 2 hai...and sum m first time ke baad 8 aa gya toh 8 + 2 = 10
//			RIGHT side pe new element add kar rahi hai.
			sum += arr[i]; //arr[i] add kar diya... sum = sum + arr[i]...i m value 1 hai toh pehle 9 + 1 = 10 ho gya sum
//			shrink
//			first time m i =3, k =3; i-k means 3-3=0, arr[0] = 2 hai, sum = 10-2 = 8
//			2nd time m i-k = 4-3 = 1... sum = 10 - 3 = 7
//			Ye window ke LEFT wale old element ko hata rahi hai.
			sum -= arr[i-k]; // 
//			ans 
			ans = Math.max(ans, sum); //
		}
		return ans;
	}
}
