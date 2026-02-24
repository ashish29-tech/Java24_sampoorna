package Lec_6;

public class Fun_Demo_3 {
	
	//Ye global variable stack m nai bnata blki heap memory m banta hai. Global variable ke sath static lagana padta hai. Ye Global variable can access any method.
	static int val = 100; //Global variable. Class ke andar but kisi bhi method ke bhr banta hai.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 8;
		int b = 7;
		System.out.println(val); //upar global bnaya hua hai toh 100
		System.out.println(Add(b,a));
		System.out.println(val); //niche m update ho gyi value...toh 95
		System.out.println("Bye");
	}
	public static int Add(int a, int b) { //a =7 and b =8
		int c = a+b; // 7+8
		int val = 90; //Ye local variable hai, aur ye class(upar global) wale val ko overwrite nahi karta.
//		val = val -5; // 90-5 = 85;
		Fun_Demo_3.val = val-5; //agr global wala access karna hai toh...jo bhi class ka name hai use likh ke .(dot) kar ke
		return c + Sub(c,a); //
	}
	
	public static int Sub(int a, int b) { //a = 15, b =7
		int c = a-b; //15-7
		return c;
	}

}
