package Lec_28;

public class Queue {
//	Queue m jitne operations hote hai wo sab O(1)...Stack and Queue m delete, get and add karne ka operation constant hota hai 
//	FIFO...First come First serve basis. 2 types...Linear and Circular.
//	GET and DELETE front se hote hai....but data add karna hota hai toh back/rear se.
//	Queue ko new nai kar sakte cuz Java m Queue class nahi hai java m. Queue ek interface hota hai.
//	Queue bnane ke liye bhi kisi chiz ki jarurat hogi jaise Stack m hui thi...
//	Yha bhi Array ki jarurat hogi queue bnane ke liye
	private int[] arr; 
//	size batayega mere queue m kitne element add hai and kha pe add karna hai...ek hi variable se kaam chala rahe hai
//	Linear queue bnate-bnate ise circular queue pe leke jana hai.
	private int size = 0; //size batata hai: Queue mein currently kitne elements hain.
	private int front = 0; //front batata hai: Abhi queue ka first element array ke kis index par hai.
	
//	Upar ek array hai and us array ko constructor ke through dono tarike se initialize kiya jaise stack m kiya tha
	public Queue() {
		this(5);
	}
	
	public Queue(int n) {
		arr = new int[n];
	}
//	size 0 hai toh 
	public boolean isEmpty() {
//		agr size ki value 0 ke barabar ho gayi
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length; //size...array ke length ke barabar hai toh length full hai
	}
	public int size() {
		return size; 
	}
//	Enqueue method
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("bhai Queue full hai");
		}
//		array m 5 element hai toh indexing 0 to 4 hogi...
//		Yha ham circular queue bna rahe hai
//		mod le lenge array ke length se...5 ban jayega 0...6 ban jayega 1...7 ban jayega 2...8 ban jayega 3 and 9 ban jayega 4
		int idx = (front + size)%arr.length; //sabse pehle...idx = (0 + 0) % 5 = 0
		arr[idx] = item; //item 10 idx joki 0 hai toh uspe aa jayega and now front 0 and size 1
//		size 0 hai toh
//		arr[size] = item; //pehle item ko rakh ko 
		size++; //size ko ++ kar diya
	}
	
	public int Dequeue() throws Exception{ //delete front se hota hai
		if(isEmpty()) {
			throw new Exception("bhai Queue empty hai");
		}
		int v = arr[front]; //front ka data yha lake save kar diya...0th index pe 10 th toh wo yaad ho gya...
//		front++; //front aage badh gya toh uske piche jitne bhi honge wo sab deleted mana jayega...
		front = (front + 1) % arr.length;
		size--;
		return v;
	}
	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("bhai Queue empty hai");
		}
		int v = arr[front];
		return v;
	}
	public void Display() {
//		jitna size hoga uspe chalega na ki array ke length pe
		for(int i =0; i<size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
