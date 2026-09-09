package Lec_29;
// C extends P mtlb C class P class ki property ko access kar sakta hai 
// Child class Parent class ko inherit kar rha
public class C extends P{ // jp left m hoga autoamatically Child banega and right wala Parent banega but remeber sir C class ke liye
	int d = 2;
	int d2 = 20;
	
//	Ye Override likha toh isse koi developer dekhega toh samjhega...ye same naam ka method parent class m bhi hai
//	Ye na likhe toh bhi chalega but notation ke liye likh diya
	@Override 
	public void fun() {
		System.out.println("Fun in C");
	}
	
	public void fun2() {
		System.out.println("Fun2 in C");
	}
}
