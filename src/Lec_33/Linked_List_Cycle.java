package Lec_33;

//🧠 Shortcut
//Tail → Head = Circular ......Tail ka next m head hai toh circular LinkedList
//Tail → Any previous node = Cyclic .....Tail ke next m koi bhi previous node hai toh cyclic LinkedList
//Tail → null = Normal ....Tail ne next m null hai toh no cycle
// Floyd cycle Detection algorithm or Tortoise and Hare algorithm
public class Linked_List_Cycle {
//https://leetcode.com/problems/linked-list-cycle/description/
//	Ek tarika hai middle node nikalte hai...agr fast null pe chala gya toh mtlb loop se bahar aa gaye...toh cycle nahi hai
//	Loop se bahar aa gaye mtlb cycle nahi hai....cycle hogi toh loop se bahar aa hi nahi sakte
	
	  class ListNode {
		      int val; 
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
//	  Interviewer asks this to prove....ki ye thinking kaise develop ki 
//	  maine socha ki kya main do pointers use karke cycle ko detect kar sakta hoon?
//	  Ek pointer ko 1 step aur doosre ko 2 steps se move karaya. Agar linked list mein cycle nahi hai, toh fast pointer eventually null 
//	  tak pahunch jayega.
//	  Lekin agar cycle hai, toh dono pointers cycle ke andar aa jayenge. Cycle ke andar fast pointer slow se har iteration mein relative
//	  1 step close hota jayega, isliye eventually dono same node par milenge.
		public class Solution {
		    public boolean hasCycle(ListNode head) {
		        ListNode slow = head;
		        ListNode fast = head;
		        while(fast!= null && fast.next!= null) {
		        	slow = slow.next;
		        	fast = fast.next.next;
//		        	Agr cycle hai toh slow and fast kabhi na kabhi to milenge...
//			        Jab meet kar gaye slow and fast toh mtlb cycle hai
//		        	yha address compare karenge...slow ka address...fast ke address ke barabar hai
		        	if(slow==fast) {
		        		return true;
		        	}
		        }
		        return false; //cycle nahi hai toh false
		    }
		}
}
