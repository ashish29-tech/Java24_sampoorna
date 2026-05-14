package Lec_14;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s + 10 + 40 + "bye"); //string m koi bhi data type(int,char,boolean,float,double,long) add kare toh use string ki trah lega...
		System.out.println(10 + 40 + s + "bye"); //pehle int + int hoga
		System.out.println(s + (10+40) + "bye"); //evaluate hoga bracket
//		string ki length
//		yha .length ke sath() laga hai toh ye method hai..
		System.out.println(s.length()); //string ka naam .(dot) length se string ki length
//		array m bhi length hoti hai and string m bhi toh dono m difference kya hota hai ?
		int [] arr = new int[4];
		System.out.println(arr.length); //yha bracket nai laga hai but string m .length() m bracket laga hai...yha array class m ek variable hai length
//		string ke kisi index ka character janna ho toh...
//		string pe 0 based indexing hoti hai
		System.out.println(s.charAt(2));
	}	

}
