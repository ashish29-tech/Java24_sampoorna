package Lec_27;
//import java.util.ArrayList;

		// TODO Auto-generated method stub
// We all have used ArrayList. Kya ArrayList ke andar main method tha ? No. 
//	Ye ArrayList inbuild class hai java ki kya isme kahi main method hai ? No
//	Ye ArrayList main method nahi toh ise ham run nahi kar sakte but use kar sakte hai...
//	Program ko run karne ke liye public static void main toh chahiye...
//	Run nahi kar sakte....But is class ko Use kar sakte hai variable bna ke....

//	public static void main(String[] args) {
//		ArrayList<Integer> ll = new ArrayList<>();
//	} 
//	-------------------------------------------------------------------------------
	
//	Is student class ko use kar sakte hai run nahi kar sakte...cuz main isme ham likhenge hi nahi
//	student class, ArrayList class....
	public class Student {
//	class ke andar kam se kam chiz rakhenge...MVP
//	class ek tarike ka blueprint hai...is class m ham wo sari chize rakhenge...jab actual m banaye toh wo sari chize isme present ho...
//	jo is blueprint se chiz ready hui that is called object....
		
//		string name and int age ye class ke data member hai
		String name;
		int age;
//		student apne aap ko introduce karega toh uske liye ek method bna lete hai Intro_yourSelf
//		ye method ko class ka member function...ya class ka function kehte
		public void Intro_yourSelf() { //yha static nahi likha
//		static kyo nahi likha ? static tab lagate hai jab blueprint ek object ke liye bna ho...for ex: power log n wala logic jo karwaya tha use sirf wahi use kar rha tha koi aur nahi...wahi tak limited tha
//		Bina static ke aisa ban gya jaise multiple objects ke sath associated hai...toh ise static nahi bna sakte...
//	    Do remember leetcode example... non-static field m static call ho sakta hai but static field m non-static call nahi hoga....
			
			
//			System.out.println("My name is " + name + " and age is " + age);
			System.out.println("My name is " + this.name + " and age is " + age); //class ke data member ko use karna hai toh this se karna chahiye
		}
		
		public void SayHey(String name) { //Ashish is name naam ke variable m jayega
//			Ashish print hoga cuz...ye function ke local variable ko access kar raha hai...class ke data member ko nahi....
//			System.out.println(name + " say Hey " + name); //class ka data member and local variable dono same naam ke hai....toh kya print hoga ?
			System.out.println(this.name + " say Hey " + name); //function ka local variable and class ka data member same naam ka hai toh this keyword ke through class ke data member ko access karenge...local wala without this use hoga
		}
		
//		Har object ke liye common answer de toh static field bnao....
//		Ise object bna ke bhi call kar sakte hai and bina object bnaye bhi call kar sakte hai...student.client m
		public static void MentorName() {
			
			System.out.println("Monu Bhaiya");
		}
//		-------------------------------------------------------------------------
//		Purpose of static block ? Ham chahte hai jab bhi 1st time class ko koi run kare toh ye automatic run hona chahiye.... 
//		class ka object banne ke baad sabse pehle static block chala
		static { //ye static block...function ke jaisa hi hota hai. Ek class m kitne  static block ban sakte hai ? jitne marzi
			System.out.println("Welcome to Student Class");
		}
		static {
			System.out.println("Bye to Student Class");
		}

}
