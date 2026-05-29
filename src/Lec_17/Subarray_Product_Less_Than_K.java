package Lec_17;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 2, 1};
		int k = 10;
		System.out.println(Count_SubArray(arr, k));
	}
	public static int Count_SubArray(int [] arr, int k) { //array given hai and k sath m given hai
		int p = 1; //product ki value 1 li beginning m cuz 0 lenge toh product 0 ho jayega...
		int ans = 0;
		int si=0, ei=0; //start and end 0th index pe hai...
		while(ei<arr.length) {
			//grow
			p= p*arr[ei];
			//shrink
//			window ka start point end index se aage nahi nikalna chahiye
//			1,2,3 ke case m 1>=0 hai ? yess...shrink karenge toh jise add kiya hai use hi bahar karenge...1/1=1
//			end should always greater than or equal to start hona chahiye...start aage nahi nikalna chahiye
			while(p>=k && si<=ei) { //product ki value greater than = k hai tab tak loop chale
				p = p/arr[si];//starting point ko bahar karna hai
				si++; //start ko aage badha diya...1,2,3 ke case m 1st index pe aa gya si
			}
			//ans calculate
//			sare window ka sum nikalna hai...kitne sare ban pa rahe hai...
			ans = ans + (ei-si + 1);//ex: si= 12 hai and ei=19 hai toh window size 8 hoga...19-12+1=8
			ei++;
		}
		return ans;
	}
}
