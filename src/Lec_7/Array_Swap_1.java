package Lec_7;

public class Array_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 20, 30, 4, 7}; //hardoode kar ke array banana...isse 5 size ka array heap m banega and jo bhi address hoga wo arr stack m aake save ho jayega
//		int [] ar = new int [] {10, 20, 30, 4, 7}; //aise bhi initialise karte hai...
		System.out.println(arr[0]+ " " +arr[1]); //10, 20
//		System.out.println(arr[0] + arr[1]);
//		Method ko values pass hui hain, array nahi
		Swap(arr[0], arr[1]); //array ka 0th and 1st index ka content pass hua hai
		System.out.println(arr[0] + " " + arr[1]);
	}
	public static void Swap(int a, int b) { // and yha content aa gya...int a m 10 and int b m 20
//		yha changes toh hue hai but a and b naam ke local variable m hue hai ...na ki arr m 
//		Java me pass by value hota hai, isliye original array ke elements change nahi hote.
//		Java = always pass by value (even for arrays, reference ka value pass hota hai)
		int temp = a;
		a = b;
		b = temp;
	}

}

//Pass by Value kya hota hai?
//Jab kisi method ko variable bhejte ho, uski copy pass hoti hai (original nahi)
//👉 Java is always pass by value, but for objects/arrays, value = reference (address)