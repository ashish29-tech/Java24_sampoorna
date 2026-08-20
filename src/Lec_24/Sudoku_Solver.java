package Lec_24;

public class Sudoku_Solver { 
//	leetcode m character m karna hai and monu bhaiya int m karwa rahe hai
//	leetcode ke liye integer ko character banana hai...
//	https://leetcode.com/problems/sudoku-solver/description/
//	Monu bhaiya is teaching this question in a different way
//	Do ask him other way sometime
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Isi matrix m change karna hai...isi 2D array ke andar
//		input is given in this format
//		jha 0 hai means unfilled cell hai...ise fill karna hai
//		jab is 2D matrix ko print karenge toh proper sudoku bante hue dikhna chahiye
//		ye 9*9 ka 2D matrix given hai...
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
						 { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
						 { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
						 { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
						 { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
						 { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
						 { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
						 { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
						 { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		
//		jab sudoku solve kar de
		SudokuSolver(grid, 0,0); //0,0 se start karna hai
		
//		1 cell se 9 call ja rha hai jab sudoku nahi ban raha hoga toh backtrack karenge
		
//		and solve karne baad 2D matrix ko print kare toh
//		2D matrix completetly filled dikhna chahiye
//		so same hi array m change karna hai...actual question interview m yahi ata hai
//		change ho jaye toh print karna hai 
		for(int i = 0; i<grid.length; i++) {
			for(int j = 0; j<grid[0].length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
//	return type boolean rakha hai sudoku jaise hi ban jayega toh return true kar denge
	public static boolean SudokuSolver(int [][]grid, int row, int col) { //integer ka ek grid given hai and row and column given hoga...initally 0,0 se start hoga
		if(col==9) { //1st row puri ho gayi toh
			row++; //row 1 badha di
			col=0; // col 0  kar diya
		}
//		agr row 9 ho gya toh mtlb sudoku solve ho gya hai...9th toh exist hi nai karti sudoku m toh mtlb sudoku solve ho gya...
		if(row==9) {
			return true;//mtlb sudoku solve ho gya toh return true
		}
//		0,0 se start karenge and check karenge ki cell kahli hai ya nahi 
		if(grid[row][col]!=0) { //fill hai toh
//			sudoku se jo bhi ans aya hai as it is return kar denge...true laya toh true and false laya toh false
			return SudokuSolver(grid, row, col+1); //column m + 1 kar denge ki next col m chala ja
		}
		else {
			for(int val = 1; val<=9; val++) { //unfilled hai toh 9 call lagengi..1 se leke 9 tak ka
//				is particular cell pe value rakh payenge ki nahi rakh payenge
				if(issafe(grid,row,col,val)) { //ye grid pe kon se row,col,val ke liye safe check karna hai wo leke aa
//					agr safe h rakh payenge toh 
					grid[row][col]= val; //toh grid pe rakh denge
//					ab recursion ko kahenge ans leke aa 
					boolean ans = SudokuSolver(grid, row, col+1); //jo value rakh rahe hai kya usse sudoku solve ho gya
						if(ans) { //agr true la ke de diya
//							toh aage recursion nahi chalayenge yahi se return
							return ans;
						}
						grid[row][col] = 0; //wrna grid ko undo kar ke aage call lagayenge cuz same hi array m change karna hai toh aise karna padega
					}
				}
			}
			return false; // agr else wale case m return true nahi hua toh mtlb sudoku solve nahi hua hai...toh return false
		}
		public static boolean issafe(int [][] grid, int row, int col, int val) {
//			row ka check laga lete hai....row fix hoga col vary karega
			for(int c = 0; c<grid[0].length; c++) {
				if(grid[row][c]==val) { //row fix hai col vary karega and yha value mil gya toh
					return false;//mtlb safe nahi hai
				}
			}
//			col..... yha row vary karega and col fix hoga
			for(int r = 0; r<grid.length; r++) {
				if(grid[r][col]==val) { //agr isme value mil gya
					return false; //toh return false
				}
			}
//			3*3 cross matrix
//			3-3 ki grouping banate hai. Har group ka column no. 0 strt hoga....
//			3 ke multiple m chal rahe hai toh remainder jitna ayega utna hi toh aage honge...toh utna peeche ho jayenge
//			3*3 ka start mil jayega
			int c = col-col%3;
			int r = row - row%3;
//			start mil gya toh traverse karna hai
			for(int i = r; i<r+3; i++) {
				for(int j = c; j<c+3; j++) {
					if(grid[i][j]== val) { //i,j pe check kar lenge agr value mil gya toh
						return false; //toh value nahi hai
					}
				}
			}
//			wrna safe hai
			return true;
		}
	}


