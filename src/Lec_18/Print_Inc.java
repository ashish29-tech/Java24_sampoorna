package Lec_18;

public class Print_Inc {
//	n=5 ke liye 1,2,3,4,5..print karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PI(n);
		
	}
	public static void PI(int n) {
		if(n==0) {
			return ;
		}
		
//		
		PI(n-1);
		System.out.println(n); 
	}

}
