package Lec_36;

// https://leetcode.com/problems/flip-equivalent-binary-trees/description/
// ctrl+f to remove stars..mentioned in the leetcode
public class Flip_Equivalent_Binary_Trees {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
		class Solution {
		    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
//		        3 base case toh as it is use karenge...
//		    	dono root ek sath null hai toh x...y ke barabar hai toh true 
//		    	ek null hai ek nai toh false...
//		    	data mismatch hai dono roots m toh bhi false
//		    	yha time complexity O(N) hai...har node pe ek-ek baar ja rahe hai
		    	if(root1 == null && root2 == null) {
		    		return true;
		    	}
		    	if(root1 == null || root2 == null) {
		    		return false;
		    	}
		    	if(root1.val != root2.val) {
		    		return false;
		    	}
//		    	Ab check karenge...agr root wali upar ki teeno base case satisfy kar jati hai toh aage
//		    	Is position pe 2 choices hai ya to mirror hoga ya equal hoga
//		    	Mirror ka check karenge...mtlb flip
//		    	pehle ka left and dusre ka right check karenge
//		    	left and right dono calls ko ek sath likh diya hai
		    	boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
//		    	ab equal ka check karenge
//		    	root1 ka left ko root2 ke left se...and root1 ke right ko root2 ke right se...
		    	boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
//		    	har point se mirror and equal dono check karna hai...har point se mirror ka ans
//		    	and har point se equal ka ans mangayenge and in dono ka or le lenge
//		    	ki dono m se koi bhi answer lake de dega...mtlb ya toh mirror hoga ya equal hoga
		    	return flip || noflip; 
		    }
		}
}
