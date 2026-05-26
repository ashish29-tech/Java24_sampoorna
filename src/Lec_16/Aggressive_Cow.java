package Lec_16;

import java.util.*;

public class Aggressive_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://www.spoj.com/problems/AGGRCOW/
//		Binary Search optimised solution
//		Linear search se O(N)^2 ayega

		Scanner sc = new Scanner(System.in);
//		question m t test cases hai toh uske liye t input lenge...loop chala denge t times
		int t = sc.nextInt();
		while(t>0) { 
		int nos = sc.nextInt();//number of stall...n
		int noc = sc.nextInt();//number of cows...c
		int [] stall = new int[nos]; //stall wala array bna liya
//		input le liya stall wale array ka...
		for(int i = 0; i<stall.length; i++) {
			stall[i] = sc.nextInt();
		}
//		user input baad m le lenge abhi array leke ke kara rahe hai sir
//		int[] stall = { 1, 2, 4, 9 };
//		int noc = 3;
		Arrays.sort(stall);//array sort ho jayega
		System.out.println(Largest_minimum(stall,noc));
		t--;
		}
	} 
//	 Hame largest min distance nikalna hai
	public static int Largest_minimum(int [] stall, int noc) {
		int lo = 0;
//		upar array sort kar liya tha toh array aise ho jayega 1,2,4,8,9
//		last index - first index.... 9-1 = 8
		int hi = stall[stall.length-1]-stall[0]; //stall.length se array ki length and -1 karenge toh last index ki value aa jayegi...and -stall[0] se 0th index
		int ans = 0;
//		3<=3 pe chal jayega
		while(lo<=hi) { //jab tak ye condition thik hai tab tak chalega loop
//			first time mid nikalenge 0+8/2 = 4, 2nd time lo 0 pe hai and hi 3 pe hai...toh 0+3/2 = 1
//			3rd time m lo 2 and hi 3...toh 2+3/2 = 2...
//			2 ke beyond check karna hai toh mid ko aage kiya and now lo and hi both are at 3....3+3/2 = 3
//			3 ke beyond hoga toh lo bada ho gya hi se toh upar while wali condition nahi chalegi...toh niche return ans ho jayega jisme 3 rakha hua hai...
			int mid = lo+hi/2; //mid nikal liya
//			first time m mid 4 aya toh...mtlb 3 cows ko 4 ke gap/separation pe bitha sakte hai ? no. Toh niche else chalega and hi..mid-1 pe chale jayega
//			2nd time m 1 aya mid toh 1 ke gap/separation pe bitha lenge....
//			and 1 ke gap m bitha sakte hai but hame gap increase karna hai toh mid+1 kar denge...
//			3rd time m...2 aya mid toh 2 ke liye bhi possible hai...but maximize karna hai toh 2 ke beyond bhi check karenge...toh lo and hi dono 3 pe honge
			if(isitpossible(stall,noc,mid)==true) { //stall, no of cows, distance ke liye cows ko bitha payenge...
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;//jo bhi ans m hoga use return kar diya
	}
	public static boolean isitpossible(int[] stall, int noc, int mid) { //stall wala array, noc, mid given hai...
//		first time jab upar nikala toh noc 3 and mid 4 aya tha
		int cow = 1;
		int pos = stall[0]; //1st cow ko stall 0 pe bitha diya
//		1st cow ko 0 pe bitha diya toh loop 1 se lagayenge cuz usme ab check karna hai ki baki ki 2 cows kaise baithengi
		for(int i =1; i<stall.length; i++) {
//			is index/stall pe tabhi baithegi cow jab iska distance greater than or equal to mid ho....
			if(stall[i]-pos>=mid) {
				cow++; //cow ko bitha denge
				pos = stall[i]; //and position yaad kar lenge..
			}
			if(cow==noc) { //upar cow++ kiya but agr cow given noc se jyada ho gayi toh wahi se return
				return true;
			}
		}
		 return false;
		
	}
}
