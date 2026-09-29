package Lec_33;

public class LinkedList_Client {
// Ek LinkedList ka client bna lete hai...taki LinkedList wali file ko use kar paye
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddFirst(40);
		ll.AddFirst(50);
		ll.Display();
		ll.AddLast(8);
		ll.AddLast(7);
		ll.AddatIndex(-9, 2); //2nd index pe -9 aa jayega...
		ll.Display();
		System.out.println(ll.getatIndex(2));
		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());
		System.out.println(ll.removefirst());
		System.out.println(ll.removelast());
		System.out.println(ll.removeatIndex(2));
		ll.Display();
	}

}
