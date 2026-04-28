package Lec_2;

public class Max_of_3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//flowchart
		//start
		//take 3 number as input
	
		//scroll down and read
		
//		int a = 5;
//		int b = 7;
//		int c = 6;
//		if(a >= b && a>=c) {
//			System.out.println("a is greatest");
//		}
//		else if(b>=a && b>=c) {
//			System.out.println("b is greatest");
//		}
//		else {
//			System.out.println("c is greatest");
//		}
		
		//or
		
		int a = 5;
		int b = 7;
		int c = 6;
		if(a >= b && a>=c) {
			System.out.println("a is greatest");
		}
		//we can remove extra condition of checking b>=a cuz we have reached 
		//to else if only when a is lesser than b..sp b is automatically greater than a
		else if(b>=c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
	}

}
