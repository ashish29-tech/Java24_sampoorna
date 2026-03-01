package Lec_6;
import java.util.Scanner;
public class Is_Armstrong_Number {

	//https://codeskiller.codingblocks.com/problems/1102  .....coding block
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_Armstrong(n));
		
	}
	//function bnayenge jo check karega armstrong number
	//return type boolean rakhenge toh main m result print karenge and if void rakhene toh isi func m print karna padega
	public static boolean Is_Armstrong(int n) {
		int c = Countofdigit(n); //4 aa gya niche wale function se
		int sum = 0;
		int p = n; //yaad kar liya 371(n) ko
		while(n>0) {
			int rem = n%10;
			//Math.pow ka return type double hota hai...and hame integer m rakhna hai toh typecasting karenge
			sum = (int) (sum + Math.pow(rem, c)); //power ke liye we have Math.pow(remainder ki power count of digit)
			n = n/10; //number by 10..1634 ka 1634/10 karenge toh 163 ho jayega...aise hi last m 1/10... 0 ho jayega toh niche if m sum = n kar denge toh 0 ho jayega and kabhi nai chalega toh false ayega isliye upar yaad kar liya
		}
		if(sum == p) { //jo sum aya hai wo agr original number jo yaad kar liya hai upar uske barabar hai toh
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//count of digit isliye bnaya gya taki help ho sake armstrong number nikalne ke liye...
	//koi number armstrong hai ya nahi ye check karne ke liye pehle pta karenge kitne digit ka number hai
	//cuz hame digit ke power ka sum hi to add karna hai
	//and return type int rakhna hoga cuz is result ko kahi na kahi use karna hai
	public static int Countofdigit(int n) {
		int c = 0; //count ki value initially 0
		while(n>0) { //
			n = n/10; //1634 hai toh 1634 / 10 toh 163 aa jayega
			c++; //count badhta rahega
		}
		return c;
	}

}
