package Lec_11;

public class Time_Space_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		There are 2 ways to calculate Time complexity
//		Asymptotic notation and Experimental
//		This is experimental way.Output depends upon hardware.
//		Experimental is not the way which we should be using. Bcz it's dependent on hardware.
//		jab program run hoga tab system ka time kya hai millisecond m...wo time yaad kar liya
//		Iska return type long hota hai...
//		long start = System.currentTimeMillis(); //loop ke chalne se pehle...time note kar lemge system ka
//		for(int i = 0; i<100000; i++) { //ye loop 10^5 times chalega
//			
//		}
////		jab loop khtm hoga tab system ka time kya hai millisecond m yaad kar liya
//		long end = System.currentTimeMillis();
//		System.out.println(end-start); //difference aa jayega...ki loop ko execute hone m kitn time laga
		
		
//		asymptotic notation
		System.out.println("Hello"); //Ek statement ko print karne m kitna time lagega ? Constant time lagega..
//		chahe 5 baar kiya tab bhi constant time...
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
//		Jitne bhi arithmetic, comparison, logical operator...in sabme constant time
//		Each statement = O(1)
//		Printing one line → O(1)
//		Arithmetic (+, -, *, /) → O(1)
//		Comparison (>, <, ==) → O(1)
//		Constant time means: Execution does NOT grow with input size n
		
//		Question: Kitni complexity ayegi ? 
//		
//		int n = 566789;
//		int i = 0;
////		loop 0 se leke n-1 time means n times tak chal rha hai...
////		Toh O(N) order of N
//		while(i<n) {
//			System.out.println("Hey"); //ye constant
//			
//			i++; //ye bhi constant
//		}
		
//		Ye binary search ka loop hai...
//		i...ye counter multiply ya divide se change ho rha hoga toh uski complexity
//		log m jayegi...ans base wo hoga jisse multiply ya divide kar rahe hai
//		O(Log(N)) base 2
		int n = 566789;
		int i = 1;
		while(i<=n) {
			System.out.println("Heya");
			
			i *= 2;
		}
		
//		Ye bhi binary search hai
//		O(Log(N)) base 2....cuz divide ho rha hai
//		while(n>0) {
//			System.out.println("Heyyy Baby");
//			n /= 2;
//		}
		
		
//		har baar add kar rahe hai....If 100 tak jana hai toh...0, 5, 10, 15, 20...toh n/5
//		n/5 ko likhenge... order of n O(N)
//		jab bhi +/- ho rha ho toh linear time...O(N) order of n
		while(i<=n) {
			System.out.println("Hiee");
			
			i+=2;
			i+=3;
		}
	}

}
