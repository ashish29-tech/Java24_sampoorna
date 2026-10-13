package Lec_34;

// https://leetcode.com/problems/merge-two-sorted-lists/
// Waise hi karenge jaise merge 2 sorted array karte the..2 pointer lete the...ham tab tak chalate the jab tak element
// hota tha...jab element khtm hota tha toh alag se add karte the...
// 2 linked lists given hai...dono ko merge karna hai ek single linklist m...wo bhi sorted 
// hona chahiye array ki trah...and new linkedlist ka head return karna hai...
// In this problem, “splicing” means connecting the existing nodes together rather than
// creating new nodes.

// Aaj se 7-8 class baad karayenge...merge n no. of sorted linked lists...
// Merge n no. of sorted array....

// Approach
// 2 pointer lenge..i and j...ye dono linkedlists ke starting means head pe honge...
// 1 dummy node bna diya...jisme 0 hai and address m null hai...
// i and j linked lists m indexing ki hui hai...list1 = [1,2,4], list2 = [1,3,4]
// list 1 m indexing ki hui hai 1k, 2k, 4k.... i m 1k hai starting m
// suppose list2 m indexing ki hui hai...j pointer hai and indexing 10k, 3k, 40k ki hui hai...
// j m starting m 10k hai
// dummy node jisme 0 hai and address m null hai toh...null ki jgah list 2 ka 1st node ka addres 10k daal diya...
// 
public class Merge_Two_Sorted_Lists {

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
// Time complexity linear
	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//			sbse pehle 1 dummy node bnate hai...variable ka name Dummy
			ListNode Dummy = new ListNode(); 
//			Temp name ke variable m save kar lete hai
			ListNode temp = Dummy;
//			2 lists hai hamare paas
//			Dono lists null nahi hona chahiye...and null nai hai tab tak kaam karna hai
			while(list1!=null && list2!=null) {
//				pehle ek-ek kar ke data check karo
				if(list1.val<list2.val) { //list1 ki value list 2 ki value se choti hai toh
//					jo hamara dummy wala variable hai uske next m jiska data kam hai use add karenge
					Dummy.next = list1;
//					Dummy ko bhi aage badhayenge
					Dummy = Dummy.next;
//					jiska data add kiya hai wo bhi aage badhayenge
					list1 = list1.next;
				}
				else {
					Dummy.next = list2;
					Dummy = Dummy.next;
					list2 = list2.next;
				}
			}
//			Ho sakta hai koi bhi 1 linkedlist pehle khtm ho jaye
//			check karte hai
//			loop nahi lagega cuz chain created hai pehle se hame connection add kar dena hai
			if(list1!=null) {
				Dummy.next = list1;
			}
			if(list2!=null) {
				Dummy.next = list2;
			}
//			return kya karenge... temp m sabse pehle node m bekar hai toh uska next return karenge
			return temp.next;
		}
	}

}
