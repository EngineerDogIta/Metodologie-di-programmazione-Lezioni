package Pac1;

public class Tonno extends Vertebrato {
	
	public Tonno (int vertebre, boolean vola) {
		super(vertebre, vola);
	}
	
	public void stampaTonno () {
		System.out.print("questo tonno ha " + vertebre + " vertebre e");
		System.out.println((vola? " " : " non ") + "vola");
		// accede al campo package-restricted vola
	}

	public static void main (String[] args) { // crea e stampa due tonni
		
		Tonno T1 = new Tonno(40, false);
		Tonno T2 = new Tonno(1000, true); // tonno volante estremamente lungo
		T1.stampaTonno();
		T2.stampaTonno();
		
	}
}