package Lec_35;
import java.util.*;

public class Binary_Tree {
//	10T20T40FFT50T60FFFT30FT70FF
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
		root = CreateTree();
	}
//	Iska kaam hai tree ko create karwa dena...create kara ke pehle noda ka jo pehle address hoga
//	use root pe assign kar denge....
//	Create tree karna hai toh tree ke andar input chahiye hoga..mtlb data chahiye hoga na
//	Just like recursion we need to first think about the 1st step.
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
		if(hlc) {
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
		Display(nn.left); //left branch ka address chala jayega... toh 40<--20-->50 print karega and .<--40-->. bhi
//		right branch ka address chala jayega...60<--50-->. then .<--60-->.  
//		then right ka chalega and null hai toh wapis...so finally 10 pe jayenge...
//		10 ka left chal chuka hai ab right chalega
//		toh .<--30-->70 ab 30 ke left ka call...null hai toh wapis and ab 30 ke right ka call lagega...70 ke left, right m koi nai hai toh null .<--70-->. 
		Display(nn.right);
	}
}



























