package Lec_29;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Base Class = Parent Class (also often called a Superclass)
//		Derived Class = Child Class (also often called a Subclass)
//		object bna rahe hai P class ka
//		P obj = new P();
//		obj. karenge toh we can see kai sare methods...hamne toh sirf P class ke liye object bnaya hai toh hame sirf usi ka data
//		obj.
//		member dikhna chahiye...baki jo data member dikh rahe hai wo kiska hai ? 
//		obj.
//		jab array print karte the toh aise hi address type ki chiz ati thi 
//		Now we want to know string m content kyo print hota tha....address kyo nai ata tha
//		Yha address kyo aa rha hai content kyo nahi aa rha...
//		System.out.println(obj); //print karne pe Lec_29.P@36baf30c ye aa raha hai but jab ArrayList ya String print karte the toh content ata tha
		
//		C obj = new C(); //C class ka object bnaya toh...
//		ab obj. karenge toh C and P dono dikh rha hai
//		obj.
//		Case 1....Ye toh normal hai isme koi inheritance ka concept nahi hai
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
//		
//		Case-2....Ye inheritance ka case hai kafi important
//		2nd case m alag-alag class ke data members access karna hai toh...
//		inheritance laga hai toh object typecast ho jayega...
//		object C ka ban raha hai...C...P ko inherit kar rha hai
//		Reference variable ka type P hai
//		Run time m object create ho rha hai C ka...jisse C class ke data member ko space milega...and P class ke data member ko bhi space mil rha hai...but run time object C ka create ho rha hai
//		P obj = new C(); //code likte hai toh compiler LHS side dekhta hai...obj ka data type kya hai ? P
////		code likhte waqt control compiler ke paas hai
//		System.out.println(obj.d); //P wala data member dikh rha hai
//		System.out.println(obj.d1); //P wala data member dikh rha hai
////		System.out.println(obj.d2); // c wala data member accssible nahi ho rha...to kaise karenge ? Typecase karenge
//		System.out.println(((C) obj).d2); //typecase kiya...obj ko typecast kar ke C bna diya
////		agr C class ka d wala method chahiye toh...
//		System.out.println(((C) obj).d);
//		
////		function
////		C ka chal rha hai...fun in p chalna chahiye tha. kyo ? variable ko typecast kar ke access kar sakte hai but method pe koi rule nahi hota...
////		Ye method overriding concept hai...
////		Runtime Polymorphism
////		jiska method bna hai uski priority hogi...wahi call hoga
//		obj.fun(); //kiska fun chalega P ka ya C ka ? 
//		obj.fun1();
////		obj.fun2(); //error dega toh typecast karenge
//		((C) obj).fun2();
		
//		Case 3
//		new P() se object banega...runtime m sirf P class ke data member allocate honge...
//		but compile time m object C ka bna hai toh ise P and C dono dikh rha hai
//		kya run time m C ka data member accessible hoga ? kya d2 accessible hoga runtime m ? No. 
//		C obj = new P(); //such type of object creation is not allowed in java
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		System.out.println(obj.d);
		
//		Case-4
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)obj).d); //Yha d...C ka access ho rha hai agr P ka chahiye toh typecast kar denge P m
//		fun
//		C ka chalega...
		obj.fun();
		obj.fun1(); //ye jiska(P ka) hai uska chalega
		obj.fun2();
		
//		In sabka ek father hai...Object class. Object class ko har koi inherit karta hai by default. Har class inherit karti hai.
		
	}

}
