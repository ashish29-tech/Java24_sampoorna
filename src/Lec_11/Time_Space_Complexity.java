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

//		O(Log(N)) base 2....log n base 2.....cuz divide ho rha hai
//		O(Log(N)) base 2....cuz divide ho rha hai

//		while(n>0) {
//			System.out.println("Heyyy Baby");
//			n /= 2;
//		}
		
		
//		har baar add kar rahe hai....If 100 tak jana hai toh...0, 5, 10, 15, 20...toh n/5

//		n/5 ko likhenge... order of n O(N)/linear time

//		n/5 ko likhenge... order of n O(N)

//		jab bhi +/- ho rha ho toh linear time...O(N) order of n
//		while(i<=n) {
//			System.out.println("Hiee");
//			
//			i+=2;
//			i+=3;
//		}
		
//		log n base 6 cuz 6 se multiply kar rahe hai na
//		O(Log(N)) base 6
//		i ki value pehle 1..i=1... hai phir 6 kar rahe hai...i=6...phir i= 6^2 then i= 6^3
//		6^k = N...
//		while(i<=n) {
//			System.out.println("Hey");
//			
//			i *=2;
//			i *=3;
//		}
		
		
//		
//		O(Log(N)) base 6
//		while(n>0) {
//			System.out.println("Heya");
//			
//			n /= 2;
//			n /= 3;
//		}
		
		
//		Jab add kar rahe hai toh loop kitni baar chala hoga...? N/K times...K kuch bhi ho skata hai..
//		O(N/K) .... O(n)
		int k = 2;
		i = 1;
		while(i<=n) { 
			System.out.println("Hey");
//			Har iteration mein:i=i+2
//			Matlab i linearly badh raha hai (step size 2 ke saath)
//			Even though i += 2 (2 se jump ho raha hai)...still Ye linear growth hai, exponential nahi
			i+=k;
		}

		i =1;
		while(i <= n) {
			System.out.println("Hiee");
//			O(Log(N)) base K.....jab into karenge toh log m jayega usme base k hoga
			i*=k;
//			Agr k user input hai toh..toh n/k. Agr k fixed hai toh n kahenge.
//			Instead of increasing i linearly (i++), you're increasing it multiplicatively (i *= k)
//			Let’s track i over iterations (assuming initial i = 1)
//			1st iteration → i = k.....2nd → i = k²...3rd → i = k³...t-th → i = k^t
//			The loop stops when:
//			k^t > n
//			Take log on both sides: t ≈ logₖ(n)
//			Final Time Complexity
//			So the loop runs about: O(logₖ(n)) Which is usually written as: O(log n)
		}
		
//		Nested loops
//		Dependent and Independent
//		jha j ke andar i ka involvement hota hai use dependent loop
//		currenly it is independent loop
//		Iski complexity kaise nikalte hai ?
//		bhr wala loop kitni baar chal rha hai ? n
//		andar wala loop kitni baar chal rha hai ? n
//		and iske andar ka kaam kitne ka ? (print wali line) 1
//		n * n * 1 = n^2.... 
		for(i =0; i<= n; i++) {
			for(int j =1; j<= n; j++) {
				System.out.println("Heyaa");
			}
		}
		
//		loop 1 se chal raha hai and max i^2 <= n tak chalega...
//		i ki max value kya ayegi... i <= underroot n
//		The loop stops when:i² > n
//		So the maximum i is about: 👉 √n
//		Time Complexity = O(√n)
		for(i = 1; i * i <=n; i++) {
			System.out.println("hey");
		}
		
//		
//		O(N^4)
		for(i = 1; i<=n; i++) {
			for(int j = 1; j<= i*i; j++) {
				for(k=1; k<=n/2; k++) {
					System.out.println("hiee");
				}
			}
		}
		
		
//		O(log n)
		for(i =1; i<= n; i *=2) {
			System.out.println("Hey");
		}
		
//		n * n * log n = O((n^2) log n)
//		outer wala n/2 times chal rha, middle wala bhi n/2 and inner wala log n times...
//		so n/2 * n/2 * log(n)
//		n^2 log n
		for(i = n/2; i<=n; i++) { //n
			for(int j = 1; j<=n/2; j++) { //n
				for(k = 1; k<=n; k= k*2) { // log n
					System.out.println("heya"); //ye kaam constant
				}
			}
		}
		
//		(O(N^2))
		for(i =1; i<=n; i++) { //outer loop runs n times.
			for(int j=i; j<=n; j++) {
				System.out.println("hey");
			}
		}
		
	}

}
