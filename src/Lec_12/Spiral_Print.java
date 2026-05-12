package Lec_12;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = {
//	            {1, 4, 7, 11, 15},
//	            {2, 5, 8, 12, 19},
//	            {3, 6, 9, 16, 22},
//	            {10, 13, 14, 17, 24},
//	            {18, 21, 23, 26, 30}
//	        };
//		ispe fail ho jayega
		int[][] arr = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
		Print(arr);
	}
	public static void Print(int [][] arr) {
//		Sabse pehle charo boundary yaad kar lete hai....
		int minr = 0; //minimum row 0 pe hogi...1
		int minc = 0; //minimum column 0 pe hogi...1
		int maxr = arr.length-1; //max row 18 pe hogi
		int maxc = arr[0].length-1;
//		count maintain kar lenge..ki hame kitne element print karna hai...
		int te = arr.length * arr[0].length; //total element = row ka length into column ka length
		int c = 0; //count maintain
		while(c<te) { //count less than te hai tab tak loop chale
//		0th row print karenge...Toh loop minc se leke maxc tak...
//		sare element print hone ke baad bhi ek baar loop chal rha hai toh uske liye condition...
		for(int i = minc; i<=maxc && c < te ; i++) { //agar element sare print ho gaye hai tab bhi loop na chale
			System.out.print(arr[minr] [i]+ " ");
			c++; //jab-jab print karenge tab tab count++
		}
		minr++; //aage badhayenge..minr niche aa gya...
		for(int i = minr; i<=maxr && c < te; i++) { //minr se leke maxr tak lagega...
			System.out.print(arr[i][maxc] + " "); //i vary kar rha hai and maxc max column hoga...mtlb column fix hai toh 19-30 print hoga
			c++; //jab-jab print karenge tab tab count++
		}
//		maxc column pura ho gya toh maxc ko peeche la do...
		maxc--;
//		maxc se minc...maxr fix hai...
		for(int i = maxc; i>=minc && c < te; i--) {
			System.out.print(arr[maxr][i] + " "); //maxr fix hai column vary karega...
			c++; //jab-jab print karenge tab tab count++
		}
		maxr--; //maxr upar aa jaye...
//		maxr se minr tak print karna hai
		for(int i = maxr; i>=minr && c < te; i--) {
//			maxr se minr...reverse loop chalega..
			System.out.print(arr[i][minc] + " "); //minc fix hai....
			c++; //jab-jab print karenge tab tab count++
		}
		minc++; //minc aage badh jayega
	}
	}
}
