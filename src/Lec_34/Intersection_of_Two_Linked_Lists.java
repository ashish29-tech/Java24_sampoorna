package Lec_34;

public class Intersection_of_Two_Linked_Lists {
// https://leetcode.com/problems/intersection-of-two-linked-lists/description/
//	without length calculate karna ho toh kaise karenge ? O(n^2) jayegi iski time complexity
//	a1, a2 ..... and b1, b2 ....ye wale m 2 LinkedList hai....2 head hai a1 pe and b1 pe....
//	b1 ko temp m save kar liya.... while condition.... temp b!= null .....
//	temp a m head save kar lenge...now while(temp a!= null).... temp a ka address temp b se match kar gya...
//	toh hame intersection mil gya...else nahi mila toh temp a ko badhate chalenge...temp a.next kar ke...
//	Pehle b1 ko fix karenge...and a1 se c3 tak pura check karenge...intersection mila ki nahi
//	then b1 ko 1 aage badha ke b2 pe layenge and dobara a1 se c3 tak pura check karenge...
//	mtlb b wala loop outer m hoga and a wala loop outer m hoga....
//	But hame bina length nikale... O(n) m karna hai
		// TODO Auto-generated method stub
//		  Definition for singly-linked list.
		  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	// Below solution is by chatGPT... ye O(n^2) hai
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//	    	ye wala chatGPT ne diya hai code....O(n^2) 
//	    	Ye approach Monu bhaiya ne btya tha...
//	    	But hame bina length nikale karni hai
//	         ListNode tempB = headB;
//
//	        while (tempB != null) {
//
//	            ListNode tempA = headA;
//
//	            while (tempA != null) {
//
//	                if (tempA == tempB) {
//	                    return tempA;
//	                }
//
//	                tempA = tempA.next;
//	            }
//
//	            tempB = tempB.next;
//	        }
//
//	        return null;
	    	
//---------------------------------------------------------------------
//	    	Iski time complexity O(n) 
//	    	Agar dono lists ka size approximately n maan lo: O(n + n) = O(2n) = O(n)
//	    	Devansh and his virtual gf approach....
//	    	a1 and b1 wale example m.... b11 se chalega devansh and a1 se virtual gf chalegi
//	    	1-1 step dono chalte jayenge...a phoch jayegi...c3 pe and  b phochega...c2 pe
//	    	now jadu se b1 pe phoch jayegi virtual gf...and 1 step se c3 pe devansh phoch jayega...
//	    	now jadu se b1 pe devansh phochega and b1 se b2 pe gf phochegi
//	    	now dono 1-1 step aage chalenge...a1 se a2 pe and b2 se b3 pe...
//	    	then a2 se c1 pe and b3 se c1 pe...yha dono mil jayenge....
	    	
	    	ListNode Dev = headA; //Devansh apne ghar headA pe hai
	    	ListNode Dev_GF = headB; //Virtual GF apne ghar headB pe hai
//	    	tab tak dono move karenge jab tak mil nahi jate
	    	while(Dev!=Dev_GF) {
	    		if(Dev==null) { //agr devansh null pe chala gya toh
	    			Dev = headB; //devansh apne gf ke ghar chala jayega
	    		}
//	    		agr aisa nahi hai toh 1 step aage badh rahe hai
	    		else {
	    			Dev = Dev.next;
	    		}
//	    		same iski gf bhi karegi
//	    		agr gf null pe chali gyi hai toh
	    		if(Dev_GF == null) {
	    			Dev_GF = headA; //dev ke gf ko headA pe bhej de
	    		}
	    		else {
//	    			agr null pe nai gyi toh 1 step aage badhegi
	    			Dev_GF = Dev_GF.next; //
	    		}
	    	}
//	    	dono loop se bahar chale gaye mtlb dono jab address match kar gaye tabhi toh loop nahi chalega
	    	return Dev_GF; //koi bh ek return kar do...ya toh dev ya toh dev ki gf
	    }
	}

}
