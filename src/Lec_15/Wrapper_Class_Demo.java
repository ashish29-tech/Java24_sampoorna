package Lec_15;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer is a class. 
//		Integer object banta hai. Object heap m store hota hai. 
//		'a' reference stack m hota hai. 
//		Heap memory m non-primitive data banta hai.
		Integer a = 10; //
		int a1 = 10; //a1 variable hai toh stack m banega. Primitive stack m banta hai.
		System.out.println(a); //isse 10 aa rha hai 
		System.out.println(a1); //isse bhi 10 aa rha hai...
//		Long l = 77; //Error show karega....type mismatch..cannot convert in to long. cuz ye integer hai ise long class m rakh rahe hai. Long wrapper class hai yha..
		Long l = 77L; // long use karenge toh L likhna padega
//		777 is a int literal. By default Java me: integer literal ka type = int
//		 variable is long...so internally int value -> automatically long me convert....
//		This is called: Widening Type Conversion. Because:long size > int size 
		long L1 = 777; //777 iska type kya hota hai ? Integer. literal ka type integer hota hai data type m.
		long L2 = 77777999667675L; //bada 9 digit se upar ka no. rakhenge toh error ayega...toh l lga ke typecase kar dete hai..literal ka..ise long bna denge.
//		stack se utha ke heap m rakh rahe hai toh autoboxing.
		a = a1; //Primitive data ko non-primitive m convert karte hai toh ise kehte hai autoboxing. 
		l = L1; //autoboxing ho rahi hai...
//		unBoxing
		Integer x = 8990;
		int y = 789; 
		y = x; //heap ka content utha ke stack m dalenge...toh y ko print karenge toh we will call it unBoxing
		System.out.println(y);
//		Stack ka content heap m ja rha ho toh autoBoxing. And jab Heap ka content Stack m ja rha ho toh..unBoxing.
		
//		ham yha double ko float class m rakh rahe hai isliye error de rha hai. Agr thik karna hai toh f lagana padega
//		Float f = 82.9; //error dega cuz literal ka type double hota hai..toh double ke corresponding toh alag hota hai na uska non-primitive.
		Float f = 82.9f; //Yha f laga diya toh thik ho gya...
		Double d = 3.38; //double class m rakhna hai toh koi dikkat hi nahi hai...
		
		
		Integer b1 = 10;
		Integer b2 = 10;
		Integer b3 = 190;
		Integer b4 = 190;
		System.out.println(b1==b2); //true
		System.out.println(b3==b4); //false
		
		Boolean c1 = true;
		Boolean c2 = true;
		System.out.println(c1==c2); //true. Means dono same address pe ban rahe hai.
		
		Character ch1 = 'a';
		Character ch2 = 'a';
		System.out.println(ch1==ch2); //true. cuz range m hai...byte wali range m hai.
		
		Character ch3 = '€';
		Character ch4 = '€';
		System.out.println(ch3==ch4); //ASCII value 127 se upar hai toh false
		System.out.println((int) ('€')); //ASCII value print...
		
		Character ch5 = 'ÿ';
		Character ch6 = 'ÿ';
		System.out.println(ch5==ch6); //ASCII value 127 se upar hai toh false
		System.out.println((int) ('ÿ'));
		
//		Character m 127 ke baad duplicate ayega...boolean m true false always shi mana jayega...
//		baki charo data type int,short, byte, long...inme -128 to 127 ka data hoga toh true isse upar ka toh false.
//		float and double m aisa koi concept hota nahi hai.
	}

}
