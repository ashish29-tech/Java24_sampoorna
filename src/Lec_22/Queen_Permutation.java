package Lec_22;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4; //
		int tq = 2; //total queen 2
//		hame ek board chahiye ye board 1D array lena hai...1D array chahe integer ka lo ya boolean ka lo...
//		for ex: Integer ka lete hai toh...jha 1 hai means queen rakha hai and 0 hai toh nahi hai...
//		boolean ka 1D array lete hai toh...jha true hai toh queen hai and false hai toh nahi baithi queen
		
		boolean [] board = new boolean[n]; //by default boolean ke array m false fil hoga....
//		2k board, 2 total queen, "" ans blank, 0 qpsf
		Permutation(board, tq, "", 0); //queen ke liye 0 rakh diya
	}
	public static void Permutation(boolean [] board, int tq, String ans, int qpsf) { //qpsf: queen placed so far
//		base case
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
//		jitni board ki length utni choice..jitni choice utni call
		for(int i = 0; i < board.length; i++) {
//			har cell pe jake check karna hoga ki queen baithegi ki nahi baithegi...false hoga toh hi queen bithayenge
			if(board[i]==false) {
//				call lagane se pehle ye jo hamne likha and recursion ise undo nahi kar pata forcefully hame karna padega...so this step will be backtracking.
//				String ko chor ke...Jo content heap m likha gya hai use recursion kabhi undo nahi kar pata...toh hame karna padega...
				board[i]=true; //queen bitha diya
//				ab baki ka kaam recursion ka...baki ke queens ko recursion place kar de
//				ye b0, b1, b2, b3 ye sab kaise ayega ? 0,1,2,3 ye sab index no. hai...
//				ans+"b" ans m b khud hi likhna padega...i aa jayega index no. se...q khud likhna padega...
//				queen ke sath 0,1,2 tha...iske liye variable maintain kar lete hai...upar 0 se start kiya....
//				initially value 0 hai qpsf ki toh yha qpsf kar denge 
//				
				Permutation(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1); // qpsf+1...jaise jaise recursion m aage badhenge toh aage badt
//				call ke baad reinitialise karenge...
				board[i] = false; //ye recursion jo undo nai kar paa rha tha use hamne undo kiya...
			}
		}
	}
}
//	recursion ke call lagane m aisi chize likhi gayi hai jise recursion undo nahi kar pata...toh wo hame khud karna padta hai use backtracking kehte hai.
//	


