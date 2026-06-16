package Lec_19;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Print(n, ""); //initially head and tail blank hoga.... 3, ""
	}
	public static void Print(int n, String ans) { //ek n given hai and Head and Tail toh string m banega toh string given hai
//		Base case
		if(n==0) { //matlab saare coins toss ho chuke hain.
			System.out.println(ans);
			return; 
		}
		
//		1 coin toss karenge toh ya toh head ayega ya tail...
//		Yahan har coin ke liye 2 possibilities hain:
//		Toh ham ek karenge toss baki 2 ka ans recursion la ke de...
//		
		Print(n-1, ans+"H"); //n-1 = 2.... 2,H
		Print(n-1, ans+"T"); // n-1 = 2...2,T
		
	}
}
