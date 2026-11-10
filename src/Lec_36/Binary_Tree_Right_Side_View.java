package Lec_36;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-right-side-view/
public class Binary_Tree_Right_Side_View {
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
//		 
//	 1 call right ka
//	 1 call left ka
//	 1 call current level ka hoga
//	 1 maximum depth hoga
//	 Ans tabhi print hoga jab.... maximum depth < current level
//	 cuz jis depth tak hamne cover kar liya hai us depth ke niche pehli baar koi
//	 node pehli baar mila hai tab use right view m leke ayenge
		class Solution {
//			maximum depth ka track rakhte hai...
			int max_depth = 0;
//			ek list bna ke isme list bhi pass karna hai 
		    public List<Integer> rightSideView(TreeNode root) {
		    	List<Integer> ll = new ArrayList<>();
		        rightView(root, 1,ll); //level 1 se start karte hai
//		        yha se list ko return kar denge
		        return ll;
		    }
		    
		    public void rightView(TreeNode root, int curr_level, List<Integer> ll) { //current level bhej dete hai
//		        base case
		    	if(root == null) {
		    		return; 
		    	}
//		    	ye condition satisfy hogi tabhi kuch karenge
		    	if(max_depth<curr_level) {
//		    		jo bhi root ka data hoga use add kar denge
		    		ll.add(root.val);
//		    		maximum depth ko update kar denge
		    		max_depth = curr_level;
		    	}
//		    	agr upar wali condition nai satisfy hoti toh 
//		    	2 call lagayenge...
//		    	agr left view chahiye hota toh niche ki calls ko upar niche kar dete...left wali call pehle laga dete
		    	rightView(root.right, curr_level+1, ll);
		    	rightView(root.left, curr_level+1, ll);
		    	
		    }
		}
}
