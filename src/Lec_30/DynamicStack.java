package Lec_30;
//Dynamic bnayenge toh mtlb jitne chahe utne add kar sakte hai
//Lec_28 ke Stack.java m hamne static bnaya hai....mtlb fixed size ka...toh limitation thi
//Dynamic bnane ke liye push ke code ko change karenge...
//ArrayList se karte toh dynamic banta...but hamne Array se kiya
//Sirf push method se fark pad rha hai toh inheritance ka concept lagayenge...

// import kiya Lec_28 wala Stack cuz dono file alag-alag package m hai...agr same package m hota
// toh import karne ki jarurat nahi padti
//import kiya toh DynamicStack ke paas wo sare feature aa gaye jo Stack class m hai
import Lec_28.Stack; //package ka naam dot Stack kar ke import kiya
//inherit kiya Lec_28 wala stack class jo hamne bnaya hai...
public class DynamicStack extends Stack{
//	hame sirf push method ko override karna hai
	@Override
	public void push(int item) throws Exception {
//		isFull method stack class ka check karenge
		if(isFull()) { //this.isFull bhi kar sakte the yha
//			Stack class...wala 
//			double size ka ek new array bnao
			int [] new_arr = new int [2*arr.length];
//			purane wale array ka sara data copy karna hai
			for(int i = 0; i<arr.length; i++) {
//				new array ke index i pe...purane array ka data rakh dete hai
				new_arr[i] = arr[i]; //0th index ka data new array ke 0th index pe dala...1st index ka data 1st pe
			}
//			ab array 
			arr = new_arr; //ab arr ko point kare
		}
//		now idx++; and arr[idx] = item; jo stack m likha hua hai wahi likhna hai toh
//		kya copy-paste kar denge ? no..better hai stack class ka push method chala denge
//		now stack class ka push method chalayenge...
//		parent and child m jab ek hi data hai and ham chahte hai parent wala chale toh uske liye Super keyword use karte hai
		super.push(item); //parent class ko super class bhi bolte hai...parent class m Exception wali line de rakhi hai toh yha upar m deni padegi...and main m bhi add karna padega
	}
	public static void main(String[] args) throws Exception {
//		Stack class ka constructor chal jayega....and 5 size ka array initialize karwa dega..
//		and idx ko -1 pe set kar diya hoga... ds.push karenge toh idx++ and array ke us index pe 10 rakh denge
//		aise hi DS.push karte 20,30,40,50 karenge now ab array full ho gya 
//		toh ab new array bna double size ka...5 data as it is copy kar diya...check notes in register
		DynamicStack ds = new DynamicStack(); //dynamic stack ka ek object bnaya
//		recursive call
//		stack overflow hoga cuz ye apne aap ko hi call kar rha hai....
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.Display();
	}
}
