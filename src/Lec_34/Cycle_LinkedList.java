package Lec_34;

// Floyd cycle removal se kar sakte hai but pehle ye seekhna jaruri hai else nahi samajh ayega...
//
// Ye interview m ata hai ki agr linkedlist m cycle hai toh remove kar do else chor do
// Jaise cycle detection karaya tha waise hi...cycle ka removal kar rahe hai aaj
// Interview m tail pointer ka accessibility nahi hoga...
// Yha tail prerequisite ke liye liya hai jab interview m question ayega toh head ka address given hoga
// 
// cycle detection ke liye sabse pehle check karenge ki cycle hai ya nahi

public class Cycle_LinkedList {
	class Node {
		int val;
		Node next;
		
	}

//	node class bnai head, tail and size
	private Node head;
	private Node tail;
	private int size;

//	0(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
			
		}
		
	}

//	0(1)
	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void CreateCycle() throws Exception {
//		tail ke next m 2nd index ka node ka address get kar ke dal do
//		
		tail.next = getNode(2); 
	}

//	jo get index wala btaya tha ki particular index wala node chahiye
	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bhai k range m to dede");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
//	cycle detection 
//	Ye code lec-33 ke LinkedList_Cycle wala code se uthaya hai
//	iska return type Node kar diya
	public Node hasCycle() {  //yha arguments ki jarurat nahi hai cuz iske paas already head ka access hai
//		yha ListNode ki jgah Node cuz class ka naam hai Node
        Node slow = head; //class ka naam Node hai isliye Node
        Node fast = head; //class ka naam Node hai isliye Node
        while(fast!= null && fast.next!= null) {
        	slow = slow.next;
        	fast = fast.next.next;
//        	Agr cycle hai toh slow and fast kabhi na kabhi to milenge...
//	        Jab meet kar gaye slow and fast toh mtlb cycle hai
//        	yha address compare karenge...slow ka address...fast ke address ke barabar hai
        	if(slow==fast) {
        		return slow; //slow ya fast koi bhi address return kar sakte hai cuz dono ka address same hi hai
        	}
        }
//        loop se bahar aa gaye toh null...means slow and fast jis point pe mile wo null nahi hai
//        means cycle hai
        return null;
    }	
	
//	now cycle removal pe ate hai
//	Time complexity O(n^2) hai...
	public void CycleRemoval1() {
//		sabse pehle meeting point Node
		Node meet = hasCycle();
		if(meet == null) { //if meeting point hi null hai toh 
			return; //toh sidha return cuz cycle hai hi nahi
		}
//		refer register notes...slow and fast ka meeting point 
//		cycle m ghumenge and check karenge ki 0th index wala pointer mila ki nahi
//		mil gya toh thik wrna phir cycle m ghumenge and 1st index wala pointer dhundenge...
//		then again cycle m ghumenge and dhdundenge toh 2nd index wala pointer mil jayega...toh mtlb 0th index
//		se aage badhenge toh jo pehle node mil gya cycle m ghumenge toh...wahi cycle ka part banega
//		now cycle break kaise karna hai ?
//		cycle m ghumne ka code likhenge pehle....
//		slow and fast ka meeting point m agr ham dobara se aa gaye toh cycle complete...
//		is meeting point ko temp naam ke variable m yaad kar lete hai and loop tab tak chalana hai
//		jab tak temp ka next meet ke barabar nahi ho jata...meet ke barabar ho gya toh mtlb jaha the
//		wahi pe wapis aa gaye
//		node ke start m head le lenge
		Node start = head;
//		pehle loop...outer ka...jise cycle m dhundna hai
		while(start != null) {
//			temp m meeting point assign kar denge
			Node temp = meet;
//			ab cycle m ghumne ka code
//			cycle m tab tak ghumenge jab tak meeting point pe na phoch jaye
			while(temp.next!= meet) { //jab tak temp ka next meet ke barabar nahi hai tab tak ghumna hai cycle m
//				ek step pehle hi check karenge cuz cycle break karna hai
//				agr temp ka next start ke barabar aa gya toh break kar do
				if(temp.next == start) {
					temp.next = null;
//					and yahi se return kar jao
					return;
				}
//				agr nahi mila toh temp ko ek-ek kar ke aage badha denge
				temp = temp.next;
			}
//			agr is cycle se bahar aa gaye toh apne start ko aage badhayenge
//			mtlb wo node cycle m nahi mila toh aage badhayenge
			start = start.next;
			
		}

	}
//	iska naam CycleRemoval2 rakha 
//	Iski Time Complexity O(n) but this is not Floyd Cycle Removal algo...
//	CycleRemoval2() mein cycle ki length nikalne aur fast ko utna aage badhane ka main reason hai
//	cycle ke starting node ko find karna.
	public void CycleRemoval2() {
		Node meet = hasCycle();
//		cycle nahi hai toh kuch nahi karna hai
		if(meet == null) {
			return; 
		}
//		cycle hai toh kuch aage kaam karna hai
//		cycle ki length
		int m = 1; 
		Node temp = meet;
		while(temp.next != meet) {
			m++; //m ko aage badhana hai...8 pe ayenge toh count 2
			temp = temp.next; //temp ko 1-1 se aage badhana hai
		}
//		2nd step
//		fast ko m distance move kara do.... m 6 aya tha upar CycleRemoval2 se
//		Ek ko m chalana hai toh...
//		fast ko head se start karte hai
		Node fast = head;
		for(int i = 0; i<m; i++) {
			fast = fast.next;
		}
//		3rd step
//		slow and fast ko parallel chalao
		Node slow = head;
//		slow ka next and fast ka next ka address same nahi hona chahiye
		while(slow.next!=fast.next) {
			slow = slow.next; //slow ko ek se aage badhao
			fast = fast.next; //fast ko bhi ek se aage badhao
		}
//		loop se bahar aye toh
//		fast ke next ko null kar diya
		fast.next = null;
	}
	
//	Now floyd cycle removal ka algo
//	fast at the end meeting point pe phoch raha hai...
//	Hamare paas already meeting point hai toh kyo na wahi se direct start kiya jaye...
//	Floyd ki classic removal technique mein cycle ki length nikalna zaroori nahi hota.
//	1. slow ko head par reset karte hain.
//	2. fast ko meeting point par rehne dete hain.
//	3. Dono ko ek-ek step chalate hain.
//	4. Cycle ka starting node milne par uske previous node ka next = null kar dete hain.
	public void floyd_Cycle_Removal() {
		Node meet = hasCycle();
		if(meet == null) {
			return; 
		}
		Node fast = meet;
		Node slow = head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	

//	Main method bnaya and 8 element linkedlist ke andar add kar diye
	public static void main(String[] args) throws Exception {
		Cycle_LinkedList cl = new Cycle_LinkedList();
		cl.AddLast(10);
		cl.AddLast(20);
		cl.AddLast(30);
		cl.AddLast(40);
		cl.AddLast(50);
		cl.AddLast(60);
		cl.AddLast(70);
		cl.AddLast(80);
		cl.CreateCycle(); //cycle hai toh call kiya toh infinite time chalta rahega
//		cycle removal ko call kiya
//		cl.CycleRemoval1();
//		cl.CycleRemoval2();
		cl.floyd_Cycle_Removal();
		cl.display();
	}
}
