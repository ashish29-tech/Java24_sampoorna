package Lec_23;

import java.util.Scanner;

public class Rat_Chases_its_Cheese {
//	https://codeskiller.codingblocks.com/problems/535

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [][] maze = new char [n] [m]; //character array n, m bna liya
//		har row ke liye string input lena hoga
//		toh ek loop row ka lagate hai...
		for(int i = 0; i< maze.length; i++) {
			String s = sc.next(); //har row ke liye bhi string input lena hai...
//			i 1 hoga toh j phir bhi 0 se start hoga...
			for(int j = 0; j<s.length(); j++) { //string ke upar loop lagaya
//				ex: maze ke (0,0) pe 0th character rakh do, 0,1 pe 1th character rakh do, 0,2 pe 2nd character rakh do, 0,3 pe 3rd character rakh do
				maze[i][j] = s.charAt(j); //maze ke i, j pe 
			}
		}
		int [][] ans = new int [n] [m]; //ans ka array bna liya
		Print(maze, 0, 0, ans);
		if(f == false) { //f ki value abhi bhi false ke barabar hai...pehle bhi false tha
			System.out.println("NO PATH FOUND");
		}
	}
//	no path found ke liye boolean variable bna lenge
	static boolean f = false;
//	nich base case hit kar jaye toh is true kar denge
	
	
//	int [][] ans .... integer ka array pass kar diya ans wala
	public static void Print(char[][] maze, int cr, int cc, int [][] ans) { //ek character matrix and i and j given hai...i and j ko cr and cc kar diya. 
//		rat can move in all 4 direction so 4 recursive call...
//		edge case handle karna hoga ki..row range se bahar na jaye...na row -ve ho. similarly column na range se bahar ho na -ve ho
//		check lagane honge blocked cell ke liye..blocked hai toh uske liya kaam nai karna
		if(cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]=='X') { //maze[cr][cc]=='X' agr cell block hai phir bhi nai jayenge wha
			return; 
		}
//		jab upar condition fulfil ho gayi mtlb cell range m hai and block nahi hai
//		jis cell pe chale gaye us cell pe dobara na jaye wrna infinite recursion ho jayega
//		cell ko temporarily block karna padega...
		maze[cr][cc] = 'X'; //dobar cell m na jaye jise temporarily block kar rahe hai 
//		call lagane se pehle X bna diya toh check karenge kahi ye last cell toh nahi
//		if last cell hai toh print kar do
//		iske liye alag se integer ka 2D array maintain karna hoga...
//		jha x dala hai hamne waha 1 dal denge baki jagah toh by default 0 hoga...
//		Agar Java me tum int ka 2D array create karte ho, to uske sabhi elements by default 0 hote hain
//		int ka 1D array bhi by default 0 se initialize hota hai.
//		last cell pe ate hi is 2D matrix ko print kara lega user
		
//		ans 
		ans[cr][cc] = 1; //1 rakh diya and niche 0 kar denge
//		check laga diya
		if(cr == maze.length-1 && cc == maze[0].length-1) {
			Display(ans); //display kara lete hai 2D matrix ko 
//			base case hit kar gya toh true kar denge
			f = true;
//			if matrix m multiple path hote toh..mtlab ek se jyada raste hote toh yahi undo kar dete 
//			yha undo karte...
//			maze[cr][cc] = 'O';
//			maze[cr][cc] = 0;
			return;
		}
		
//		jab left ka call lagayenge toh i,j m i same rahega j-1 hoga...row same and column - 1
//		jab right ka call lagega toh i same rahega and j + 1 hoga ....column +  hoga
//		jab up ka call lagega toh i-1 and j same..row kam hoga and column wahi rahega
//		jab down call lagega toh i + 1 and j same...niche aa rahe hai toh row badhega
		
//		ye recursive calls ko kisi bhi order m likh sakte hai
//		har frame se 4 call ja rahi hai toh har frame se 4 ka loop chala denge...aur usme kuch aisa kare ki value add ho jaye toh baat ban jayegi
		
//		2 direction array bna lenge...
//		1 direction row ka bna lenge..and 1 column ka bna lenge...
//		jab row m - 1 add kar rahe usi time uske corresponding column m 0
//		2nd call ke liye...jab row m 0 and column m -1 
//		jab row m + 1 toh column m 0
//		jab row m 0 tab column m + 1
		int [] dr = {-1, 0, 1, 0};
		int [] dc = {0, -1, 0, 1};
		for(int i = 0; i < dc.length; i++) { //ye loop 4 baar chalega
			Print(maze, cr + dr[i], cc + dc[i], ans); //jo chiz add kar rahe hai wo depend karega direction matrix pe
		}
		
//		Print(maze, cr-1, cc, ans); //up gaye toh i-1 
//		Print(maze, cr, cc-1, ans); // left
//		Print(maze, cr+1, cc, ans); //down
//		Print(maze, cr, cc+1, ans); //right
//		recursion ka kaam pura ho jaye toh wapis se block ko khali kar dena hai
//		backtrack karna hai toh undo kar denge
		maze[cr][cc] ='O';
		ans[cr][cc] = 0;
	}
	
	public static void Display(int [][] ans) {
		for(int i = 0; i< ans.length; i++) {
			for(int j = 0; j<ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}









