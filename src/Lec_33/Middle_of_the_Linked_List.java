package Lec_33;

public class Middle_of_the_Linked_List {
//	https://leetcode.com/problems/middle-of-the-linked-list/description/
	public class ListNode {
		int val;
		ListNode next;
		
		ListNode(){
			
		}
		
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
//	time complexity O(n)
	class Solution {
		public ListNode middleNode(ListNode head) {
//			Pehle display wala loop laga ke size nikalna hai 
//			now size pta chal gya toh size/2 kar lenge..
//			then GetNode wala loop chala denge...size/2 times
//			Iska Time complexity O(n)
//			But interview m ata hai without length/size nikale bina btana hai
			
//			slow and fast pointer le lete hai
			ListNode slow = head;
			ListNode fast = head;
			while(fast!=null && fast.next!=null) {
				slow = slow.next; //slow 1 se aage badhega
				fast = fast.next.next; //fast 2 se aage badhega
			}
//			loop se bahar ana mtlb mid ka mil jana...
			return slow;
		}

	}
}
