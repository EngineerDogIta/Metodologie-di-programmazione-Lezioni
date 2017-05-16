package Pac1;

public class Vertebrato { // differenza fra modificatore public e default

	public int vertebre;
	boolean vola; // nessun modificatore di accesso: visibilit√ ristretta al
					// package

	public Vertebrato(int vertebre, boolean vola) {
		this.vertebre = vertebre;
		this.vola = vola;
	}

}