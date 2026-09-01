package Lec_27;

public class Person {
	
	String name = "Kaju"; //variable initialze
	int age = 91; //variable initialize
	
//	constructor ek tarike ka function hota hai jiska wahi naam hota hai jo class ka naam hota hai
//	Iska koi return type nahi hota
	public Person() { //person yha constructor ka naam hai
		
	}
//	different parameter ke sath bhi constructor bna sakte hai....
	public Person(String name, int age) {
//		name = name; //isme raj nahi ayega....❌ nahi hoga...cuz function ka local variable and class ka data member dono same naam ke hai ? 
//		age = age; //isme age bhi 25 nahi hoga....❌
		
//		toh yha this keyword ke according karna padega....
//		function ka local variable and class ka data member dono same naam ke hai...toh this keyaword ke throgh karna padega tab jake ye variable class ke data member m jayega
		this.name = name;
		this.age = age;
	}
//	public Person(String name) {
//		
//	}
//	public Person(int age) {
//		
//	}
}
