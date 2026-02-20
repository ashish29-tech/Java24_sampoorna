package Lec_5;

import java.util.Scanner;

public class Data_type_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		boolean b1 = false;
		Scanner sc = new Scanner(System.in);
		b = sc.nextBoolean();
		System.out.println(b);
		//float and double
		//double m literal ka type double hota hai
		double d = 8989.78;
		float f = 78.6f; //literal ka type yha double hota hai and double wale ko float m rakhenge toh error dega isliye yha bhi typecase karna padega
		d = sc.nextDouble(); //user input
		f = sc.nextFloat();
		System.out.println(d);
		System.out.println(f);
	}

}
