package Lec_34;

public class Sort_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode sortList(ListNode head) {
//			base case
//			ya toh linkedList khtm ho chuka ho ya fir ek hi node hoga toh head ka next null hoga
			if(head == null || head.next==null) {
//				jo hoga as it is wahi return kar denge...single node hoga toh single node wrna kuch nahi bacha hoga toh kuch nahi
				return head;
			}
			
			ListNode mid = middleNode(head); //mid aa jayega
//			connection break karna hai
//			7,5,3,4,2 m 3 mid hai toh 4 mid ka next hoga 
//			mid ka next head b banega
			ListNode headb = mid.next; 
//			upar mid ke next ko yaad kar liya and ab
//			mid ke next m null rakh dete hai connection break karne ke liye
			mid.next = null;
//			dono head ke liye sort function ko call kar lenge
//			dono apne apne start lake de denge
//			dono apne apne linkedList ka start de denge
			ListNode a = sortList(head); //head a ko call kiya...ye pehle wale ko sort kar ke dega
			ListNode b = sortList(headb); //headb ko call kiya...ye dusra wale ko sort kar ke dega
			return(mergeTwoLists(a,b)); //yha merge kar liya
		}
//		merge two sorted list wala code copy paste kiya
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while(list1 != null && list2 != null) {
				if(list1.val < list2.val) {
					Dummy.next = list1;
					Dummy = Dummy.next;
					list1 = list1.next;
				}
				else {
					Dummy.next = list2;
					Dummy = Dummy.next;
					list2 = list2.next;
				}
			}
			if(list1 != null) {
				Dummy.next = list1;
			}
			if(list2 != null) {
				Dummy.next = list2;
			}
			return temp.next;
		}
		
//		Middle of the LinkedList ka code copy paste kar diya lec-33 se
		public ListNode middleNode(ListNode head) {
			ListNode slow = head; //head rakh diya slow pe
			ListNode fast = head; //dusra head rakh diya fast pe
//			ye 2nd mid ka code lake deta hai... 2,3,4,1,5,7 m 1 lake dega
//			then 2,3,4,1 ek traf and 5,7 ek traf 
//			then 2,3,4,1 m mid 4 ayega toh 2,3,4 ek traf and 1 ek traf
//			then 2,3,4 m 3 mid ayega toh 2,3 ek traf and 1 ek traf
//			now yha phir se 2,3 m mid 3 ayega toh 2,3 ek traf
//			yha problem reduce nahi ho rahi
//			and aise hota jayega and stack overflow ho jayega
			
//			Toh yha ham even ke case m pehle mid kaise nikala jaye wo kar rahe hai
//			ek step pehle code ko rokna hai even ke case m
//			fast!=null hame ye wali condition change karni hai ye even ke case ki condition hai
//			fast ka next ka next is not equal to null...taki 1 step pehle rok de
//			pehle odd likhenge && laga ke even ka likhenge
//			order aise hi rakhna hai...cuz odd and even toh hame nai pta...
//			agr odd wala hua and fast.next.next != null hamne pehle ye check kar liya toh agr fast ka next hi null hai and fast.next.next toh null pointer ho jayega
			while (fast.next!=null && fast.next.next != null) { //fast.next!=null ye slow ki condition hai
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}
}
