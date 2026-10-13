package Lec_34;

// Ye interview m ata hai ki agr linkedlist m cycle hai toh remove kar do else chor do
// Jaise cycle detection karaya tha waise hi...cycle ka removal kar rahe hai aaj
// Interview m tail pointer ka accessibility nahi
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
		cl.display();
	}
}
