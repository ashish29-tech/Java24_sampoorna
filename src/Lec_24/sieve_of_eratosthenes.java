package Lec_24;

public class sieve_of_eratosthenes {
//	https://leetcode.com/problems/count-primes/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Maan ke chal rahe ki agr 100 tak ka prime no. chahiye....leetcode pe phir 100 se pehle tak ka chahiye hoga
		int n = 120;
		System.out.println(PrimeSieve(n));
	}
	public static int PrimeSieve(int n) {
//		integer ka array bnate hai
//		1D array le lete hai jo n size ya n + 1 size ka hoga wo hame decide karna hai means n include karna hai ki nahi karna
//		n include karna hai toh n + 1 size ka bna lenge...
		int [] prime = new int [n+1];
//		jis cell pe 0 hai wo index as a prime treat hoga
//		and jis index no. pe 1 hai wo index not prime hoga
//		Hame 0 se leke 120 tak ka prime chahiye so hamne kya kiya 1 array bna liya integer ka...by default entire cell 0 fill hoga...means sare index prime number hai. 
//		by default har jagah 0 hai...means sare index prime hai.
//		We all know 0 and 1 not prime hota hai...toh dono cell pe 1 rakh denge
		prime [0] = 1; //means ye index not prime number hai
		prime [1] = 1; //means ye index not prime number hai
//		Maan rahe hai agr 2 prime hai toh 2 ke multiple prime ho sakte hai ? no toh sabpe toh 2 ke jitne bhi multiple hai un sare cell pe loop laga ke 1 rakh denge....cut kar denge
//		toh agr total no. n the toh hamne kitne no. cut/hta ke cell pe 1 rakha...n/2
//		next 3 ke jitne bhi multiples honge wo not prime...is baar n/3 no. cut kiye
//		4 ke toh cut hi gaye cuz 2 ka cut kiya hai toh...
//		waise hi 5 ke cut kiye....means 1 rakh diya...toh is baar n/5 cut kiye
//		6 ke toh 3 se cut ho gaye honge...7 ke liye n/7 cut
//		8, 9, 10 sab cut chuke honge...now 11. But 11 ke liye nahi karenge cuz 11 * 11 = 121 but our element is 120.
//		toh 120 ka 1 factor kahi na kahi 11 se pehle mil chuka hoga agr ye prime no. nahi hoga toh...toh kab tak katenge ? sqr root tak...120 ke aage nahi jayenge ham...agr 120 ko katna hoga toh apne sqr root tak cut chuka hoga
//		agr nahi kata toh prime no. hoga. 
//		time complexity: n/2, n/3, n/5, n/7 inhe sare operation ka sum hi toh time complexity hoga.
//		toh 2 se start karenge and sqr root tak jana hai
		 for(int i = 2; i * i < prime.length; i++) {
//			 usi pe jayenge jispe 0 rakha ho. Jo prime hoga usi ke multiple ko fill karna hai not prime.
			 if(prime[i]==0) { //ye prime hai iske sare multiple banenge not prime
				 for(int j = 2; i * j < prime.length; j++) { //kisi ith no. ka table read karna hai tab tak jab tak range m na ho
					 prime[i*j] = 1; //un sab jagah pe 
				 }
				 
			 }
		 }
//		 count kar lete hai
		 int c = 0;
		 for(int i = 0; i < prime.length; i++) { //count ka loop bhi n time chalega
			 if(prime[i]==0) { //i prime no. hai
				 c++; //i ko hi ++ kar denge cuz wo prime no. hai
			 }
		 }
		 return c;
	}
}
