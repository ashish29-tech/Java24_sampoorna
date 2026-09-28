package Lec_33;

public class LinkedList { //ek LinkedList class hai Java ke andar

//	LinkedList bnane ke liye hame node chahiye hoga...jab-jab add karenge toh ek node bnayenge..
	private class Node{ //node class ko private bhi bna sakte hai...is puri LinkedList class m use kar sakte hai
	int val;
	Node next;
	}
// private head isliye bna rahe hai cuz agr kisi ne head ko access kiya and use null kar diya toh LinkedList hi khtm
private Node head; //pehle wale node ka address yaad rakh liya head m....
private Node tail;

private int size;

// Iski complexity ? O(1) cuz node create karna, else ye sab constant kaam hai
public void AddFirst(int item) {
//	jaise-jaise add karenge waise-waise head ko change karenge...
//	For ex: pehle 10 add kiya toh node m 10 aya and kuch nahi hai toh null address sath m....and 1k location pe hai.
//	Then 20 add kiya and 20 ke sath m pehle wale node ka address 1k sath m aa jayega...and is new node ka address 2k...
//	Then 30 add kiya toh sath m previous node ka address 2k sath m ayeaga...and head ab new wala node ho jayega.
//	Toh add first ka meaning....aage-aage linkedlist m jab add karenge toh head ko change karenge..
//	cuz aage-aage jab add karenge toh line ka start point change hoga...
	
//	sabse pehle ek node bnayenge...
	Node nn = new Node(); //node bnaya toh 0 and null aa gya hoga...1k location pe...
	nn.val = item; //
//	agr yahi node hai sirf toh
	if(size == 0) {
		head = nn; //head bhi yahi banega
		tail = nn; //tail bhi yahi banega
		size++; //size 1 se badh jayega
	}
//	agr 1 se jyada node hai toh
	else {
//		nn ke next m head ko point kara denge
		nn.next = head;
		head = nn; //head aa jayega new node pe
	}
//	size har baar plus ho hi rha hai toh bahar likh dete hai
	size++;
 }

//	Jab aage-aage add kar rahe the toh Head change ho rha tha...
// jab peeche add karenge toh tail pe asar ayega....
// Iski TC bhi O(1)
	public void AddLast(int item) {
		if(size==0) {
//			Agr LinkedList ka size 0 hai toh chahe linkedlist ke peeche add karo ya last m kuch fark nai padta
			AddFirst(item); //toh AddFirst ko call kar diya
		}
//		agr size 0 nahi hai toh
		else {
//			toh ek node ban gya...
			Node nn = new Node();
			nn.val = item; //nn m value 70(kuch bhi) save ho gayi
//			and jo pehle se tail node tha uske address m null tha usme new node ka address dal do taki attach ho jaye and tail new node ho jaye
			tail.next = nn; //
			tail = nn; //tail jayega new node pe
			size++; //and size toh ++ hoga hi
		}
		
	}
	
	
//	0 base indexing hai. If k = 2 hai toh...ham chahte hai ki 2nd index ke node wala address return kare....
//	jo bhi index hai uska data nahi chahiye...address chahiye. Toh iska return type node hoga. Access modifier...private cuz hame LinkedList m use karna hai
//	sirf hame use karna hai isliye private bna rahe hai..
//	Iski time complexity O(n)
	private Node GetNode(int k) {
//		head ka address temp m yaad kar lete hai
		Node temp = head;
		for(int i = 0; i<k; i++) { //less than k tak chal rha hai
			temp = temp.next; //temp move ho rha har baar
		}
		return temp; //jo temp m hai wahi address return kar de...
	}


// print kar ke dekhte hai kaisa dikhta hai LinkedList
//	Head ko agr move karte rahe toh last m head null pe jayega toh linkedlist khtm ho jayegi...isliye temp ka use karte hai
// head ka jaisa data type hai waise hi ek variable temp bna lenge...usme head ka address rakh denge
// Toh ab temp null ho jayega...head null nahi hoga....
// Head jha pehle tha wahi rahega....
// And iski complexity ? jitne node utna print karna hai toh O(n)...
	public void Display() {
//		node temp m head ko save kar lenge
		Node temp = head;
//		yha address pe loop chal rha hai
		while(temp!= null) { //temp jab tak null nahi hai tab tak kuch kaam karna hai
			System.out.print(temp.val+"-->"); //arrow de diya so that acha lage dikhne m
			temp = temp.next;
		}
//		line change
		System.out.println(".");
	}


}
