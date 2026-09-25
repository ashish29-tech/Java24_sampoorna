package Lec_32;

import java.util.Stack;

public class Maximal_Rectangle {
// https://leetcode.com/problems/maximal-rectangle/description/
//	leetcode pe character matrix diya hai....integer ka nahi diya and 
//	input m bhej rahe hai string
//	array leke ate hai kahi se 0 and 1 wala...
//	Humein maximum area ka rectangle chahiye jisme sirf 1s hon.
//	Hum directly 2D rectangle nahi find karenge.
//	Instead, har row ko ek histogram ka base maanenge.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] [] matrix = { { '1', '0', '1', '0', '0' }, 	
							 { '1', '0', '1', '1', '1' }, 
							 { '1', '1', '1', '1', '1' },
							 { '1', '0', '0', '1', '0' } };
//		sabse pehle ek 1D array bna lete hai uspe kaam karna hai
//		jitni is matrix ki column ki length hogi....utni length ki 1D array
		int [] arr = new int [matrix[0].length];
		int ans = 0;
//		pehle last row pe loop then 2nd last pe then uske upar wale pe and so on...
//		toh row pe loop lagana hai reverse order m...
		for(int i = matrix.length-1; i>=0; i--) {
//			ek 5 size ka integer array bna hoga by default...
//			matrix m 1 hoga toh 1 se increase kar denge...and if 0 hoga toh 0.
//			toh mtlb last row m 0th column se loop chalayenge...
			for(int j = 0; j<matrix[0].length; j++) {
				if(matrix[i][j] == '1') { //matrix of i, j pe 1 hai toh
//					upar mention kiya hai jitni column ki length hai utni array ki length hai
//					by default value 0 hai...toh ++ karenge toh 1 ho jayegi
					arr[j]++; // column ke corresponding value 1 se badha denge...
				}
//				wrna waha value 0 kar denge
				else {
					arr[j]= 0;
				}
			}
//			1 unit chal gya toh ans update karenge...
//			largest rectangle ko call kiya and arr pass kiya...ye area lake dega hame 1...then 2nd last row ke liye..then upper
			ans = Math.max(ans, Largest_Rectangle(arr));
		}
		System.out.println(ans);
	}
//	histogram ka code copy-paste kiya...
	public static int Largest_Rectangle(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (!st.isEmpty()) {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				} else {
					area = Math.max(area, h * r);
				}
			}

			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (!st.isEmpty()) {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			} else {
				area = Math.max(area, h * r);
			}
		}

		return area;
	}
}


