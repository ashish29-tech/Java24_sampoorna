package Lec_34;

import java.util.LinkedList;
//Tere kaam ki baat:
//LinkedList ko Queue ki tarah use kar sakta hai.
//Queue<Integer> q = new LinkedList<>();
//Linked list ke nodes (ListNode) LeetCode mein usually khud handle karne padte hain; Java ki built-in LinkedList mein ListNode class nahi milti.
//Queue<Integer> q = new LinkedList<>();
//Queue → interface hai, jo define karta hai ki queue ka behaviour kya hoga.
//LinkedList → class hai, jo us behaviour ko implement karti hai.
//new LinkedList<>() → actual object banata hai.
//Ek line mein: Interface batata hai kya karna hai, aur class batati hai kaise karna hai.

// Java mein Queue interface hai, class nahi. Isliye tu new Queue<>() nahi likh sakta.
// Queue<Integer> q = new Queue<>();  // ❌ Error
//Lekin Java mein Queue use karne ke liye built-in classes hain jo Queue interface ko implement karti hain.
// Java m inuilt LinkedList hai par wo kabhi use nahi kar payenge question solve karne ke liye
// Jaise leetcode pe head node given hai question waise ayega interview m 
// Java ka LinkedList kaise use karte hai ? Ham generally Queue ka question use karne ke liye karte hai
// LinkedList ki help se stack and queue dono banta hai
public class LinkedList_Java {
	public static void main(String[] args) {
//	 	Ye Java wala hai
//		suppose integer ka linkedlist bna rahe hai 
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10); //ye add last ki trah kaam karega
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
//		add first karna ho toh...add first naam ka method hota hai
		ll.addFirst(90); //addFirst ki time complexity O(1)
//		addLast bhi O(1)
//		kisi index pe add karna ho toh kar sakte hai
		ll.add(1, -11); //index no. pass karenge and sath m value pass karo....O(N)
		System.out.println(ll); //print karenge toh dikhega ki element piche-piche add hote ja rahe hai
//		kya isme for each loop lag sakta hai ? Yess
		for(int val : ll) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println(ll.get(2)); // Index 2 ka element.... Time complexity: O(n)
		System.out.println(ll.getFirst());// First element...O(1)
		System.out.println(ll.getLast()); // Last element...O(1)
	}

}
