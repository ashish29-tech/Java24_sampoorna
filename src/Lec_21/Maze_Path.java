package Lec_21;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; //no. of row
		int m = 3; //no. of col
//		n-1 and m-1 toh coordinate ho gya
		PrintPath(0, 0, n-1, m-1, ""); //cr initially 0 hai, cc 0 hai, er n-1 hai, ec m-1 hai, "" mtlb jama kaha hai...
	}
//	cr= current row... cc = current column....er= end row.....ec= end column
	public static void PrintPath(int cr, int cc, int er, int ec, String ans) { //ye sab paas kiya
//		ans kab banega...
		if(cr==er && cc==ec) { //in dono case m ans ban jayega
			System.out.print(ans+ " ");
			return;
		}
//		boundary jab paar kar jayega toh wapis ana hoga
		if(cr>er || cc>ec) {
			return; 
		}
		PrintPath(cr, cc+1, er, ec, ans + "H"); //agr pehle horizontal call lagayenge toh col m +1 kar denge and string m H add kar denge
		PrintPath(cr+1, cc, er, ec, ans + "V"); //agr vertical call lagayenge...row m +1 and and m V add
	}
}
