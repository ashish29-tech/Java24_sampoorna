package Lec_27;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
//		jab ham scanner class use karte the toh scanner ka variable bnate the...
//		ArrayList use karna tha ArrayList ka variable bnate the
//		Toh student class use kar rahe hai toh student ka bhi variable bnayenge...
//		class ka naam Student...fir variable name s...fir new student
//		Student class ka blueprint ayega heap memory m....and us blueprint m likha hoga..iske paas name variable, age variable hai and Intro_yourself ka method hai...
//		now main method load hoga and jvm sabse pehle ye niche new Student() wali line chalayega...and isse ek object create hoga...jisse heap memory m address allocate hoga let's suppose 2k...jisse ek name naam ka variable ayega...
//		object creation m data member ko space milta hai...object create hota hai mtlb class ke data memeber ko initialize/space milta heap memory m...now s naam ka variable stack m banega and usme 2k save ho jayega...
//		s yha reference variable hai..and is reference variable ka data type Student hai...non primitive data type hai
//		student class ka object pehli baar bana yha...tabhi static block chala 
		Student s = new Student(); //angular bracket joki scanner m ata tha yha nahi hai
//		jaise ArrayList m ll.add() toh add function call hota tha...scanner m sc.nextInt() toh nextInt() function ata tha...
//		waise hi yha bhi karenge
		System.out.println(s.name); //2k address m null tha toh null aa jayega
		System.out.println(s.age); // and isme 0
		s.Intro_yourSelf(); //isse method chalega...Intro_yousrSelf m jo bhi likha tha wo pura statement chal jayega..My name is...
//		s is reference variable....jis bhi reference variable ke sath . use kare toh uska address this keyword m ata hai
		s.name = "Babu"; 
		s.age = 18;
		s.Intro_yourSelf();
		
//		ek blueprint se ek hi ghar ban sakta hai ? no, we can make multiple...
//		ek aur object bnate hai
		Student s1 = new Student(); //Iske name and age m default value kya hogi ? null and 0 
		s1.name = "Shona";
		s1.age = 24;
		s1.Intro_yourSelf();//ab ye kisko introduce karega ? 
//		Intro_yourSelf toh ek baar likha hai Student.java m but chal upar m dono(s and s1) ke liye rha hai...
		
		s1.SayHey("Ashish"); //ye Ashish... Student m jo SayHey bnaya hai usme variable paas hoga
		
		s1.MentorName(); //object bina bnaye call kiya is class m..... student class se s1 object bna iske through MentorName ko call kiya
		Student.MentorName(); //ya class ke name ke through bhi call kar sakte hai.... student class m MentorName ka method hai use execute karna
	}

// left side m jo line no. likha hai uske left m click kare toh breakpoint lag jayega...s.Intro_yourSelf(); jha first time hai wha breakpoint laga denge
//	is breakpoint ke baad ham apni marji se code chalayenge....
//	then upar debug pe click karenge....toh s.Intro_yourSelf(); tak chalega and dikhega ki s m id aai hai and s pe click karenge toh we can see s m 0 hai and name null hai
//	now stepover means line aage chala do and step into means line ke andar dekhne ke liye ki execution kaise ho raha hai...
	
//	chala chala ke terminate ho jayega and upar right corner m debugger ke sath m ek icon hoga hover karne pe java likha hoga...uspe click karenge toh wapis java m aa jayenge...
	
//	java ne inbuilt keyword diya hai this
//	jis bhi reference variable pe .(dot) kar rahe toh...uska address this keyword m pass ho raha hai...
	
//	static block yha bhi bna sakte hai 
//	sabse pehle static block student client ka chalega....Hello chalne se bhi pehle
	static {
		System.out.println("Welcom to Student client Class");
	}
}
