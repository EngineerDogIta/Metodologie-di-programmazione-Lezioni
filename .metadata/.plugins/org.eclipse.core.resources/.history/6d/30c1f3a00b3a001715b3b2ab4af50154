package wildcard;
import sottotipo.*;

public class WildTest {
	
	public void pippo (Gen<? extends C2> x) {
		// gli si può passare un Gen<T> per qualunque sottotipo T di C2;
		
		System.out.println("estendo, dunque funziono!");
	}
	
	public void pluto (Gen<? super C2> x) {
		// gli si può passare un Gen<T> per qualunque supertipo T di C2;
		
		System.out.println("sono super, dunque funziono!");
	}
	
	public static void main(String[] args) {
		// test wildcard

		// ? y; // "?" non e' un tipo! 
		Gen<?> x;
		// x = new Gen<?>(); // non si puo' istanziare Gen<?>
		x = new Gen<String>(); // Gen<String> e' sottotipo di Gen<?>
		
		x.stampaGnat();
		// x.stampa("verde");
		 /* il compilatore non sa che tipo di oggetto c'e' in x,
		 * percio' non sa dire se esiste un metodo stampa (String)
		 */
		
		x.stampa(null); // ...pero' questo si puo' fare. Bah!!
		
		Gen<C1> y = new Gen<C1>();
		Gen<C2> z = new Gen<C2>();
		Gen<C3> w = new Gen<C3>();
		WildTest t = new WildTest();
		
		// t.pippo(y); // C1 non e' sottotipo di C2
		t.pippo(z);
		t.pippo(w);
		
		t.pluto(y);
		t.pluto(z);
		// t.pluto(w); // C3 non e' supertipo di C2
	}

}
