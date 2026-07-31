package Lec_24;

public class n_Queen {
//	https://leetcode.com/problems/n-queens/description/
//	leetcode wale question m: 2D list return karna hai...jha queen hai wha Q likhna hai and jha nahi hai wha .(dot) likhna hai...
//	logic almost yha jaise solve kiya hai waisa hi lagega
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
//		ek boolean ka board bna lete hai
		boolean [] [] board = new boolean [n][n]; //2D matrix bna liya n * n ka
		int tq = n; //total queen bhi n le liya
		NQueenPrint(board, tq, 0);
	}
//	1 queen ke liye kitni possibility hai ? 4. Means jitni calls utni possibility
//	boolean ka board le lenge...total kitni queen bithani hai and kon se row se bithani hai
	public static void NQueenPrint(boolean [] [] board, int tq, int row) { //4 queen and row 0 hai yha 
//		base case
		if(tq==0) { //mtlb sab baith gayi queen
			Display(board); //is diplay ke through 2D matrix ko display kara lete hai..jha true hoga wha queen baithi hogi
			return;
		}
		
//		har column pe try karenge toh loop laga liya
		for(int col = 0; col<board.length; col++) {
//			usi cell pe bithayenge jispe bithana safe hoga
			if(issafe(board,row,col)==true) { //issafe naam ka method hoga...ye batayega ki bitha sakte hai ya nahi
//				agr baith sakti hoga toh row, column ko true set kar denge means baith gayi
				board[row][col] = true;
				NQueenPrint(board, tq-1, row+1);//call laga denge and 1 queen bitha di hai toh - 1 and agle row m chale ja toh row m + 1
//				yha backtracking bhi lagega cuz 2D matrix m likha hai toh apne aap undo toh hoga nahi
				board[row][col] = false;
			}
		}
	}
	
//	ek cell ko check karna hai ki safe hai ya nahi...8 direction honge check karne ke liye...8 tarike se queen kill hoti hai
	public static boolean issafe(boolean[][] board, int row, int col) {
		
//		suppose 3,2 check karna hai ki safe hai ya nahi toh is cell pe jab queen rakhne aye honge toh us row m toh queen nahi hogi ye confirm hai.
//		Toh us row m left and right nahi check karenge cuz us row toh queen nahi hai na...and is row ke niche bhi abhi tak nahi bithaya hai toh niche walo se bhi dikkat nahi hai filhal toh 3 direction m bhi danger nahi hai
//		upper left diagonal, upper part, upper right diagonal....ke liye code likhenge
//		upper part
//		column fix hai...3,2 pe queen hai toh upar ayenge toh 2,2 then 1,2 then 0,2 in sabme column fix hai
		int r = row;
		while(r>=0) {
			if(board[r][col]==true) { //agr true mil gya means pehle se queen baithi hua hai
				return false; //toh return false
			}
			r--;
		}
//		left diagonal
//		3,2 se 2,1 pe aye then 1,0 pe...
		r = row; //r row se start hoga
		int c = col; //c lenge current column se 
		while(r>=0 && c>=0) { //row and column dono greater than = 0 ho
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
//		right diagonal
//		is case m 3,2 se 2,3 pe ja rahe hai then 1,4 then 0,5 pe...
//		means row kam ho rahi hai and column increase ho rha
		r = row;
		c = col;
		while(r>= 0 && c<board[0].length) { //column board ki length se kam hona chahiye...
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c++; //column badh rha hai isliye ++
		}
//		upper, left, right teeno se khatra nahi hai toh ye cell safe hai isliye return true
		return true;
	}
	
	public static void Display(boolean[][] board) { //2D matrix display karana hai
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j< board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
