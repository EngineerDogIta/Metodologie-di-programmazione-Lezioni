
public class testVariabili {

	public static boolean confrontaVariabili(IntVar x, IntVar y) {
		// esegue un semplice test su due variabili intere
		
		x.scrivi(7);
		y.scrivi(7);
		return x.leggi() == y.leggi();
	}
	
	public static void main(String[] args) {
		// lancia uno Scrivibile
		// poi crea due variabili intere e le confronta
		
		Scrivibile s = new Quarantadue();
		s.scrivi(100);

		IntVar1 v1 = new IntVar1();
		IntVar2 v2 = new IntVar2();
		if (confrontaVariabili(v1, v2))
			System.out.println("Aho, so' proprio uguali!!");
	}

}