package Arrays_Assinmt;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //array input le lete hai
		int [] arr = new int [n]; //array bna lete hai
		for(int i = 0; i<arr.length; i++) { //1,2,3,4,5 le lenge
			arr[i] = sc.nextInt();
		}
//		now q kitna baar perform karna hai uska loop
		int q = sc.nextInt(); //q input le liya
		while(q-- > 0) { //q times chalega....post decrement... pehle condition check hoga...uske baad q ki value kam hogi
			int x = sc.nextInt(); //x input lena hai uske liye calculate karna hai
//			now is x ke liye array modify karna hai...
			int [] b = new int [n]; // new array bna denge same size ka...
			for(int i = 0; i<b.length; i++) {
//				i-x kiya and ye <0 means -ve aa gya toh...array ka length add karna hai
//				anticlockwise m -2 jana hai toh..plus karenge array ka length toh mtlb clockwise m 3 jana hai..
				int idx = i-x; // 0-2(x) = -2 .... -2 + 5(array ki length) = 3...toh 3rd wala hi toh index mil rha hai...
				if(idx<0) { //-ve ho gya toh array ka length add kar denge
//					array ka length add kar denge
					idx+=n; 
				}
//				b pe rakh denge...
//				for i = 1...i-x means 1 - 2 = -1 isme + 5 add karenge...toh 4 aya...so 1st index and 4th index....2 + 5 = 7
				b[i] = arr[i] + arr[idx]; //isse pura array modify ho jayega...
			}
			arr = b; //ab ye main array ban jayega..
		}
//		bhr niklenge toh sum nikalna hai...array pe loop lagayenge
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum%100000007);
	}

}
