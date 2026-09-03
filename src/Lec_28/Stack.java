package Lec_28;
// java ka stack toh dynamic hota hai apne aap size badhta jata hai 
// yha ham apna stack bna rahe hai....iski application inheritance ke time ayegi
// Hamara stack dynamic nahi hoga...fix size ka hoga hamara. Inheritance padhenge toh dynamic bna denge...
public class Stack {
//	Static nature ka bnayenge ham Stack. Inheritance padhenge toh dynamic nature ka hoga.
//	Ham apna stack bnana chah rahe hai toh kahi toh rakhenge...10,20,30,40 ko
//	Apna stack bna rahe hai toh data rakhne ki functionality honi chahiye...
//	Data ko kha rakhenge ? Array m cuz Static bnana hai. ArrayList pe gaye toh dynamic ban jayega.
//	Jaise student ek class thi uske data members kya the ? name, age, rollno
//	Yha stack m data member hoga Array. And ise private banayenge cuz we don't want hamare array ko access kar ke kuch bhi value client change kar de.
	private int [] arr;
//	Array ke kis index pe data add karana ho wo ham decide karenge
	private int idx = -1; //stack ko -1 se initialize kar rahe hai...queue 0 se le lenge.
//	ham chahte hai array m address null na ho toh
//	toh constructor bnate hai
	public Stack() { //ye default 
//		arr = new int[5]; //agr user ne kuch nahi bola toh 5 size ka. Ye line niche wale constructor m bhi likhi gayi hai toh duplicacy na ho iske liye this ka use karenge
		this(5); //code ki duplicacy na ho iske liye 5 pass kar denge.
	}
//	
	public Stack(int n) { //upar this(5) wala yha ayega 5 and isse niche wali line se 5 size ka array build ho jayega.
		arr = new int[n]; //jitna user ne bola utne size ka
	}
//	3 method likhenge
//	stack empty hai ya nahi
	public boolean isEmpty() {
		return idx == -1; //idx ki value -1 ke barabar hai toh true else return false
	}
	public boolean isFull() {
//		full hai ya nahi. 
//		agr size ki value...array ke length ke barabar ho gayi toh stacks full ho gya hai...
		return size() == arr.length; //sara data full gya hai toh...means current size....array ke size ke jitna ho gya toh
	} 
	public int size() {
		return idx+1;
	}
	public void push(int item) throws Exception { //aage bhej denge Exception ko
//		agr stack full ho gya toh apna exception generate karenge
		if(isFull()) {
			throw new Exception("Bhai stack full hai");
		}
//		st.push(10) aise hi st.push(20) etc. hai toh.... upar m hamen idx ki value -1 set kar rakhi hai
//		idx-1 hai toh sabse pehle idx++ karenge
		idx++;
//		and 0th index pe jo bhi item hoga use rakh denge......
		arr[idx] = item;
	}
//	peek mtlb view karna...jaha pe idx hai wo data view karna hai
	public int peek() throws Exception{
//		ate ke sath hi peek kar liya toh wo dikkat hai
		if(isEmpty()) {
			throw new Exception("bhai stack empty hai");
		}
		return arr[idx]; //jha pe idx hai wo value return kar denge
	}
	public int pop() throws Exception {
//		yha bhi 
		if(isEmpty()) {
			throw new Exception("Bhai stack empty hai");
		}
//		sabse pehle jo data delete kar rahe hai use yaad karenge...and idx ki value piche le gaye...cuz jha tak idx hai wahi tak data mana jayega 
		int v = arr[idx];
		idx--; //peeche le gaye idx
		return v; //jo data yaad kiya use return kar diya
	}
	public void Display() {
//		jha tak idx hoga wahi tak print karayenge...pure array ke length pe loop nahi lagega
		for(int i = 0; i<=idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
