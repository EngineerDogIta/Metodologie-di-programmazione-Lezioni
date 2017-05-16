package primo;
import secondo.*;

public class test6 {
	
	public static void main(String[] args) {
		// usa this e super per invocare i costruttori;
		// protected;
		
		Potenze p = new Potenze();
		System.out.println(p.allanona); // OK: attributo public!
		// System.out.println(p.alladecima); // ovviamente NO: attributo private!
		// System.out.println(p.allundicesima); // NO: attributo protected!
		
		PensieroStupendo ps = new PensieroStupendo();
		ps.stampapotenze(); // stampa anche alla undicesima
		
		C1 og = new C1(5);
		og.stampami(); // b è quello di default
		
		C1 og1 = new C1(7,9);
		// System.out.println(og1.a); // NO: attributo private!
		// System.out.println(og1.b); // OK: attributo protected ma sta nello stesso package!
		og1.stampami();
		
		C2 og2 = new C2(11,13,15);
		og2.stampami();
		
		C3 og3 = new C3(100,200,300);
		og3.blorg(); // this dinamico, super statico

	}
}