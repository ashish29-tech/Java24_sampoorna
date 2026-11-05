package Lec_35;
import java.util.*;

public class Binary_Tree {
//	Jitne bhi questions kiye hai niche sabki complexity O(N) cuz har node pe ek-ek baar hi ja rahe hai.
//	10T20T40FFT50T60FFFT30FT70FF
//	10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
//	Just like LinkedList m node class hoti thi..usme ke data hota tha...
	class Node{
		int val;
		Node left;
		Node right;
	}
//	
	private Node root;
//	Niche create tree karna hai uske liye data chahiye hoga toh..input ke liye Scanner bna lete hai
//	Scanner jaruri hai cuz hame taki hame pta ho kon sa data input lu...use left m lagau ya right m
	Scanner sc = new Scanner(System.in);
//	ek binary tree ka constructor bna lete hai
	public Binary_Tree() {
//	jab constructor chalega toh indirectly CreateTree naam ka method chalega...toh 
//	pure tree ko create kar ke root m root ka address assign kar dega....
//	1st tree ke 1st node ka address assign kar dega...root pe
		root = CreateTree(); //Is ek line mein poora tree create ho raha hai.
	}
//	Iska kaam hai tree ko create karwa dena...create kara ke pehle noda ka jo pehle address hoga
//	use root pe assign kar denge....
//	Create tree karna hai toh tree ke andar input chahiye hoga..mtlb data chahiye hoga na
//	Just like recursion we need to first think about the 1st step.
//	Is method ka return type Node hai. Kyunki ye method ek node create karega aur uska address return karega.
	private Node CreateTree() {
//		sabse pehle wo input lo jo root banega mera
		int item = sc.nextInt();
//		Node bnao
		Node nn = new Node();
//		us node m data 10 rakh do
		nn.val = item;
//		Ab hame boolean input lena hai and hame puchna hai kya left and right child hai ya nahi
		boolean hlc = sc.nextBoolean();
//		agr left child exist karega...toh recursion ko kahenge
//		ek left branch create kar aur mere left m laga de
		if(hlc) { //Agar hai toh recursion se Left Subtree create karo
			nn.left = CreateTree(); //left branch ka call laga diya
		}
//		if right child hai
		boolean hrc = sc.nextBoolean();
//		if right child hai toh...
		if(hrc) {
//			create kar right treee and mere right m laga de
			nn.right = CreateTree();
		}
//		apna address return kar denge
		return nn; //10 yha se apna address return kar dega
		
	}
//	User ko root ka access dena hoga toh...aise karenge
//	private bna hua hai root upar and public bna nai sakte...
//	Toh solution ke liye
//	Ek public method bna liya and niche m Display private bna liya...niche wale private display ko is public display m call kar diya
//	User ko niche private Display dikhega hi nai...
//	private wala jo argument hoga wo public wale m se call hoga and client public wale method ko call karega
	public void Display() {
		Display(root); //yha pe niche jo Display bnaya hai use call kar denge....
	}
	
//	Display karenge tree
//	pehle root, fir left and then right child print
//	hame koi node paas karna padega....nn m root paas karenge cuz bina root ke tree pe 
//	traverse nai kar sakte
//	yha private kar denge
	private void Display(Node nn) { 
//		base case
//		nn null ke barabar ho gya ya jo bhi variable ka naam hoga wo null ke barabar ho gya toh return
		if(nn==null) {
			return;
		}
		
//		check register..ye arrow wgr string lake dega
//		Ek string m root ka data capture kar lete hai
//		nn.val se 10 milega...toh niche wali line se 10 ke left and right m arrow laga diya
		String s = "<--"+nn.val+"-->";
//		10 ka left child hai ya nahi ye dekhna hai
//		nn mtlb 1k(check register diagram)
//		1k pe hai toh check karna hai left null hai ya nai
//		nn.left!=null means left empty nahi hai wha ek address hai
//		toh data ko arrow se pehle lagana hai
//		nn.left karenge toh 2k milega and nn.left.val karenge toh 20 milega
		if(nn.left != null) {
			s = nn.left.val+s; //nn.left se 2k mila and 2k ka val kiya toh 20 mila...and s se pehle lagana hai
		}
//		null hai toh
		else {
			s = "." + s; //dot aa jayega
		}
//		same aise hi right ke liye karna hai 
		if(nn.right != null) {
			s = s + nn.right.val; //right wali chize string ke baad lagegis
		}
		else {
			s = s + ".";
		}
		System.out.println(s); //20<--10-->30 print ho jayega
//		ab recucrsion kaam karega...
//		left branch ko print kar de...toh .left
//		Pehle Left Subtree print hoga, phir Right Subtree.
//		Is traversal ko Preorder Traversal (NLR) kehte hain.
//		N = Node, L = Left, R = Right.
		Display(nn.left); //left branch ka address chala jayega... toh 40<--20-->50 print karega and .<--40-->. bhi
//		right branch ka address chala jayega...60<--50-->. then .<--60-->.  
//		then right ka chalega and null hai toh wapis...so finally 10 pe jayenge...
//		10 ka left chal chuka hai ab right chalega
//		toh .<--30-->70 ab 30 ke left ka call...null hai toh wapis and ab 30 ke right ka call lagega...70 ke left, right m koi nai hai toh null .<--70-->. 
		Display(nn.right);
	}
	
//	Binary tree ke andar max val/node kya hai ye pta karna hai
//	Tree m kuch bhi karna hoga uske liye root chahiye hoga
//	Jaise display ke liye kaam kiya hai waise hi kaam karenge
	public int max() { //user ise call karega and ye internally niche private wala call karega
		return max(root);
	}
//	jaise array m maximum nikalte the waise hi tree m bhi maximum nikalenge
//	jaise array m searching hota tha waise hi tree m bhi karenge
	private int max(Node nn) {
//		base case
//		
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		
//	   left subtree ka max pta kar lo and right subtree ka max pta kar lo and root ki value...
//		in teeno m se jo maximum hoga wo hamara answer hoga
//		ye left subtree ka max and right subtree ka max btana recursion kar ke dega
//		toh hamara kaam sirf hoga root ke value se compare karna
//		
//		agr recursion left max lake de dega
		int left_max = max(nn.left); //left ka address pass kar denge
		int right_max = max(nn.right); //right ka address pass kar denge
//		hamara kaam hoga in teen data ka max compare karna
//		hamar data and left and right m se jo max ayega usse comparison
		return Math.max(nn.val, Math.max(left_max, right_max)); 
		
	}
	
//	Tree m searching ke liye upar jaise method bnaya hai waise hi bnayenge
//	boolean type...ki true ya false...data hai ya nahi
//	user 45 bhejega toh ye wala method chalega and isme internally private search wala method chalega
	public boolean search(int item) { //jo data search karna hai wo paas kar denge
		return search(root, item);
	}
	
	private boolean search(Node nn, int item) {
//		pura array search kar liya and data nahi mila toh 
//		root se check karenge ki match kar rha hai ya nahi...agr nahi match kiya toh
//		left and right subtree bacha...in dono pe check karna hoga toh recursion se karwayenge
//		left or right m se kisi m se bhi true aya toh answer true 
//		jab dhundte duhundte null mil jaye toh mtlb nahi hai data
		if(nn==null) {
			return false;
		}
//		ham jha hai agr wahi value item ke barabar ho gyi toh
		if(nn.val==item) {
			return true;
		}
//		yha pe koi bhi call pehle laga sakte hai..left ya right...order matter nai karta yha
//		agr aisa nahi hai toh...left wale m mila kya
		boolean left = search(nn.left, item);
//		yha check bhi laga sakte hai ki agr left m mil gya toh wahi se return 
//		if(left) {
//			return left;
//		}
//		ya right wale m
		boolean right = search(nn.right, item);
//		agr upar check laga rahe hai toh yha sirf right return karenge or condition ki jarurat nai hai
		return left || right; //or kar ke check karenge
	}
	
//	Tree ki height
//	Single node hai tree m toh uski height 0 ya 1 ? Dono hi shi hai..depend karta hai ham kya maan ke chal rahe hai...
//	single node ki height ham 0 man ke chal rahe hai...
//	Left subtree and Right subtree ki height recursion se manga lenge and in dono ka max leke usme + 1(root node) kar denge toh height aa jayegi tree ki.
//	
	public int ht() {
		return ht(root);
	}
	
	private int ht(Node node) { //variable ka naam 'node'
		if(node == null) {
//			0 nai return kar sakte cuz...gpt kar ke read about this
//			jab single node ki height 1 lenge toh base case m return 0 kar sakte hai
			return -1; //single node ki height 0 le rahe hai toh -1 return karna padega 
		}
//		Recursion se Left Subtree aur Right Subtree ki height mangwa li.
		int lh = ht(node.left);
		int rh = ht(node.right);
//		left subtree and right subtree ka max return karenge and usme + 1 karenge toh tree ki height
		return Math.max(lh, rh)+1;
	}
//	we have 4 traversal: pre order, post order, In order, Level order
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
//		Tree traversal karna hai toh private bnayenge 
	private void PreOrder(Node nn) {
//		null pe chale gaye toh
		if(nn==null) {
			return;
		}
//		root print kar denge
		System.out.print(nn.val+" ");
//		left and right ka call lagayenge
		PreOrder(nn.left);
		PreOrder(nn.right);
	}
//	InOrder traversal
//	Left Root Right
//	Code likhte time print statement beech m rakh denge
	public void INOrder() {
		INOrder(root);
		System.out.println();
	}
	private void INOrder(Node nn) {
		if(nn == null) {
			return;
		}
		INOrder(nn.left);
		System.out.print(nn.val+" ");
		INOrder(nn.right);
	}
//	PostOrder traversal
//	Left Right Root
//	Recursive calls pehle and last m print statement
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	
	private void PostOrder(Node nn) {
		if(nn == null) {
			return;
		}
		
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");
	}
//	Level Order Traversal....we need data level by level
//	Data ko line m arrange karna hai and line m arrange karne ke liye we have Queue Data Structure
//	Tree m level order ka question aye toh first think about solving question using Queue.
//	Steps: Remove, print, left child add, right child add....do these steps until queue gets empty.
	public void levelOrder() {
//		Queue m node jaisa address dalna hai...and LinkedList ko new karenge cuz Queue interface hota hai.
		Queue<Node>q = new LinkedList<>();
//		queue m root ka address dal denge
		q.add(root); //add last karega
//		jab tak queue khali na ho
		while(!q.isEmpty()) {
//			sabse pehle ek node nikalenge
//			q.poll remove first karega jisse queue ka nature aa jayega...linkedlist ke andar
			Node n = q.poll(); //q.poll ya fir remove kar sakte hai....dono remove first hi karta hai
//			pehle ye node ka data print karo
			System.out.print(n.val+" ");
//			left m koi address hai toh check karo...mtlb null nai hona chahiye
			if(n.left!=null) {
//				nai hai null toh jo address rakha hai left m wo add kar do
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		System.out.println();
	}
}


























