package Lec_6;

public class Fun_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Add();
	}
	//2 number add karna hai uska function/method
	//class ke andar banega. public static toh common hai. Then return type..void. Method name Add
	public static void Add() { //yha koi parameter nahi diya toh non-parameterised
		int a = 8;
		int b = 7;
		int c = a+b;
		System.out.println(c);
	}

}
