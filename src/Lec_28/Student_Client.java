package Lec_28;

public class Student_Client {

	public static void main(String[] args) throws Exception{ //main ke through calling ho raha hai toh main sambhalega...main ko kisne call kiya tha jvm ne 
		// TODO Auto-generated method stub
		Student s = new Student("Raj", 24, 19); //Object bna liya new keyword ki help se....memory allocate hoga toh name null and age, roll no dono 0 honge...
//		we want koi bhi ulta pulta data na fill kar de like age 450, roll no. -ve
//		we want class ke data members...name and age ko koi directly access na kare cuz karega toh kuch bhi change kar sakta hai
//		So here comes access modifier ka concept
//		4 tarike ka access modifier: public, private, protected, default
//		public likhne se kisi bhi package, file m accessible hai 
//		private likhne se us class se bahar accessible nahi hongi
//		Default and protected se same package m data ko dekh sakte hai...
//		s.roll = -1; //now this is not visible cuz we made it private in Student class m
//		s.age = 910;//now this is not visible cuz we made it private in Student class m
//		Yahi se picture m encapsulation ata hai...
//		Encapsulation: Agr data ko hide kar diya...toh encapuslation ek method provide karta hai jisse data ko get kar sakte hai and update kar sakte hai
		
		System.out.println("Hey");
//		roll no. +ve ho ya -ve ye matter nahi karega yha error show karega cuz Student class m Exception generate kar diya and yha upar m main call kar rha hai toh yha s.setRoll(19) m error show karega iske liye upar m main ke paas throws Exception laga denge
//		s.setRoll(19);
//		s.setRoll(-19); //ye line problematic hai but kuch red ya kuch nahi hai toh yha se ham padhenge exception handling....error and exception
		System.out.println(s.getRoll());
		s.setAge(-9);
		System.out.println(s.getAge());
		System.out.println("Bye");
	}

}

// Error and Exception dono java ke andar class hai...means non primitive data type hai...
// Error aisi chiz hai jise kabhi shi nai kar sakte...exception ko handle kiya ja sakta hai 





