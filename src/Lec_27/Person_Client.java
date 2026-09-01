package Lec_27;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
//		Person class ka object bna toh sabse pehle constructor hi chalta hai 
		Person p = new Person(); //person class ka object bnaya. Object create karte time ek constructor call kar rahe hai...
		Person p1 = new Person("Raj", 25); //name and age isme paas kiya....
		p.name = "Hannu";
		p.age = 32;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p1.name);
		System.out.println(p1.age);
	}

}

// 2 points for constructor.....1st point is wrong....sabse pehle memory allocate hota hai then parsing then constructor chalta hai.
//1. Agr static chiz ko side rakh de toh....Person class ka object bna toh sabse pehle constructor hi chalta hai....
//constructor ka kaam hota hai class ke data member ko initialize karna jisme ham chahte hai uske upar




