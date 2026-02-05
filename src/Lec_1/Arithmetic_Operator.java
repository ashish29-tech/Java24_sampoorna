package Lec_1;

public class Arithmetic_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7; //a m 7 rakha hua hai
		int b = 3;
		int c = a + b;
		System.out.println(c);
//		int c = a -b; //ye galat hai cuz upar int c pehle ban chuka hai toh dobara nahi bna sakte
		c = a - b ;
		System.out.println(c); //ye chal jayega 
		//For multiplication
		int d = a * b;
		System.out.println(d);
		//For divide
		int e = a / b; // 7 / 3 ....3*2...quotient 
		System.out.println(e);
		//For modulo
		int f = a % b; // 7 % 3 ...3*2=6 and 1 remainder hota toh 1 hi modulo hota
		System.out.println(f);
		
		
		//Assignment operator
		int X = 5;
		X+= 5; // iska mtlb X = X + 5...X m 5 jod do
		X = +5; // iska mtlb X m 5 gya
	}

}
