package Lec_36;

public class LCA_Lowest_Common_Ancestor {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		 
		class Solution {
//			Time complexity O(N) cuz har node pe ek-ek baar ja rahe hai...and sar kaam constant hai
		    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { //suppose 7 and 4 ka dhundh rahe hai toh 7 and 4 pass kar diya
//		        base case
//		    	agr null pe chale gaye toh nahi mila
		    	if(root == null) {
		    		return null;
		    	}
//		    	address diya hai...value duplicate ho sakti hai. Address compare karna hai
//		    	root ka address kisi se bhi match kar gya....jisse bhi match karega usi ka address return 
		    	if(root == p || root == q) {
		    		return root;
		    	}
//		    	ham left wale ko kahenge...tu p and q m se kisi ko bhi dhundh ke lake dede
		    	TreeNode left = lowestCommonAncestor(root.left, p, q);
//		    	right wale ko bhi kahenge
		    	TreeNode right = lowestCommonAncestor(root.right, p, q);
//			    left m bhi ek address aya hai and right m bhi ek address aya hai...and dono null nahi hai
//			    toh us case m root return kar do...
		    	if(left!=null && right!=null) {
		    		return root;
		    	}
		    	else if(left==null) {
		    		return right;
		    	}
		    	else {
		    		return left;
		    	}
		    }
		    

		}
}
