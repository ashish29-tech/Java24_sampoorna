package Lec_26;

public class Power_Log_N {
//	Lec-18 m power wala question O(n) tc m kiya tha use log (n) time m karna hai...
//	log (n) ata kab hai tc ? 
//	Jab har recursive step mein problem/input size ko approximately HALF kar dete ho, tab usually O(log n) ata hai
//	Suppose 3^8 nikalna hai toh we'll tell recursion to give us 3^4 and we'll multiply the same and if n is odd(3^9) thne 
//	recursion gives us 3^4 and we'll multiply the same and multiply by 3....means 3^4 * 3^4 * 3 = 3^9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;
		System.out.println(pow(a,n));
	}
	public static int pow(int a, int n) {
//		base case
		if(n==0) {
			return 1;
		}
//		har recursive call mein n ko n/2 kar rahe ho, isliye time complexity O(log n) hai.
//		n ko half kar rahe hai. so...pow(3,4)...pow(3,2)...pow(3,1)...pow(3,0)....Jab n == 0 hota hai: toh upar return 1 cuz base case hits
//		Ab recursion wapas aana start karega aur har level par: ans = ans * ans; karega
		int ans = pow(a, n/2);//recursion bhai n/2 lake de...
		ans = ans*ans; //jo recursion lake dega wo ans m hoga toh usme ham ans multiply kar denge 
		if(n%2==1) { //agr n odd hai toh
			ans*=a; //toh a alag se multiply karenge
		}
		return ans;
	}
}

//Complete Call Stack Dry Run

//CALLING DOWN
//↓
//
//pow(3,4)
//│
//│ n/2
//↓
//pow(3,2)
//│
//│ n/2
//↓
//pow(3,1)
//│
//│ n/2
//↓
//pow(3,0)
//│
//│ BASE CASE
//↓
//1
//│
//│ RETURNING UP
//↓
//pow(3,1)
//│
//│ ans = 1
//│ ans = 1*1 = 1
//│ odd → ans = 1*3 = 3
//↓
//3
//│
//↓
//pow(3,2)
//│
//│ ans = 3
//│ ans = 3*3 = 9
//│ even → nothing
//↓
//9
//│
//↓
//pow(3,4)
//│
//│ ans = 9
//│ ans = 9*9 = 81
//│ even → nothing
//↓
//81

