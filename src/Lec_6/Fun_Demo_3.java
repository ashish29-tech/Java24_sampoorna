package Lec_6;

public class Fun_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 8;
		int b = 7;
		Add(b,a); 
		System.out.println("Bye");
	}
	public static int Add(int a, int b) { //a =7 and b =8
		int c = a+b; // 7+8
//		Sub(c,a); //15 + 7
		return c; // method se wapis jayega toh integer jaisa value sath leke jayega
	}
	
//	public static void Sub(int a, int b) { //a = 15, b =7
//		int c = a-b; //15-7
//		System.out.println(c); //8
//	}

}
