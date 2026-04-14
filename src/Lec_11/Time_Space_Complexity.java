package Lec_11;

public class Time_Space_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		There are 2 ways to calculate Time complexity
//		Asymptotic notation and Experimental
//		This is experimental way.
//		jab program run hoga tab system ka time kya hai millisecond m...wo time yaad kar liya
//		Iska return type long hota hai...
		long start = System.currentTimeMillis(); //loop ke chalne se pehle...time note kar lemge system ka
		for(int i = 0; i<100000; i++) { //ye loop 10^5 times chalega
			
		}
//		jab loop khtm hoga tab system ka time kya hai millisecond m yaad kar liya
		long end = System.currentTimeMillis();
		System.out.println(end-start); //difference aa jayega...ki loop ko execute hone m kitn time laga
	}

}
