package Lec_34;
// https://leetcode.com/problems/reverse-linked-list/description/
public class Reverse_Linked_List {
	
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
//		 Har iteration mein ek arrow reverse hota hai. यही poore algorithm ka core hai.
		class Solution {
		    public ListNode reverseList(ListNode head) {
//		     Starting mein koi previous node hai hi nahi.   
		    	ListNode prev = null; //previous ko null pe le lete hai
		    	ListNode curr = head; //head currently first node 10 ko point kar raha hai....toh curr bhi 10 ko point karega
//		    	jab tak current...null pe nahi jata tab tak...
//		    	Jab tak curr kisi valid Node ko point kar raha hai, tab tak reverse karte raho.
//		    	Jab curr == null ho jayega, matlab poori list process ho gayi.
		    	while(curr!=null) { //1st iteration ke baad... curr = 20...so condition is true
//		    		curr.next currently 20 ko point kar raha hai.
//		    		toh ab ahead 20 ko point kar rha hoga
		    		ListNode ahead = curr.next; //ek ahead naam ka pointer liya jise current ka next yaad kara liya
//		    		ab current ke next ko change kar do...hamne yaad toh kar hi liya hai curr.next ko ahead m
//		    		prev m null tha toh curr.next means 10.next...toh 10 ab null ko point karne lag jayega
		    		curr.next = prev; //current ke next m previous ka address dalo
//		    		curr 10 ko point kar rha tha....toh ab prev 10 ko point karne lag jayega
		    		prev = curr; //previous wha jayega jha current hai....
//		    		ahead 20 ko point kar rha tha....toh curr 20 ko point karega....
		    		curr = ahead; //current wha jayega jha ahead hai...
		    	}
//		    	current toh null ho chuka hau...jo previous tha ab wo hamara head banega
		    	return prev;
		    	
		    }
		}
}
