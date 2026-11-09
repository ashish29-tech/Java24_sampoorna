package Lec_36;

//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
public class Sum_Root_to_Leaf_Numbers {
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
		 
		//  jaise lexico counting padha tha waise hi
		class Solution {
		    public int sumNumbers(TreeNode root) {
//		    	yha se call karte hai number 
		    	return Numbers(root, 0);
		        
		    }
//		    Time complexity O(N) hai...sara kaam constant hai...har node pe 1-1 baar ja rahe hai
		    public int Numbers(TreeNode root, int sum) { //yha se sum bhej dete hai....4,0 gya yha se
//		        ek aur base case hoga
//		    	agr root ki value null hai 
		    	if(root == null) {
		    		return 0;
		    	}
//		    	path kha complete hoga ? leaf node pe...toh uski condition laga denge
		    	if(root.left == null && root.right == null) {
//		    		isme jo bhi sum bna hoga usme path data ko add kar denge
		    		return sum*10+root.val; //sum * 10 + root ka data
		    	}
		    	
//		    	Number ko kahenge..left ka call lagao...and sum m lexico counting...
//		    	int left = Numbers(9, 0 * 10 + 4);...mtlb Numbers(9, 4);
		    	int left = Numbers(root.left, sum*10+root.val);
//		    	right wale ko kahenge tu bhi ek number lake de
		    	int right = Numbers(root.right, sum*10+root.val);
		    	return left + right;
		    }
		}
}













