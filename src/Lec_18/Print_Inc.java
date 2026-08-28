package Lec_18;

public class Print_Inc {
//	n=5 ke liye 1,2,3,4,5..print karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PI(n);
		
	}
//	
	public static void PI(int n) {
		if(n==0) {
			return ;
		}
		
//		Ye head recursion hai cuz last statement recursive call ke baad bhi niche kaam ho rha hai
//		Agar mujhe 1...5 print karna hai, toh pehle 1...4 print karwa leta hoon, phir 5 print kar dunga.
		PI(n-1); //recursive call
		System.out.println(n); 
	}

}
