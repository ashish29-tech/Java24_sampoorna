package Arrays_Assinmt;

public class Maximum_Sum_Circular_Subarray {
//	https://leetcode.com/problems/maximum-sum-circular-subarray/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,-10,2,-7,11,-1,4};
		System.out.println(Maximum_Sum(arr));
	}
	public static int Maximum_Sum(int[]arr) {
//		sabse pehle linear array m max sum nikalenge using kadan's algo
		int linear_sum= kadanes(arr);
//		circular array m yahi nikalenge ki wo kon sa part hai beech ka jo sum ko minimum bna rha hai
//		jab pta chal jayega toh total array m se beech ka part subtract kar denge
//		beech wala part ke liye bhi kadane's apply karenge...beech wale part ka sum nikal lenge
//		pehle pure array ka sum nikal lenge...2,3,-10,2,-7,11,-1,4 = 4
//		now beech wala wo part nikalne hai jo sum min bna rha hai...
//		2,3,-10,2,-7,11,-1,4 is array ke sign ko invert kar denge...now jo min sum tha wo ab max sum ayega...
//		is inverted array pe kadane's lagayenge...toh jo part kadane's se min aa rha tha...ab wo max ayega...
//		10 -2 +7 = 15 ayega..actual m original araay ka -15 hota toh...
//		toh actual m kya karte total sum(4) m se -15 karte toh 19 ata...
//		so invert karne baad jo kadane's ayega usme 15 add kar denge...toh circular wala nikal jayega...
//		2= 3 = 5 and reverse karne baad 10 -2 +7 = 15 and 11 -1 +4 = 14...pehle beech wala part -15 tha... -10 + 2 -7 = -15
//		toh pehle -15(-10,2,-7) tha and ab reverse kar ke kadane's laga ke 15 positive ka toh utna hi plus kar diya 
//		toh 2 +3 = 5 and 11 -1 +4 = 14 bach gya toh 19 ho gya...
//		total sum m add kar denge invert kar ke kadane's kar ke jo aa rha hai use...
		
//		total array ka sum nikalte hai aur sath-sath invert bhi karte jate hai
		int total_sum = 0; 
		for(int i = 0; i<arr.length; i++) {
			total_sum+=arr[i]; //total sum m array of i ko add karte hai
//			jo bhi sign hoga use invert kar denge
			arr[i] = arr[i]*-1; //array of i ko multiply kar denge -1 se...+ve wala -ve ban jayega...-ve wala +ve ban jayega...
		}
//		inverted pe kadane's laga denge... mid wala sum nikal rahe hai
		int mid_sum = kadanes(arr);
		int Circular_sum = total_sum + mid_sum; //total sum + beech wala
//		yha case laga denge...cuz jab entire array -ve hota hai toh fail ho rha hai test case
//		[-3,-2,-3] is case m total sum = -8 and invert karenge toh +8 toh circular ka sum 0 aa rha hai.. and linear ka sum -2 aa rha hai...
//		if circular 0 hai toh entire array -ve hai...toh us case m linear wala ans hona chahiye
		if(Circular_sum==0) {
//			toh linear return karo us case m....dono m max mat lo us case m
			return linear_sum;
		}
		
		return Math.max(linear_sum, Circular_sum); //max of linear and circular ka sum return karenge
	}
//	kadane's algo
	public static int kadanes(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+= arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
	}
}
