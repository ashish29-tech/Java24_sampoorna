package Lec_21;

public class Lexicographical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		print(0, n);
	}
	public static void print(int curr, int n) {
		if(curr > n) {
			return;
		}
		System.out.println(curr); //sabse pehle...current counting ko print kar dete hai...0 print ho jayega...
		
		int i = 0; //i 0 hai toh loop 10 baar chalega....curr 0 nahi hai toh 10 baar
		if(curr == 0) { //curr 0 hai toh i 1 se start hoga...loop 9 baar chalega...
			i = 1; //i 1 se start hoga toh loop 9 baar chalega
		}
		for(; i<= 9; i++) {
//			curr * 10 + i... 234 ke peeche 6 attach karna hai toh...234 * 10 + 6
//			sabse pehle 0,20
			print(curr*10 + i, n); //sabse pehle 0 * 10 + 1
		}
	}
}	
