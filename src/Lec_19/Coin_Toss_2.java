package Lec_19;

public class Coin_Toss_2 {
//	for n = 4. coin tossed but we don't need outcomes where 2 consecutive heads are there.
//	2 head jaha se lagatar banna chalu ho jayenge toh wo call rok denge...
//	recursive call pe condition...ans ka last character 'h' hai and phir 'h' aa rha hai toh call mat jane do...
//	wrns isse 2 lagatar head ayenge...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Print(n, "");

	}

	public static void Print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
//		yha condition laga denge
//		ans.charAt means ans ka last index... and ans ka last index kaise milega...ans.length()-1 se...and ye chacter != ch yani 'H' hai...tab ye call jayega else nahi jayega...
//		but ye always correct nahi hoga cuz jab pehli baar ayenge toh ans ka length 0 hai...and 0 wale m toh Head bhi gya hai Tail bhi gya hai....so we'll add another condition ki ans ki length 0 hai tph call jayega...	
//		so finally ans ki length 0 hai toh call jayega...ya fir length 0 nahi hai or char != 'H' hai toh call jayeag...else call nahi jayega
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') { //call tabhi jayga jan ans ka last character ch means H na ho..
			Print(n - 1, ans + "H");
		}
		Print(n - 1, ans + "T");
	}

}
