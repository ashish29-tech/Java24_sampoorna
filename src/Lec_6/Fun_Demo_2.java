package Lec_6;

public class Fun_Demo_2 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		Add();
//		System.out.println("Bye");
//	}
//	public static void Add() { 
//		int a = 8;
//		int b = 7;
//		int c = a+b;
//		Sub();
//		System.out.println(c);
//	}
//	public static void Sub() { 
//		int a = 8;
//		int b = 7;
//		int c = a- b;
//		System.out.println(c);
//	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		int a = 8;
//		int b = 7;
////		Add(a,b); // yha se a m 8 and b m 7 bhej rahe hai
//		Add(b,a); //yha se b m 7 and a m 8 bhej rahe hai
////		Add(2,4); //aise direct paas kar diya and niche func m parameter m int a m 8 and int b m 7 aa jayega
//		System.out.println("Bye");
//	}
//	//jis order m upar se bheja jayega usi order m yha ayega
//	public static void Add(int a, int b) { //upar jaise paas kiya hai waise value ayegi agr Add(a,b) hai toh a ki value yha int a m ayegi and Add(b,a) kiya hai toh upar ke b ki value int a m aa jayegi
//		int c = a+b;
//		System.out.println(c);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 8;
		int b = 7;
		Add(b,a); 
		System.out.println("Bye");
	}
	public static void Add(int a, int b) { //a =7 and b =8
		int c = a+b; // 7+8
		Sub(c,a); //15 + 7
		System.out.println(c); //7+8 = 15
	}
	
	public static void Sub(int a, int b) { //a = 15, b =7
		int c = a-b; //15-7
		System.out.println(c); //8
	}

}
