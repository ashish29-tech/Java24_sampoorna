package Lec_2;

public class Pre_inc_Post_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 7;
//		System.out.println(a++); //a ki value ko 1 se increase. Pehle print karta hai phir apne andar change karega
//		System.out.println(a); //change phir yha reflect hoga
//		System.out.println(a--); 
//		System.out.println(a); //
		
//		int x = a++ + a-- - 2;
//		System.out.println(x);
		
//		System.out.println(--a); //pehle value change hoga then assign itself
//		System.out.println(a);
		
//		int x = a++ + a-- - 2 - ++a + --a + a++;
//		System.out.println(x);
		
		int a = 5;
		int x = a++ - --a - 2 - ++a + --a + a++;
		// 5 - 5 - 2 - 6 + 5 + 5 
		System.out.println(x);
	}

}
