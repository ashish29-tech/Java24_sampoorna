package Lec_14;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String class hai toh capital name
//		String java m class hai toh heap memory m banega...
//		Heap memory m area hota hai which we call string pool...usme hello naam ki string banegi...kisi 2k location
		String s1 = "Hello"; //springpool m banega...hello kisi 2k location pe
		String s2 = "Hello"; //stringpool m isi naam se pehle string bana hua hai ? yess toh new nai banega...toh duplicate nai banega...toh s2 m bhi same address 2k rahega...
		String s3 = new String ("Hello"); //jab new keyword use karte hai toh stringpool m nai banta...is pool se bahar banta hai...banega heap m hi...
		String s4 = new String ("Hello"); //ye bhi heap m banega but pool se bahar...kisi 4k location pe...so new keyword se banate hai toh duplicate string banta hai...without new duplicate nai banta hai...
		
//		ata address hai but print karenge toh content print hoga
//		overriding concept hota hai...string ne toString method ko apne andar override kar rakha hai is wjah se content print ho rha hai...address nai ho rha print
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
//		primitive data m ==(double equal to) content compare karta hai...int, float, double, long m ==(double equal to) content compare karta hai
//		yha non-primitive data hai toh address compare hoga
		System.out.println(s1==s2); // same address hai s1 and s2 m isliye true
		System.out.println(s1==s3 ); // same address nahi hai isliye false
		System.out.println(s3==s4); // same address nahi hai isliye false
		
		s1 = s1 + "Bye"; //jab bhi koi chiz string m concatinate hota hai...toh ye pool m bane ya pool se bahar... toh uska new copy banta hai heap m and usme jake bye add hoga...now s1 m update hoke 12k location 
		System.out.println(s1);
		
		
//		Java me String immutable hoti hai. Ek baar string object ban gaya, uske baad uska content change nahi ho sakta.
//		change hoga...but same location pe nahi hoga..jab bhi change karenge toh uska copy banega alag location pe change hoga...
		String str = "Ashish";
		str.concat(" World");
		System.out.println(str); //Hello
	
//		chahe user input le..chahe + sign...kare ya koi bhi opearation kare toh heap m hi banega
		
		String s = "Coding"+"Blocks"; //yha literal tarike/hard code kar ke likhte/add karte hai toh...is case m bhi pool m banta hai..and 1 case upar s1 and s2 m ho gya...iske alawa sare cases m heap m banta hai...
		s4 = s4.concat("Hey"); //add karta hai 2 string ko...
		System.out.println(s4);
		System.out.println(s);
	}
	

}
